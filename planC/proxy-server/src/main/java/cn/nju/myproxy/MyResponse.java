package cn.nju.myproxy;

import com.qq.tars.protocol.tars.annotation.TarsStructProperty;

/**
 * @Auther: yaya
 * @Date: 2019/8/7 16:38
 * @Description:
 */
public class MyResponse<T> {
    public int status ;
    public String msg;
    private T data;

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
