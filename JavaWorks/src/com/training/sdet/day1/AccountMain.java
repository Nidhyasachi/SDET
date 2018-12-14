package com.training.sdet.day1;

public class AccountMain {
 public static void main(String[] args) {
    Account harryAccount ;
    
    //its in heap
    harryAccount = new Account();	
    
    harryAccount.setAccId(101);
    harryAccount.setAccBalance(3000);
    
    
    Name name = new Name();
    name.setFirstName("Nidhya");
    name.setMiddleName("Y");
    name.setLastName("Sachidhanantham");
    harryAccount.setName(name);
    
    System.out.println(harryAccount.toString());
   
    }
}


