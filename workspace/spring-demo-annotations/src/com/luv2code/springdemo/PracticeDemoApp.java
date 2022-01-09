package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeJavaConfig.class);
		
		//get the bean from the config file
		Coach practiceCoach = context.getBean("practiceCoach", PracticeCoach.class);
		
		// call a method on the bean
		System.out.println(practiceCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(practiceCoach.getDailyFortune());
		
		context.close();
		
	}

}
