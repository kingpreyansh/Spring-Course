package com.luv2code.springdemo;

public class PracticeCoach implements Coach {

	private FortuneService practiceFortune;
	
	public PracticeCoach(FortuneService thePracticeFortune) {
		practiceFortune = thePracticeFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Practice Daily Fortune";
	}

}
