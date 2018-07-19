package com.qa.constants;

public class Constants {
	public static final String UNIT_NAME = "primary";
	
	public static final String FIRST_NAME = "First_Name";
	public static final String LAST_NAME = "Last_Name";
	public static final String ID = "id";
	
	public static final String QUERY1 = "SELECT t FROM Trainee t";
	public static final String TRAINEE_ADDED = "{\"message\": \"trainee has been added\"}";
	public static final String TRAINEE_DELETED = "{\"message\": \"trainee deleted\"}";
	public static final String TRAINEE_UPDATED = "{\"message\": \"trainee updated\"}";
	
	public static final String TRAINEE_PATH = "/trainee";
	public static final String JSON_PATH = "/json";
	public static final String JSON_PATH_WITH_ID = "/json/{id}";
	public static final String PRODUCES = "application/json";
	public static final String REST = "rest";
}
