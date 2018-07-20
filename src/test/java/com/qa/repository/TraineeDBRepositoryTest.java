package com.qa.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.persistence.domain.Subjects;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@RunWith(MockitoJUnitRunner.class)
public class TraineeDBRepositoryTest {
	
	private static final String MOCK_DATA_ARRAY = "[{\"traineeid\":0,\"name\":\"John\",\"subjects\":[]}]";
	
	private static final String MOCK_OBJECT = "[{\"traineeid\":0,\"name\":\"John\",\"subjects\":[]}]";
	
	@InjectMocks
	private TraineeDBRepository repo;
	
	@Mock 
	private EntityManager manager;
	
	@Mock
	private Query query;
	
	private JSONUtil util;
	
	@Before
	public void setUp() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
	}
	
	@Test
	public void testGetAllTrainees() {
		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
		List<Trainee> trainees = new ArrayList<Trainee>();
		List<Subjects> subject = new ArrayList<Subjects>();
		trainees.add(new Trainee("John", subject));
		Mockito.when(query.getResultList()).thenReturn(trainees);
		assertEquals(MOCK_DATA_ARRAY, repo.getAllTrainees());	
	}
	
	@Test
	public void testCreateTrainee() {
		String reply = repo.createTrainee(MOCK_OBJECT); 
		assertEquals(reply, "{\"message\": \"trainee has been added\"}");
	}
	
	@Test
	public void testUpdateTrainee() { 
		String reply = repo.updateTrainee(1L, MOCK_OBJECT);
		assertEquals(reply, "{\"message\": \"trainee updated\"}");
	}
	
	@Test
	public void testDeleteAccount() {
		String reply = repo.deleteTrainee(1L);
		assertEquals(reply, "{\"message\": \"trainee deleted\"}");
	}
}
