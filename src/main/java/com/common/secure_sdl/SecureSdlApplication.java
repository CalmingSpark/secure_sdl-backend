package com.common.secure_sdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
public class SecureSdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureSdlApplication.class, args);
	}
}
