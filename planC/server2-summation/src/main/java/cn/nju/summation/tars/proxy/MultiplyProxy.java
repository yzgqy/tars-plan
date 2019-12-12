package cn.nju.summation.tars.proxy;

import cn.nju.summation.tars.proxy.multiply.MultiplyResourcePrx;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:04
 * @Description:
 */
@Configuration
public class MultiplyProxy {
    @Bean("MultiplyPrx")
    public MultiplyResourcePrx getPrx(){
//        String address = "TestTarsApp.MultiplyServer.MultiplyObj@tcp -h 47.110.147.92 -p 10020";
        String address = "TestTarsApp.MultiplyServer.MultiplyObj";
//        CommunicatorConfig cfg = new CommunicatorConfig();
        CommunicatorConfig cfg = ConfigurationManager.getInstance().getServerConfig().getCommunicatorConfig();
        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
        MultiplyResourcePrx proxy = communicator.stringToProxy(MultiplyResourcePrx.class, address);
        return proxy;
    }
}
