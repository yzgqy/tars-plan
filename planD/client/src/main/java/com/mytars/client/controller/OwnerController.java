package com.mytars.client.controller;

import com.alibaba.fastjson.JSON;
import com.mytars.client.tars.customers.Owner;
import com.mytars.client.tars.customers.OwnerResourcePrx;
import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Auther: yaya
 * @Date: 2019/6/22 17:23
 * @Description:
 */
@TarsHttpService("OwnerHttpObj")
@RequestMapping("/owners")
@RestController
public class OwnerController {
    @Autowired
    private OwnerResourcePrx ownerResourcePrx;

    /**
     * Create Owner
     */
    @PostMapping("/addOwner")
    @ResponseStatus(HttpStatus.CREATED)
    public Owner createOwner(@RequestBody String tmp) {
        Owner owner = JSON.parseObject(tmp, Owner.class);
        return ownerResourcePrx.createOwner(owner);
    }

    /**
     * Read single Owner
     */
    @PostMapping(value = "/someone")
    public Owner findOwner(@RequestBody String ownerId) {
        return ownerResourcePrx.findOwner(Integer.valueOf(ownerId));
    }

    /**
     * Read List of Owners
     */
    @GetMapping("/getAll")
    public List<Owner> findAll() {
        return ownerResourcePrx.findAll();
    }

    /**
     * Update Owner
     */
    @PutMapping("/update")
    public void updateOwner(@RequestBody String tmp) {
        UOwner uOwner = JSON.parseObject(tmp, UOwner.class);

        ownerResourcePrx.updateOwner(Integer.valueOf(uOwner.getOwnerId()),uOwner.getOwner());
    }
}
