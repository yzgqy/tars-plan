package cn.nju.tarstestclient;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTarsServer
public class TarsTestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TarsTestClientApplication.class, args);
    }

}
