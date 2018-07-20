package com.qa.service;

import javax.inject.Inject;
import org.apache.log4j.Logger;

import com.qa.interoperability.ApplicationEndpoint;
import com.qa.repository.TraineeDBRepository;
import com.qa.repository.iTraineeRepository;

public class TraineeService implements iTraineeService {
	
	private static final Logger LOGGER = Logger.getLogger(iTraineeService.class);
	
	@Inject
	private iTraineeRepository repo;

	public String getAllTrainees() {
		LOGGER.info("In TraineeService getAllTrainees");
		return repo.getAllTrainees();
	}

	public String createTrainee(String trainee) {
		LOGGER.info("In TraineeService createTrainee");
		return repo.createTrainee(trainee);
	}

	public String updateTrainee(long id, String trainee) {
		LOGGER.info("In TraineeService updateTrainee");
		return repo.updateTrainee(id, trainee);
	}

	public String deleteTrainee(long id) {
		LOGGER.info("In TraineeService deleteTrainee");
		return repo.deleteTrainee(id);
	}

	public void setRepo(TraineeDBRepository repo) {
		this.repo = repo;
		 
	}
	


}
