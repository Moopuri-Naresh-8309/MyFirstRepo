package testng;

import org.testng.annotations.Test;

public class DisabledTestCases {
	@Test(priority = -5)
	public void login(){
		System.out.println("iam an login");
	}
	@Test(priority = 000,enabled = false)
	public void home(){
		System.out.println("iam an home");
	}
	@Test(priority = +10,enabled = true)
	public void logout(){
		System.out.println("iam an logout");
	}
}
