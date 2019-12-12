package cn.nju.tarstest;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTarsServer
public class TarsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TarsTestApplication.class, args);
    }

}
