package com.cicd.springboot.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello! CI/CD pipeline for this Spring Boot is created using GitHub Actions";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
