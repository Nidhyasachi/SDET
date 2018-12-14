package com.training.sdet.day4;

public class QuizEx01 {
	private String quest;
	private String answ;
	private String option;
	
	public QuizEx01(String option) {
		this.answ = option; 
	}
	
	public void enter(boolean answ) {
		if(answ = "a" != null) {
			System.out.println("Your Answer is correct");
			
			}else {
			System.out.println("Sorry invalid answer");
		}
	}

}

