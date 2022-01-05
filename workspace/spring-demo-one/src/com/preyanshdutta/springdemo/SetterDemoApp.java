package com.preyanshdutta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		BasketballCoach theBallCoach = context.getBean("myBasketballCoach", BasketballCoach.class);
		
		// call methods on the bean
		// .. lets come back to this ..
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theBallCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		
		// call out new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}
}
