package cn.nju.random.test;

import cn.nju.random.test.tars.random.RandomData;
import cn.nju.random.test.tars.random.RandomResourcePrx;
import cn.nju.random.test.tars.random.Response;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 11:32
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        String address = "TestTarsApp.RandomServer.RandomObj@tcp -h 47.110.147.92 -p 10022";
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        RandomResourcePrx proxy = communicator.stringToProxy(RandomResourcePrx.class, address);
        Holder<RandomData> dataOut = new Holder<>();
        Response response =  proxy.getRandomData(dataOut);
        System.out.println(response.getStatus()+"_"+response.getMsg());
        System.out.println(dataOut.getValue().getX()+"_"+dataOut.getValue().getY());
    }


}
