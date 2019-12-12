package cn.nju.tarstest.tars.test;

import com.qq.tars.client.Communicator;
import com.qq.tars.client.CommunicatorConfig;
import com.qq.tars.client.CommunicatorFactory;
import com.qq.tars.server.config.ConfigurationManager;
import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/22 16:43
 * @Description:
 */
@TarsHttpService("HttpObj")
@RestController
public class TarsController {

    private String bigStr="dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
    private String smallStr="dddddddddddddddddddddddddddddddd";

    @PostMapping(path = "/test1")
    public String test1(@RequestBody String req){
        System.out.println(req);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return req;
        }

        return ip+"_"+req;
    }

    @PostMapping(path = "/test2/b2s")
    public String testB2S(@RequestBody String req){
        System.out.println(req);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return req;
        }

        return ip+"_"+smallStr;
    }

    @PostMapping(path = "/test3/s2b")
    public String testSB(@RequestBody String req){
        System.out.println(req);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return req;
        }

        return ip+"_"+bigStr;
    }
}
