package com.qa.interoperability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.qa.service.TraineeService;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationEndpointTest {

	private static final String MOCK_VALUE = "test_value";
	
	private static final String MOCK_VALUE2 = "test_value_2";
	
	@InjectMocks
	private ApplicationEndpoint endpoint;
	
	@Mock
	private TraineeService service;
	
	
	@Before
	public void setUp() {
		endpoint.setService(service); 
	}
	 
	@Test
	public void testGetAllTrainees() {
		Mockito.when(service.getAllTrainees()).thenReturn(MOCK_VALUE); 
		Assert.assertEquals(MOCK_VALUE, endpoint.findAllTrainees());
	}
	
	@Test
	public void testCreatetrainee() {
		Mockito.when(service.createTrainee(MOCK_VALUE2)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.createTrainee(MOCK_VALUE2));
		Mockito.verify(service).createTrainee(MOCK_VALUE2);
	}
	
	@Test
	public void testUpdateTrainee() {
		Mockito.when(service.updateTrainee(1L, MOCK_VALUE2)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.updateTrainee(1L, MOCK_VALUE2));
		Mockito.verify(service).updateTrainee(1L, MOCK_VALUE2);
	}
	
	@Test
	public void testDeleteAccount() {
		Mockito.when(service.deleteTrainee(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deleteTrainee(1L));
		Mockito.verify(service).deleteTrainee(1L);
	}
}
