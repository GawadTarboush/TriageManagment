package com.triagemanagment.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.repository.UserStoryRepository;
import com.triagemanagment.services.interfaces.IUserStoryUtils;

public class UserStoryUtils implements IUserStoryUtils {

	@Autowired
	private UserStoryRepository userStoryRepository;
	
	@Autowired
	KafkaProducer producer;
	
	@Override
	public UserStory getById(String id) {

		return (UserStory)userStoryRepository.getOne(id);
	}

	@Transactional
	public void insertUs(UserStory us) {
		
		userStoryRepository.saveAndFlush(us);
		producer.send(us.getId());
		
	}

	@Override
	public void deleteById(String id) 
	{
		userStoryRepository.delete(id);
		
	}
	
}
