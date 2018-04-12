package com.triagemanagment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.triagemanagment.model.impl.UserStory;
import com.triagemanagment.services.interfaces.IUserStoryUtils;

@Controller
public class TriageController {
	 
	 
	 @Autowired
	 private IUserStoryUtils userStoryUtils;
	 
	 @Autowired
	 private static final Logger logger =  LoggerFactory.getLogger(TriageController.class);
	 
	 	@CrossOrigin(origins = "http://localhost:8000")
	 	@RequestMapping(value = "/insertUs", method = RequestMethod.POST, consumes = {"application/json"})
	    public ResponseEntity<String> newUserStory(@RequestBody UserStory us) {
	 		logger.info("Inserting the following:");
	 		logger.info("us.getId() :" + us.getId());
	 		logger.info("us.getExtSystems() :" + us.getExtSystems());
	 		userStoryUtils.insertUs(us);
	         return new ResponseEntity<String>("US updated successfuly!", HttpStatus.OK);
	    }
	 	
	 	@CrossOrigin(origins = "http://localhost:8000")
	 	@GetMapping(value = "/getUsById/{id}")
	 	public @ResponseBody ResponseEntity<UserStory> getUserStoriesById(@PathVariable("id") String id) {
	 		logger.info("Fetching User with id {}", id);
	 		UserStory response = userStoryUtils.getById(id);
	 		return new ResponseEntity<UserStory>(response, HttpStatus.OK);
	 	}
	 	
	 	@RequestMapping(value = "/")
	 	public String index() {
	 		return "index";
	 	}
	 	
	 	
	 	@CrossOrigin(origins = "http://localhost:8000")
	 	@GetMapping(value = "/deleteUserStoriesById/{id}")
	 	public @ResponseBody ResponseEntity<UserStory> deleteUserStoriesById(@PathVariable("id") String id) {
	 		logger.info("Removing User with id {}", id);
	 		UserStory response = userStoryUtils.getById(id);
	 		if (response==null)
	 		{
	 			return new ResponseEntity<UserStory>(response, HttpStatus.NOT_FOUND);
	 		}
	 		return new ResponseEntity<UserStory>(response, HttpStatus.OK);
	 	}
	 	
	 	
	 	
}
