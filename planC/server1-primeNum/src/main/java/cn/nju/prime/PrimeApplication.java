package cn.nju.prime;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 15:43
 * @Description:
 */
@SpringBootApplication
@EnableTarsServer
public class PrimeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrimeApplication.class, args);
    }

}
