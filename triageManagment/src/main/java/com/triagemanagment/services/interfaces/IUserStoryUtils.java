package com.triagemanagment.services.interfaces;

import org.springframework.stereotype.Service;

import com.triagemanagment.model.impl.UserStory;

@Service
public interface IUserStoryUtils {

	public void insertUs(UserStory us);
	
	public UserStory getById(String id);

	public void deleteById(String id); 
}
