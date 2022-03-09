package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	
	/*
	 Scenerio :A big basket is having a difference kind of mobiles.
	 Let us say there are apple phones, moto, vivo and lenovo
	 I want to run tests only for vivo snd moto phones.write a program for that
	 	 */
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Moto testing");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("Moto testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("Vivo testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo testing");
	}
	@Test(groups= {"Lenovo"})
	public void lenovo1() {
		System.out.println("Lenovo testing");
	}
	@Test(groups= {"Lenovo"})
	public void lenovo2() {
		System.out.println("Lenovo testing");
	}	
	
}
