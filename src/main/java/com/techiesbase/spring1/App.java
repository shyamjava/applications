package com.techiesbase.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
	private String name = "App";
	
	private HelloService service;
	
	public App(){
		
	}
	
	public App(String name){
		this.name = name;
	}
	
	

	public App(HelloService service) {
		super();
		this.service = service;
	}
	
	

	public App(String name, HelloService service) {
		super();
		this.name = name;
		this.service = service;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the service
	 */
	public HelloService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(HelloService service) {
		this.service = service;
	}

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        
        System.out.println("Spring context initialized.");

        App app1 = (App) applicationContext.getBean("app1");
        System.out.println("app1 Name=" + app1.getName());
        
        App app2 = (App) applicationContext.getBean("app2");
        System.out.println("app2 Name=" + app2.getName());
        
        
        App app3 = (App) applicationContext.getBean("app3");
        System.out.println("app3 Name=" + app3.getName());
        System.out.println("service greetings=" + app3.getService().getGreetings());
        
        
        App app4 = (App) applicationContext.getBean("app4");
        System.out.println("app4 Name=" + app4.getName());
        System.out.println("service greetings=" + app4.getService().getGreetings());
        
        
        
    }
	
}
