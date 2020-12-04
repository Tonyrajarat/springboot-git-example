package com.git.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootGitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitExampleApplication.class, args);
	}

}

@RestController
class GitController{

	@GetMapping("/message/{name}")
	public String welcome(@PathVariable String name){
		return "Welcome to Git Demo :: "+name;
	}
}
