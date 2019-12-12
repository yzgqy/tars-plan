package cn.nju.summation.test.tars.summation;

import cn.nju.summation.tars.proxy.multiply.MultiplyData;
import cn.nju.summation.tars.proxy.multiply.MultiplyResourcePrx;
import cn.nju.summation.tars.summation.Response;
import cn.nju.summation.tars.summation.SummationData;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:17
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String address = "TestTarsApp.SummationServer.SummationObj@tcp -h 47.110.147.92 -p 10023";
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        SummationResourcePrx proxy = communicator.stringToProxy(SummationResourcePrx.class, address);
        Holder<SummationData> dataOut = new Holder<>();
        Response response =  proxy.doSummation(dataOut);
        System.out.println(response.getStatus()+"_"+response.getMsg());
        System.out.println(dataOut.getValue().getX()+"_"+dataOut.getValue().getY()
                +"_"+dataOut.getValue().getZ()+"_"+dataOut.getValue().getSum());
    }
}
