package com.triagemanagment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.model.interfaces.IUserStory;
import com.triagemanagment.services.impl.GetUserStoryById;
import com.triagemanagment.services.impl.InsertService;
import com.triagemanagment.services.interfaces.IGetUserStoryById;
import com.triagemanagment.services.interfaces.IInsertService;

@Configuration
public class ConfigBeans {

	@Bean
	public IUserStory userStory() {
		return new UserStory();
	}
	
	@Bean
	public IInsertService insertService() {
		return new InsertService();
	}
	
	@Bean
	public IGetUserStoryById getUserStoryById() {
		return new GetUserStoryById();
	}
}
