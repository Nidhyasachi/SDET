package com.training.project;

import java.util.List;

import com.training.project.Account;

public interface IAccountDAO {
  //CRUD
	
	public boolean updateAccountPercent (int AccId, double Percent);
	public List<Account> getAllAccs();
	public boolean UpdatePercent();
	
	
}
