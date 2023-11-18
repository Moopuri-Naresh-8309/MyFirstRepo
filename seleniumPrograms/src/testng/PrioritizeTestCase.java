package testng;

import org.testng.annotations.Test;

public class PrioritizeTestCase {
	@Test(priority = -5)
	public void login(){
		System.out.println("iam an login");
	}
	@Test(priority = 000)
	public void home(){
		System.out.println("iam an home");
	}
	@Test(priority = 1)
	public void help(){
		System.out.println("iam an help");
	}
	@Test(priority = +10)
	public void logout(){
		System.out.println("iam an logout");
	}
}
