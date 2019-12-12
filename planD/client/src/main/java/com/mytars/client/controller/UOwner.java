package com.mytars.client.controller;

/**
 * @Auther: yaya
 * @Date: 2019/8/15 15:29
 * @Description:
 */
import com.mytars.client.tars.customers.Owner;
import lombok.Data;

@Data
public class UOwner {
    private String ownerId;
    private Owner owner;
}

