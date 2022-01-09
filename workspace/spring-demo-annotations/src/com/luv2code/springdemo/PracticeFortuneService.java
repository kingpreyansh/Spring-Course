package com.luv2code.springdemo;

public class PracticeFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Practice Fortune";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "this is the daily fortune";
	}

}
