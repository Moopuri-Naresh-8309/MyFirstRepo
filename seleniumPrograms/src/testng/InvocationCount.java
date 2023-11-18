package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 2)
	public void login(){
		System.out.println("iam an login");
	}
	@Test(dependsOnMethods = "login",invocationCount = 5)
	public void home(){
		System.out.println("iam an home");
	}
	@Test(dependsOnMethods = "login",invocationCount  = 5)
	public void help(){
		System.out.println("iam an help");
	}
	@Test(dependsOnMethods ="help",invocationCount = 01)
	public void logout(){
		System.out.println("iam an logout");
	}
}
