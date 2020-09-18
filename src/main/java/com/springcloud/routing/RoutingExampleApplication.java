package com.springcloud.routing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
@SpringBootApplication
public class RoutingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingExampleApplication.class, args);
	}
	
	@Value("${message:Default message}")
	private String message;
	
	@RequestMapping(value = "/available")
	public String available() {
		return this.message;
	}
	
	@RequestMapping(value = "/checkout")
	public String checkout() {
		return "This is checkout response";		
	}	

}
