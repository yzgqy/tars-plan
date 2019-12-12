package cn.nju.summation.tars.summation;

import cn.nju.summation.tars.proxy.multiply.MultiplyData;
import cn.nju.summation.tars.proxy.multiply.MultiplyResourcePrx;
import com.qq.tars.common.support.Holder;
import com.qq.tars.spring.annotation.TarsServant;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:08
 * @Description:
 */
@TarsServant("SummationObj")
public class SummationResourceServantImpl implements SummationResourceServant{
    @Autowired
    private MultiplyResourcePrx multiplyPrx;

    public int add(int a, int b, int c){
        return a+b+c;
    }

    @Override
    public Response doSummation(Holder<SummationData> dataOut) {
        Response responseS = new Response();
        try {
            //            获取IP地址
            String ip = InetAddress.getLocalHost().getHostAddress();
            Holder<MultiplyData> multiplyDataOut = new Holder<>();
            Response responseM = multiplyPrx.doMultiply(multiplyDataOut);
            if (responseM.getStatus() == 0) {
                responseS.setStatus(responseM.getStatus());
                responseS.setMsg(responseM.getMsg());
                return responseS;
            }
            int x = multiplyDataOut.getValue().getX();
            int y = multiplyDataOut.getValue().getY();
            int z = multiplyDataOut.getValue().getZ();
            int sum = add(x, y, z);

            responseS.setMsg(responseM.getMsg() + "-->加操作("+ip+")");
            responseS.setStatus(responseM.getStatus());
            SummationData sumData = new SummationData();
            sumData.setX(x);
            sumData.setY(y);
            sumData.setZ(z);
            sumData.setSum(sum);
            dataOut.setValue(sumData);
        }catch  (Exception e){
            responseS.setStatus(0);
            responseS.setMsg("ip获取错误");
        }
        return responseS;
    }
}
