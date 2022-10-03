package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.TutorialAlreadyPresent;
import com.masai.Exception.TutorialNotFound;
import com.masai.model.Tutorial;
import com.masai.repositry.TutorialDAO;

@Service
public class servicelayerIMPL implements servicelayer {
	
	@Autowired
	TutorialDAO tdao;



	@Override
	public List<Tutorial> getAllTutorial() throws TutorialNotFound {
		List<Tutorial> tut=tdao.findAll();
		 if(tut.size()!=0)
			 return tut;
		
		 throw new TutorialNotFound("No data");
		 
	}

	@Override
	public Tutorial getTutorialById(Integer id) throws TutorialNotFound {
		 Optional<Tutorial> opt=tdao.findById(id);
		 if(opt.isPresent())
			 return opt.get();
		 throw new TutorialNotFound("No Tutorial with the id :"+id);
	}

	

	@Override
	public boolean deleteTutorialById(Integer id) throws TutorialNotFound {
		 Optional<Tutorial> opt=tdao.findById(id);
		 if(opt.isPresent())
		 {
			 tdao.delete(opt.get());
			 return true;
		 }
		return false;
	}

	@Override
	public boolean deleteAllTutorial() throws TutorialNotFound {
		List<Tutorial> tut=tdao.findAll();
		 if(tut.size()!=0)
		 {
			 tdao.deleteAll();
			 return true;
		 }
		 throw new TutorialNotFound("No data to delete");
	}

	@Override
	public List<Tutorial> getAllPublishedTutorial(String status) throws TutorialNotFound {
		List<Tutorial> data=tdao.getByStatus(status);
		if(data.size()!=0)
			 return data;
		
		 throw new TutorialNotFound("No data available");
		
	}

	@Override
	public List<Tutorial> getByTitle(String title) throws TutorialNotFound {
		 List<Tutorial> exist=tdao.getTutorialByTitle(title);
		   if(exist.size()!=0)
		   {
			   return exist;
		   }
		throw new TutorialNotFound("No data available");
	}


	@Override
	public Tutorial updateTutorial(Tutorial tutorial, Integer id) throws TutorialNotFound {
		 Optional<Tutorial> opt=tdao.findById(id);
		 if(opt.isPresent())
		 {
			 Tutorial exist=opt.get();
			 if(tutorial.getTitle()!=null)
				 exist.setTitle(tutorial.getTitle());
			 if(tutorial.getDescription()!=null)
				 exist.setDescription(tutorial.getDescription());
			 if(tutorial.getStatus()!=null)
				 exist.setStatus(tutorial.getStatus());
			 
			 return tdao.save(exist);
		 }
		 throw new TutorialNotFound("No Tutorial with the id :"+id);
	}

	@Override
	public Tutorial addTutorial(Tutorial tutorial) throws TutorialAlreadyPresent {
		  Tutorial exist=tdao.getTutorialByTitleAndStatus(tutorial.getTitle(),tutorial.getStatus());
		   if(exist==null)
		   {
			   return tdao.save(tutorial);
		   }
		throw new TutorialAlreadyPresent("Tutorial already present");
	}

}
