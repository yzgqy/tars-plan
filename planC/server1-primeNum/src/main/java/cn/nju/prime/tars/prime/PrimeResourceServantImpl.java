package cn.nju.prime.tars.prime;

import cn.nju.prime.tars.proxy.summation.SummationData;
import cn.nju.prime.tars.proxy.summation.SummationResourcePrx;
import com.qq.tars.common.support.Holder;
import com.qq.tars.spring.annotation.TarsServant;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:53
 * @Description:
 */
@TarsServant("PrimeObj")
public class PrimeResourceServantImpl implements PrimeResourceServant{
    @Autowired
    private SummationResourcePrx summationProxy;

    public boolean prime(int x){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(x);i++) {
            if(x%i==0) {
                flag=false;
            }
        }
        return flag;
    }

    @Override
    public Response isPrime(Holder<PrimeData> dataOut) {
        Response responseP = new Response();
        try {
            //            获取IP地址
            String ip = InetAddress.getLocalHost().getHostAddress();
            Holder<SummationData> summationDataHolder = new Holder<>();
            Response responseS = summationProxy.doSummation(summationDataHolder);
            if (responseS.getStatus() == 0) {
                responseP.setStatus(responseS.getStatus());
                responseP.setMsg(responseS.getMsg());
                return responseP;
            }

            int x = summationDataHolder.getValue().getX();
            int y = summationDataHolder.getValue().getY();
            int z = summationDataHolder.getValue().getZ();
            int sum = summationDataHolder.getValue().getSum();

            boolean myisPrime = prime(sum);


            responseP.setStatus(responseS.getStatus());
            responseP.setMsg(responseS.getMsg() + "-->判断质数(" + ip + ")");
            PrimeData primeData = new PrimeData();
            primeData.setMyIsPrime(myisPrime);
            primeData.setSum(sum);
            primeData.setX(x);
            primeData.setY(y);
            primeData.setZ(z);
            dataOut.setValue(primeData);
        }catch  (Exception e){
            responseP.setStatus(0);
            responseP.setMsg("ip获取错误");
    }
        return responseP;
    }
}
