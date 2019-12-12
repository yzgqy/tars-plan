//package cn.nju.tarstestclient.tars;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
///**
// * @Auther: yaya
// * @Date: 2019/8/2 12:44
// * @Description:
// */
//public class ClientTest {
//    /**
//     * 发送HttpPost请求
//     *
//     * @param strURL
//     *            服务地址
//     * @param params
//     *            json字符串,例如: "{ \"id\":\"12345\" }" ;其中属性名必须带双引号<br/>
//     * @return 成功:返回json字符串<br/>
//     */
//    public static String post(String strURL, String params) {
//        System.out.println(strURL);
//        System.out.println(params);
//        BufferedReader reader = null;
//        try {
//            URL url = new URL(strURL);// 创建连接
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoOutput(true);
//            connection.setDoInput(true);
//            connection.setUseCaches(false);
//            connection.setInstanceFollowRedirects(true);
//            connection.setRequestMethod("POST"); // 设置请求方式
//            // connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
////            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
//            connection.setRequestProperty("Content-Type", "text/plain"); // 设置发送数据的格式
//            connection.connect();
//            //一定要用BufferedReader 来接收响应， 使用字节来接收响应的方法是接收不到内容的
//            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "utf-8"); // utf-8编码
//            out.append(params);
//            out.flush();
//            out.close();
//            // 读取响应
//            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
//            String line;
//            String res = "";
//            while ((line = reader.readLine()) != null) {
//                res += line;
//            }
//            reader.close();
//            return res;
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return "error"; // 自定义错误信息
//    }
//}
