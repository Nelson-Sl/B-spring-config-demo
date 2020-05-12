package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringConfigApplication implements ApplicationRunner {

//	@Value("foobar")
	@Value("${foobar}")
//	private String foobar;
	private int foobar;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("foobar is " + foobar);
	}
}
