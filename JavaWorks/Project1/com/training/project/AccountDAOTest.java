package com.training.project;


import static org.junit.Assert.*;

import org.junit.*;

public class AccountDAOTest {


	@Test(timeout=100)
	public void getAllAccsTest() {
	AccountDAO dao = new AccountDAO ();
	dao.getAllAccs().forEach((System.out::println));
	}
	@Test
	public void UpdatePercentTest() {
		AccountDAO dao = new AccountDAO ();
		boolean retval = dao.UpdatePercent();
		assertEquals(true,retval);
	}


		
	}
	