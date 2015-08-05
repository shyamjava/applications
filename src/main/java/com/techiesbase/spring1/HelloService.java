package com.techiesbase.spring1;

public class HelloService {
	
	private String greetings = "Hello";
	
	

	public HelloService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public HelloService(String greetings) {
		super();
		this.greetings = greetings;
	}



	/**
	 * @return the greetings
	 */
	public String getGreetings() {
		return greetings;
	}

	/**
	 * @param greetings the greetings to set
	 */
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	
	

}
