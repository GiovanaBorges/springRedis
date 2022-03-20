package com.springredis.springredis.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    //add ao  cache
    @Cacheable("hello")
    public String hello(){
     System.out.println("Sem cache");
     return "hello world";
    }

    @GetMapping("/cancel")
    //limpa o cache
    @CacheEvict("hello")
    public String cancel(){
        System.out.println("Limpando o cache");
        return "Cache cancelado";
    }
}
