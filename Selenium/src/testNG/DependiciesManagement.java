package testNG;

import org.testng.annotations.Test;

public class DependiciesManagement {

	//Problem 1: you have to admit a student to engg
	//problem 2: you have to admit a student to higher sec
	@Test(enabled=true)
	public void highSschool(){
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSschool")
    public void higherSecondary(){
    	System.out.println("Higher Sec");
	}
	@Test(dependsOnMethods = "higherSecondary")
    public void engineering(){
    	System.out.println("college");
	}
	
	
	
}
