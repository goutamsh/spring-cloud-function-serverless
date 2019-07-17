package com.gshepur.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionServerlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionServerlessApplication.class, args);
	}

	@Bean
	public Function<String, String> reverseString() {
		return value -> new StringBuilder(value).reverse().toString();
	}
}
