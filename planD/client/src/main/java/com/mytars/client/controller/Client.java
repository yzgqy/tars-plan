//package com.mytars.client.controller;
//
//import com.mytars.client.tars.vets.Vet;
//import com.mytars.client.tars.vets.VetResourcePrx;
//import com.qq.tars.spring.annotation.TarsClient;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * @Auther: yaya
// * @Date: 2019/7/22 19:15
// * @Description:
// */
//@Component
//public class Client {
//
//    @TarsClient("PetclinicApp.VetsServer.VetsObj")
//    private VetResourcePrx proxy;
//
//    public List<Vet> get() {
//        return proxy.showResourcesVetList();
//    }
//}
