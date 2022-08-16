package com.Progard.FeignClient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClient2Application.class, args);
	}

}
