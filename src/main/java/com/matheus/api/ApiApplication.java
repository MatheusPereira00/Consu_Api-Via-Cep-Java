package com.matheus.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		String response = restTemplate.getForObject("https://dummyjson.com/products", String.class);

		System.out.println(response);
	}

}
