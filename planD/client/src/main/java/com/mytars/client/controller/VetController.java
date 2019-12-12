package com.mytars.client.controller;

import com.mytars.client.tars.vets.Vet;
import com.mytars.client.tars.vets.VetResourcePrx;
import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: yaya
 * @Date: 2019/6/22 17:23
 * @Description:
 */
@TarsHttpService("VetHttpObj")
@RequestMapping("/vets")
@RestController
public class VetController {
    @Autowired
    private VetResourcePrx vetResourcePrx;

    @GetMapping
    public List<Vet> showResourcesVetList() {
        return vetResourcePrx.showResourcesVetList();
    }
}
