package com.clientFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientFrontApplication.class, args);
//		System.out.println("Hello");
		HelloWorld hd = new HelloWorld();
		hd.gretting();
	}
}
