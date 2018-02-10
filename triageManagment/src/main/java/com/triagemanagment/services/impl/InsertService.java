package com.triagemanagment.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.repository.UserStoryRepository;
import com.triagemanagment.services.interfaces.IInsertService;

@Service
public class InsertService implements IInsertService{

	@Autowired
	private UserStoryRepository userStoryRepository;
	
	@Transactional
	public void insertUs(UserStory us) {
		
		userStoryRepository.saveAndFlush(us);
		
	}

}
