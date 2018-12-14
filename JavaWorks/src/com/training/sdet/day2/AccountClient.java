package com.training.sdet.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AccountClient {
public static void main(String[] args) {
	Account [] accs = new Account [5];
	
	accs[0] = new Account ("Frank", 1000);
	accs[1] = new Account ("Bryan", 2000);
	accs[2] = new Account ("Pete", 3000);
	accs[3] = new Account ("Cindy", 4000);
	accs[4] = new Account ("Henry", 5000);
	
	Arrays.sort(accs);
	
	for (Account temp: accs){
		System.out.println(temp);
	}
	
	Arrays.sort(accs,new Comparator<Account>(){
	public int compare(Account o1 , Account o2){
	return (int) (o1.getBalance()- o2.getBalance());
	
//	Arrays.sort(accs,(o1,o2) -> (int) (o1.getBalance()- o2.getBalance()));

	}
}