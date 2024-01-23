package com.project.CMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class Cms2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cms2Application.class, args);
	}

}
