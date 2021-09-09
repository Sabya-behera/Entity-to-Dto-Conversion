package com.example.demo15;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo15Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo15Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){return new ModelMapper();}
}
