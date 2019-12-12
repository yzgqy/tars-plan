package cn.nju.prime.tars.proxy;

import cn.nju.prime.tars.proxy.summation.SummationResourcePrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:52
 * @Description:
 */
@Configuration
public class SummationProxy {
    @Bean("PrimeServant")
    public SummationResourcePrx getPrx(){
//        String address = "TestTarsApp.SummationServer.SummationObj@tcp -h 121.43.191.226 -p 10021";
        String address = "TestTarsApp.SummationServer.SummationObj";
//        CommunicatorConfig cfg = new CommunicatorConfig();
        CommunicatorConfig cfg = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        SummationResourcePrx proxy = communicator.stringToProxy(SummationResourcePrx.class, address);
        return proxy;
    }
}
