package com.training.sdet.day4;

public class QuizTst implements Runnable {
		private QuizEx01 quest ; 
		private String option; 
		private Thread t; 
		
		@Override
		public void run() {
			synchronized (quest) {
				.option;
			}
		}
		
		public QuizTst(QuizEx01 quest, String option) {
			
			this.quest = quest; 
			this.option = option; 
			t = new Thread(this); 
			t.start(); 
		}

		public static void main(String[] args) {
			QuizEx01 quest = new QuizEx01("Did they announce the holiday"); 
			new QuizTst(quest, "a");
			new QuizTst(quest, "b");
		}
	}

}
