package spring_demo_two;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		//load configure file of xml
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive spring configuration
		
		Coach thecoach = context.getBean("mycoach",Coach.class);
		
		//call method using bean
		
		System.out.println(thecoach.getWorkoutDetails());
		
		//close the configuration file
		
		context.close();
		
	}

}
