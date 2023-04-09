package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	private static final String Rest_URL="https://wwww.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		int a=10;
	}

}
