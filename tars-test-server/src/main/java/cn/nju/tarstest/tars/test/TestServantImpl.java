package cn.nju.tarstest.tars.test;

import com.qq.tars.spring.annotation.TarsServant;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/1 11:45
 * @Description:
 */
@TarsServant("TestObj")
public class TestServantImpl implements TestServant{

    private String bigStr="dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
    private String smallStr="dddddddddddddddddddddddddddddddd";

    @Override
    public String testString(String msg) {
        System.out.println(msg);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return msg;
        }

        return ip+"_"+msg;
    }

    @Override
    public String testB2S(String msg) {
        System.out.println(msg);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return msg;
        }

        return ip+"_"+smallStr;
    }

    @Override
    public String testS2B(String msg) {
        System.out.println(msg);
        String ip = "";
        try {
//            获取IP地址
            ip = InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return msg;
        }

        return ip+"_"+bigStr;
    }
}
