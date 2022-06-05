package com.example.customapp;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomAppApplication implements CommandLineRunner {

	@Autowired
	HelloService helloService;

	public static void main(String[] args) {
		SpringApplication.run(CustomAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello();
	}


	public HelloService helloService(){
		return new CustomHelloService();
	}
}
