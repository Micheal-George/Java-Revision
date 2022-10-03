package com.masai.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Tutorial;

public interface TutorialDAO extends JpaRepository<Tutorial, Integer>{

	

	List<Tutorial> getByStatus(String status);

	Tutorial getTutorialByTitleAndStatus(String title, String status);

	List<Tutorial> getTutorialByTitle(String title);

}
