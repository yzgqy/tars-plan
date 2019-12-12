package cn.nju.summation;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 14:58
 * @Description:
 */
@SpringBootApplication
@EnableTarsServer
public class SummateAppliction {
    public static void main(String[] args) {
        SpringApplication.run(SummateAppliction.class, args);
    }

}
