package cn.nju.prime.test.tars;

import cn.nju.prime.tars.prime.PrimeData;
import cn.nju.prime.tars.prime.Response;
import cn.nju.prime.tars.proxy.summation.SummationData;
import cn.nju.prime.tars.proxy.summation.SummationResourcePrx;
import cn.nju.prime.test.tars.prime.PrimeResourcePrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 16:12
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String address = "TestTarsApp.PrimeServer.PrimeObj@tcp -h 121.43.191.226 -p 10023";
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        PrimeResourcePrx proxy = communicator.stringToProxy(PrimeResourcePrx.class, address);
        Holder<PrimeData> dataOut = new Holder<>();
        Response response =  proxy.isPrime(dataOut);
        System.out.println(response.getStatus()+"_"+response.getMsg());
        System.out.println(dataOut.getValue().getX()+"_"+dataOut.getValue().getY()
                +"_"+dataOut.getValue().getZ()+"_"+dataOut.getValue().getSum()+"_"+dataOut.getValue().getMyIsPrime());
    }
}