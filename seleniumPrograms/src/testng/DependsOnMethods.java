package testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void login(){
		System.out.println("iam an login");
	}
	@Test(dependsOnMethods = "login")
	public void home(){
		System.out.println("iam an home");
	}
	@Test(dependsOnMethods = "login",priority = -10)
	public void help(){
		System.out.println("iam an help");
	}
	@Test(dependsOnMethods ="help")
	public void logout(){
		System.out.println("iam an logout");
	}
}
