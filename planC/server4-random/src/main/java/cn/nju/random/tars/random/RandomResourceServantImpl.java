package cn.nju.random.tars.random;

import com.qq.tars.common.support.Holder;
import com.qq.tars.spring.annotation.TarsServant;

import java.net.InetAddress;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 11:09
 * @Description:
 */
@TarsServant("RandomObj")
public class RandomResourceServantImpl implements RandomResourceServant{
    public RandomData getRandomData() {
        int num1=(int)(Math.random()*9000)+1000;
        int num2=(int)(Math.random()*9000)+1000;
        RandomData data = new RandomData();
        data.setX(num1);
        data.setY(num2);
        return data;
    }

    @Override
    public Response getRandomData(Holder<RandomData> dataOut) {
        Response res = new Response();
        try {
//            获取IP地址
        String ip = InetAddress.getLocalHost().getHostAddress();
        res.setStatus(1);
        res.setMsg("生成随机数("+ip+")");
        dataOut.setValue(getRandomData());
        } catch (Exception e){
            res.setStatus(0);
            res.setMsg("ip获取错误");
        }
        return res;
    }
}
