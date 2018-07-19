package com.qa.constants;

public class Constants {
	public static final String UNIT_NAME = "primary";
	
	public static final String ACCOUNT_ID = "ACCOUNT_ID";
	public static final String TRANSACTION_ID = "TRANSACTION_ID";
	public static final String TRANSACTION_NAME = "TRANSACTIONNAME";
	
	public static final String FIRST_NAME = "First_Name";
	public static final String LAST_NAME = "Last_Name";
	public static final String ID = "id";
	public static final String ACCOUNT_NUMBER = "Acc_Number";
	public static final String ACCOUNT = "account";
	
	public static final String QUERY1 = "SELECT t FROM Trainee t";
	public static final String BANNED_ACCOUNT_MESSAGE = "{\"message\": \"this account is blocked\"}";
	public static final String TRAINEE_ADDED = "{\"message\": \"account has been added\"}";
	public static final String TRAINEE_DELETED = "{\"message\": \"account deleted\"}";
	public static final String TRAINEE_UPDATED = "{\"message\": \"account updated\"}";
	
	public static final String TRAINEE_PATH = "/account";
	public static final String JSON_PATH = "/json";
	public static final String JSON_PATH_WITH_ID = "/json/{id}";
	public static final String PRODUCES = "application/json";
	public static final String REST = "rest";
}
