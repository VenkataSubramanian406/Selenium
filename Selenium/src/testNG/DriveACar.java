package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Fourth gear");
	}
	//priority is a annotation, it is a attribute.to set order we use priority
	
}
