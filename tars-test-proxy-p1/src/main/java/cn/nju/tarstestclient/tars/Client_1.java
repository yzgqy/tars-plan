//package cn.nju.tarstestclient.tars;
//
//import cn.nju.tarstestclient.tars.test.TestPrx;
//import com.qq.tars.client.Communicator;
//import com.qq.tars.client.CommunicatorConfig;
//import com.qq.tars.client.CommunicatorFactory;
//import org.openjdk.jmh.annotations.*;
//import org.openjdk.jmh.infra.Blackhole;
//import org.openjdk.jmh.runner.Runner;
//import org.openjdk.jmh.runner.RunnerException;
//import org.openjdk.jmh.runner.options.Options;
//import org.openjdk.jmh.runner.options.OptionsBuilder;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @Auther: yaya
// * @Date: 2019/8/1 14:34
// * @Description:
// */
//@State(Scope.Thread)
//@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(1)
//@BenchmarkMode(Mode.All)
//@OutputTimeUnit(TimeUnit.MILLISECONDS)
//public class Client_1 {
//    @State(Scope.Thread)
//    public class Param{
//        String big = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//        String small="dddddddddddddddddddddddddddddddd";
//        String address = "TestTarsApp.TestServer.TestObj@tcp -h 172.16.24.194 -p 10010";
//    }
//    public static void main(String[] args) throws RunnerException {
//        Options opt = new OptionsBuilder()
//                .include(Client_1.class.getSimpleName())
//                .forks(1)
//                .build();
//
//        new Runner(opt).run();
//    }
//
//    @Benchmark
//    public void BRQ2SRP(Blackhole bh){
//        Param param = new Param();
//        CommunicatorConfig cfg = new CommunicatorConfig();
//        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        TestPrx proxy = communicator.stringToProxy(TestPrx.class, param.address);
//        String bsTest = proxy.testSmall(param.big);
//        bh.consume(bsTest);
//    }
//    @Benchmark
//    public void SRQ2BRP(Blackhole bh){
//        Param param = new Param();
//        CommunicatorConfig cfg = new CommunicatorConfig();
//        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        TestPrx proxy = communicator.stringToProxy(TestPrx.class, param.address);
//        String sbTest  = proxy.testBig(param.small);
//        bh.consume(sbTest);
//    }
//    @Benchmark
//    public void BRQ2BRP(Blackhole bh){
//        Param param = new Param();
//        CommunicatorConfig cfg = new CommunicatorConfig();
//        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        TestPrx proxy = communicator.stringToProxy(TestPrx.class, param.address);
//        String bbTest  = proxy.testBig(param.big);
//        bh.consume(bbTest);
//    }
//    @Benchmark
//    public void SRQ2SRP(Blackhole bh){
//        Param param = new Param();
//        CommunicatorConfig cfg = new CommunicatorConfig();
//        Communicator communicator = CommunicatorFactory.getInstance().getCommunicator(cfg);
//        TestPrx proxy = communicator.stringToProxy(TestPrx.class, param.address);
//        String ssTest  = proxy.testSmall(param.small);
//        bh.consume(ssTest);
//    }
//
//
//}
