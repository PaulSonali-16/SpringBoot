package com.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	private Map<String,Object> cachesss=new HashMap<String,Object>();

	private static final String Rest_URL="https://wwww.equifax.com/getScores";


	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		int a=10;
	}
	public void loadDataToCache(){
		//logic
	}
}


