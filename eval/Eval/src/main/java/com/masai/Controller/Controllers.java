package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.TutorialAlreadyPresent;
import com.masai.Exception.TutorialNotFound;
import com.masai.model.Tutorial;
import com.masai.service.servicelayer;

@RestController
@RequestMapping("/tutorials")
public class Controllers {
	@Autowired
	servicelayer service;
	
	@PostMapping
	public Tutorial addtutorial(@RequestBody Tutorial tutorial) throws TutorialAlreadyPresent
	{
		return service.addTutorial(tutorial);
	}
	
	@GetMapping
	public List<Tutorial> getAllTutorial() throws TutorialNotFound
	{
		return service.getAllTutorial();
	}
	
	@GetMapping("/{id}/")
	public Tutorial gettutorialByid(@PathVariable("id") Integer id) throws TutorialNotFound
	{
		return service.getTutorialById(id);
	}
	
	
	
	 @PutMapping("/{id}")
	public Tutorial updateTutorial(@RequestBody Tutorial tutorial,@PathVariable("id") Integer id) throws TutorialNotFound
	{
		return service.updateTutorial(tutorial, id);
	}
	 
	 @DeleteMapping("/{id}")
	 public boolean deleteTutorial(@PathVariable("id") Integer id) throws TutorialNotFound
	 {
		 return service.deleteTutorialById(id);
	 }
	 
	 @DeleteMapping
	 public boolean deleteAllTutorial() throws TutorialNotFound
	 {
		 return service.deleteAllTutorial();
	 }
	 
	 @GetMapping("/{published}")
	 public List<Tutorial> getAllDataByPublished(@PathVariable("published") String published) throws TutorialNotFound 
	 {
		 return service.getAllPublishedTutorial(published);
	 }
	 
	 @GetMapping("/")
	 public List<Tutorial> getAllTutotrialwithTitle(@RequestParam("title") String title) throws TutorialNotFound
	 {
		 return service.getByTitle(title);
	 }


}
