package com.nb.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbPriceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbPriceApiApplication.class, args);
		System.err.println("============= Price Api 启动完成 ============");
	}

}
