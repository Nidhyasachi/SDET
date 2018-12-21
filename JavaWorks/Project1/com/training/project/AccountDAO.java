package com.training.project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.training.connection.GetConnection;
import com.training.project.IAccountDAO;

public class AccountDAO implements IAccountDAO {

	public boolean updateAccountPercent(int accId, double newPercent) {
		String sql = "update account set percentage =? where acc_id=?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);

			gc.ps.setInt(2, accId);
			gc.ps.setDouble(1, newPercent);

			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	public List<Account> getAllAccs() {
		String sql = "select * from account order by 1";
		GetConnection gc = new GetConnection();
		List<Account> accList = new ArrayList<Account>();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			while (gc.rs.next()) {
				Account account = new Account();
				account.setAccId(gc.rs.getInt(1));
				account.setAccNo(gc.rs.getInt(2));
				account.setAccBal(gc.rs.getDouble(3));
				account.setAvgBal(gc.rs.getDouble(4));
				account.setPercent(gc.rs.getDouble(5));
				accList.add(account);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return accList;
	}

	public boolean UpdatePercent() {
		String sql = "select * from account order by 1";
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Scanner userinput = new Scanner(System.in);
		try {
			while (gc.rs!=null && gc.rs.next())
			{
			System.out.print("\nBEFORE % UPDATE FOR ACCOUNT ID "+gc.rs.getInt(1)+"\n");
			System.out.println("Account Id: " +gc.rs.getInt(1));
			System.out.println("Account No: " +gc.rs.getInt(2));
			System.out.println("Account Bal: " +gc.rs.getDouble(3));
			System.out.println("Account Avg Bal: " +gc.rs.getDouble(4));
			System.out.println("Account Current %: " +gc.rs.getDouble(5));
			
			System.out.println("Please enter the percentage ");
			double percent = userinput.nextDouble();
			System.out.print("Input value = " +percent);
			updateAccountPercent(gc.rs.getInt(1), percent);
			}
			userinput.close();								
			}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{					
		try {			 
			gc.ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
    	return true;
		}
}
