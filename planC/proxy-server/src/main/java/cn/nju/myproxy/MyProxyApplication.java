package cn.nju.myproxy;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 16:32
 * @Description:
 */
@SpringBootApplication
@EnableTarsServer
public class MyProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyProxyApplication.class, args);
    }
}

