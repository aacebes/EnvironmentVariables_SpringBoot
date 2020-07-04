package com.autentia.aacebes.envproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({GroupProperties.class})
public class EnvPropertiesApplication implements CommandLineRunner {

	@Autowired
	private IndividualProperties individualProperties;

	@Autowired
	private GroupProperties groupProperties;

	@Override
	public void run(String... args) {
		individualProperties.showMyself();
		groupProperties.showMyself();
	}

	public static void main(String[] args) {
		SpringApplication.run(EnvPropertiesApplication.class, args);
	}
}
