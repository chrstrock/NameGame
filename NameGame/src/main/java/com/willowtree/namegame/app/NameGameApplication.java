package com.willowtree.namegame.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;


import com.willowtree.namegame.web.entity.Profile;

@SpringBootApplication
public class NameGameApplication {

	private static final Logger log = LoggerFactory.getLogger(NameGameApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(NameGameApplication.class, args);
	}

	/**
	 * rest template for the Profile class to consume API.
	 * @param builder
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	//command line runner to see consuming of Profile API from WillowTree
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception
	{
		return args -> {
			
		};
	}
}
