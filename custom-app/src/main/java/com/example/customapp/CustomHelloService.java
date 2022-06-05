package com.example.customapp;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class CustomHelloService implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Hello From CustomApplication");
    }
}
