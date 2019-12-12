package cn.nju.tarstestclient;

import cn.nju.tarstestclient.tars.test.TestPrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import com.qq.tars.spring.annotation.TarsClient;
import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: yaya
 * @Date: 2019/8/1 16:34
 * @Description:
 */
@TarsHttpService("HttpObj")
@RestController
public class TestController {
//    @PostMapping(value = "/test")
//    public String test1(@RequestBody String req) {
//        CommunicatorConfig cfg = new CommunicatorConfig();
////        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator("tars.tarsregistry.QueryObj@tcp -h 47.99.138.113 -p 17890");
//        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        TestPrx proxy = communicator.stringToProxy(TestPrx.class,address);
//        return proxy.testString(req);
//    }
//
//    @TarsClient(name = "TestTarsApp.TestServer.TestObj")
//    @TarsClient(name = "PetclinicApp.VetsServer.VetsObj", value = "PetclinicApp.VetsServer.VetsObj")
//    private TestPrx proxy;

    @PostMapping(path = "/test1")
    public String test1(@RequestBody String req){
        CommunicatorConfig cfg1 = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg1);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, "TestTarsApp.TestServer.TestObj");
        return proxy.testString(req);
    }

    @PostMapping(path = "/test2/b2s")
    public String testB2S(@RequestBody String req){
        CommunicatorConfig cfg1 = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg1);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, "TestTarsApp.TestServer.TestObj");
        return proxy.testB2S(req);
    }

    @PostMapping(path = "/test3/s2b")
    public String testSB(@RequestBody String req){
        CommunicatorConfig cfg1 = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg1);
        TestPrx proxy = communicator.stringToProxy(TestPrx.class, "TestTarsApp.TestServer.TestObj");
        return proxy.testS2B(req);
    }


}
