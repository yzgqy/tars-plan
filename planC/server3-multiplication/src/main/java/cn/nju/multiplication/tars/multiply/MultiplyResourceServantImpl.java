package cn.nju.multiplication.tars.multiply;

import cn.nju.multiplication.tars.proxy.random.RandomData;
import cn.nju.multiplication.tars.proxy.random.RandomResourcePrx;
import com.qq.tars.common.support.Holder;
import com.qq.tars.spring.annotation.TarsServant;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 11:53
 * @Description:
 */

@TarsServant("MultiplyObj")
public class MultiplyResourceServantImpl implements MultiplyResourceServant{
    @Autowired
    private RandomResourcePrx randomProxy;

    public int multiply(int x,int y){
        return x*y;
    }

    @Override
    public Response doMultiply(Holder<MultiplyData> dataOut) {
        Response responseM = new Response();
        try {
            //            获取IP地址
            String ip = InetAddress.getLocalHost().getHostAddress();
            Holder<RandomData> randomDataOut = new Holder<>();
            Response responseR = randomProxy.getRandomData(randomDataOut);
            if(responseR.getStatus()==0) {
                responseM.setStatus(responseR.getStatus());
                responseM.setMsg(responseR.getMsg());
                return responseM;
            }
            int x = randomDataOut.getValue().getX();
            int y = randomDataOut.getValue().getY();
            int z = multiply(x, y);

            responseM.setStatus(responseR.getStatus());
            responseM.setMsg(responseR.getMsg() + "-->乘操作(" + ip + ")");

            MultiplyData multiplyData = new MultiplyData();
            multiplyData.setX(x);
            multiplyData.setY(y);
            multiplyData.setZ(z);
            dataOut.setValue(multiplyData);
        }catch  (Exception e){
            responseM.setStatus(0);
            responseM.setMsg("ip获取错误");
        }
        return responseM;
    }
}
