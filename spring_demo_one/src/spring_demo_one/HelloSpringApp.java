package spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

public static void main(String[] args) {
	//load the spring configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//retrieve from spring container
	Coach thecoach = context.getBean("mycoach",Coach.class);
	//call methods on the bean
	System.out.println(thecoach.getDailyWorkout());
	//close the context
	context.close();
}	
	
}
