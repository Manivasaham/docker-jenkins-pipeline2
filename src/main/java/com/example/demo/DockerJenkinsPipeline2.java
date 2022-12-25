package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DockerJenkinsPipeline2 {


	public String message() { return "welcome to docker-jenkins intergation"; }
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsPipeline2.class, args);
	}

}
