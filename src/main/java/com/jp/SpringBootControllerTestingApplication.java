package com.jp;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootControllerTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootControllerTestingApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMappe() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
