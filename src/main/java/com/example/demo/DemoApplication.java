package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableAspectJAutoProxy
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);
	}

}