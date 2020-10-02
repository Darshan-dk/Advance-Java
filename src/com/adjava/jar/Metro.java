package com.adjava.jar;

public class Metro {
	String name;
	int coach;
	
	public void transport() {
		System.out.println("Metro is traveling from rajaji nagar to cubbon park");
	}

	public Metro(String name, int coach) {
		super();
		this.name = name;
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Metro [name=" + name + ", coach=" + coach + "]";
	}

}
