package cn.nju.multiplication;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 10:45
 * @Description:
 */
@SpringBootApplication
@EnableTarsServer
public class MultiplicationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiplicationApplication.class, args);
    }

}
