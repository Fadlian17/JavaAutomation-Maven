package com.team.foundations;

import org.junit.Test;
/**
 * 
 * @author HP
 *
 */

public class JavaTest01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test execution start here");
		
		String testURL = "google.com";
		System.out.println("Test URL:"+ testURL);
		
		/*
		 * Logic
		 */
		
		if(testURL.startsWith("www")) {
			System.out.println("URL Test Passed");
		}else {
			System.out.println("URL Test Failed");
		}
	}
}
