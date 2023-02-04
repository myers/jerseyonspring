package com.example.wstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WstutorialApplication
		extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WstutorialApplication.class, args);
	}

}
