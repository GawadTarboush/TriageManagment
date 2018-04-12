package com.triagemanagment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.model.interfaces.IUserStory;
import com.triagemanagment.services.impl.UserStoryUtils;
import com.triagemanagment.services.interfaces.IUserStoryUtils;

@Configuration
public class ConfigBeans {

	@Bean
	public IUserStory userStory() {
		return new UserStory();
	}
	

	@Bean
	public IUserStoryUtils getUserStoryUtils() {
		return new UserStoryUtils();
	}
}
