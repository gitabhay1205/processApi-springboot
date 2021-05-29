package com.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentConfiguration {

	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
