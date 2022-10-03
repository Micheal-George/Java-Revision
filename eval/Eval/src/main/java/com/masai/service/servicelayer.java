package com.masai.service;

import java.util.List;

import com.masai.Exception.TutorialAlreadyPresent;
import com.masai.Exception.TutorialNotFound;
import com.masai.model.Tutorial;

public interface servicelayer {
	
	public Tutorial addTutorial(Tutorial tutorial) throws TutorialAlreadyPresent;
	
	public List<Tutorial> getAllTutorial() throws TutorialNotFound;
	
	public Tutorial getTutorialById(Integer id) throws TutorialNotFound;
	
	public Tutorial updateTutorial(Tutorial tutorial,Integer id) throws TutorialNotFound;
	
    public boolean deleteTutorialById(Integer id) throws TutorialNotFound;
    
    public boolean deleteAllTutorial() throws TutorialNotFound;
    
    public List<Tutorial> getAllPublishedTutorial(String status) throws TutorialNotFound;
    
    public List<Tutorial> getByTitle(String title) throws TutorialNotFound;
}
