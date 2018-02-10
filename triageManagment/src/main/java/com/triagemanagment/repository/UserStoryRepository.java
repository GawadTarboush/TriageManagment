package com.triagemanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triagemanagment.model.impl.UserStory;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, String>{
	
}
