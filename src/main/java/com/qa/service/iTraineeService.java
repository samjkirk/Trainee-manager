package com.qa.service;

public interface iTraineeService {
	String getAllTrainees();
	String createTrainee(String trainee);
	String updateTrainee(long id, String trainee);
	String deleteTrainee(long id);
}
