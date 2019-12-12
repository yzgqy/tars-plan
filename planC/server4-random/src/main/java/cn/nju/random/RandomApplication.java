package cn.nju.random;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 10:34
 * @Description:
 */
@SpringBootApplication
@EnableTarsServer
public class RandomApplication {
    public static void main(String[] args) {
        SpringApplication.run(RandomApplication.class, args);
    }
}
