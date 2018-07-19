package com.qa.repository;

public interface iTraineeRepository {
	String getAllTrainees();
	String createTrainee(String trainee);
	String updateTrainee(long id, String trainee);
	String deleteTrainee(long id);
}
