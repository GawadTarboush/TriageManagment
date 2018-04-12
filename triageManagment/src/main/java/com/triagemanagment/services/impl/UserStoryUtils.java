package com.triagemanagment.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.repository.UserStoryRepository;
import com.triagemanagment.services.interfaces.IGetUserStoryById;

public class GetUserStoryById implements IGetUserStoryById {

	@Autowired
	private UserStoryRepository userStoryRepository;
	@Override
	public UserStory getById(String id) {

		return (UserStory)userStoryRepository.getOne(id);
	}

}
