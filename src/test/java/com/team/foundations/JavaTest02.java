package com.team.foundations;

import org.junit.Test;

public class JavaTest02 {

	/**
	 * Variables
	 * @param args
	 */
	
	String testURL = "teststaging.barclays.com";
	long membershipNumber = 12345678;
	int passcode = 4567;
	
	/*
	 * Static
	 */
	static int numberofLoginAttempts = 0;
	
	/**
	 * Login Attempts
	 */
	private void loginAttempts() {
		System.out.println("User log in attempt: "+(numberofLoginAttempts+1));
		
		/*
		 * Local
		 */
		
		numberofLoginAttempts++;
		
		String expectedAccountLockedMessage ="Account Locked .contact Bank";
		if(numberofLoginAttempts == 3) {
			System.out.println(expectedAccountLockedMessage);
		}
	}
	
	@Test
	public void testVariables() {
		// TODO Auto-generated method stub
		System.out.println("Test URL : "+ testURL);
		System.out.println("Membership Number: "+membershipNumber);
		
		membershipNumber = 3222345;
		System.out.println("Membership Number: "+membershipNumber);

		loginAttempts();
		loginAttempts();
		loginAttempts();
	}

}
