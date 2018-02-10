package com.triagemanagment.services.interfaces;

import org.springframework.stereotype.Service;

import com.triagemanagment.model.impl.UserStory;

@Service
public interface IInsertService {

	public void insertUs(UserStory us);
}
