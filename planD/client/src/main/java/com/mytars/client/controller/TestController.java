//package com.mytars.client.controller;
//
//import com.mytars.client.tars.vets.Vet;
//import com.mytars.client.tars.vets.VetResourcePrx;
//import com.qq.tars.spring.annotation.TarsClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @Auther: yaya
// * @Date: 2019/6/22 17:10
// * @Description:
// */
//
////@TarsHttpService("MyHttpObj")
//@RestController
//public class TestController {
////    @Autowired
////    private Client client;
//    @TarsClient("PetclinicApp.VetsServer.VetsObj")
//    private VetResourcePrx proxy;
//
//    @RequestMapping(path = "/test")
//    public String test1() {
//        return "hello world";
//    }
//
//    @RequestMapping(path = "/vets")
//    public List<Vet> test2() {
//        return proxy.showResourcesVetList();
//    }
//}
