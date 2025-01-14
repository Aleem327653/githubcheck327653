package com.nexon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(GithubTestApplication.class, args);
		System.out.println("Project is Working");
	}

}
