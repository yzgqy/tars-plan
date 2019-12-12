package cn.nju.myproxy.tars;

import cn.nju.myproxy.tars.prime.PrimeResourcePrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 16:36
 * @Description:
 */
@Configuration
public class PrimeProxy {
    @Bean("PrimeServant")
    public PrimeResourcePrx getPrx(){
//        String address = "TestTarsApp.PrimeServer.PrimeObj@tcp -h 47.110.147.92 -p 10021";
        String address = "TestTarsApp.PrimeServer.PrimeObj";
//        CommunicatorConfig cfg = new CommunicatorConfig();
        CommunicatorConfig cfg = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        PrimeResourcePrx proxy = communicator.stringToProxy(PrimeResourcePrx.class, address);
        return proxy;
    }
}
