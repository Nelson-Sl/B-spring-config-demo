package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoSpringConfigApplication implements ApplicationRunner {

	@Autowired
	private final Environment env;

	@Autowired
	private final ConfigurableEnvironment configurableEnv;

	public DemoSpringConfigApplication(Environment env, ConfigurableEnvironment configurableEnv) {
		this.env = env;
		this.configurableEnv = configurableEnv;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		configurableEnv.getSystemProperties().forEach((key, value) -> System.out.println(key + ": " + value));
		System.out.println("foobar is " + env.getProperty("foobar"));
	}
}
