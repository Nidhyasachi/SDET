package com.training.project;

import com.training.project.IAccountDAO;

public class AccountClient {

	public static void main(String[] args) {
				
		IAccountDAO dao = new AccountDAO ();
	
		System.out.println("\n----Displaying the records before the update----");
		dao.getAllAccs().forEach(System.out::println);
		dao.UpdatePercent();
		System.out.println("\n----Displaying the records after the update----");
		dao.getAllAccs().forEach(System.out::println);
				
	}

}

