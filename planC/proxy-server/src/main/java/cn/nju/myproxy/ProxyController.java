package cn.nju.myproxy;

import cn.nju.myproxy.tars.prime.PrimeData;
import cn.nju.myproxy.tars.prime.PrimeResourcePrx;
import cn.nju.myproxy.tars.prime.Response;
import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.common.support.Holder;
import com.qq.tars.protocol.tars.annotation.TarsStructProperty;
import com.qq.tars.server.config.ConfigurationManager;
import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 16:34
 * @Description:
 */
@TarsHttpService("HttpObj")
@RestController
public class ProxyController {
    @Autowired
    private PrimeResourcePrx primeResourcePrx;

    @GetMapping(path = "/test")
    public MyResponse<PrimeData> test(){
        Holder<PrimeData> dataOut = new Holder<>();
        Response response = primeResourcePrx.isPrime(dataOut);

        MyResponse<PrimeData> myResponse = new MyResponse<>();
        myResponse.setStatus(response.getStatus());
        myResponse.setMsg(response.getMsg());
        myResponse.setData(dataOut.getValue());
        return myResponse;
    }
}
