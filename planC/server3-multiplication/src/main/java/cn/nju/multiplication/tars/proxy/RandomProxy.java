package cn.nju.multiplication.tars.proxy;

import cn.nju.multiplication.tars.proxy.random.RandomResourcePrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 12:01
 * @Description:
 */
@Configuration
public class RandomProxy {
    @Bean("RandomPrx")
    public RandomResourcePrx getPrx(){
//        String address = "TestTarsApp.RandomServer.RandomObj@tcp -h 121.43.191.226 -p 10020";
        String address = "TestTarsApp.RandomServer.RandomObj";
//        CommunicatorConfig cfg = new CommunicatorConfig();
        CommunicatorConfig cfg = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        RandomResourcePrx proxy = communicator.stringToProxy(RandomResourcePrx.class, address);
        return proxy;
    }
}
