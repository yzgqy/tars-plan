package cn.nju.tarstestclient;

import cn.nju.tarstestclient.tars.test.TestPrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: yaya
 * @Date: 2019/8/1 16:34
 * @Description:
 */
@RestController
public class TestController {

    String address = "TestTarsApp.TestServer.TestObj@tcp -h 172.16.24.194 -p 10010";
    @PostMapping(path = "/test1")
    public String test1(@RequestBody String req){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, address);
        return proxy.testString(req);
    }

    @PostMapping(path = "/test2/b2s")
    public String testB2S(@RequestBody String req){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, address);
        return proxy.testB2S(req);
    }

    @PostMapping(path = "/test3/s2b")
    public String testSB(@RequestBody String req){
        CommunicatorConfig cfg = new CommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, address);
        return proxy.testS2B(req);
    }
}
