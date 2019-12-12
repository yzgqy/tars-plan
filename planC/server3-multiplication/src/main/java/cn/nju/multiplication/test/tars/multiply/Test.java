package cn.nju.multiplication.test.tars.multiply;

import cn.nju.multiplication.tars.multiply.MultiplyData;
import cn.nju.multiplication.tars.multiply.Response;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 12:15
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String address = "TestTarsApp.MultiplyServer.MultiplyObj@tcp -h 121.43.191.226 -p 10022";
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        MultiplyResourcePrx proxy = communicator.stringToProxy(MultiplyResourcePrx.class, address);
        Holder<MultiplyData> dataOut = new Holder<>();
        Response response =  proxy.doMultiply(dataOut);
        System.out.println(response.getStatus()+"_"+response.getMsg());
        System.out.println(dataOut.getValue().getX()+"_"+dataOut.getValue().getY()+"_"+dataOut.getValue().getZ());
    }
}
