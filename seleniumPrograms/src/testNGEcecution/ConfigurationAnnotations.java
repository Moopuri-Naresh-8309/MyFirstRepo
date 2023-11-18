package testNGEcecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@Test
	public void method1() {
		System.out.println("From method1");
	}
	@Test
	public void method2() {
		System.out.println("From  method2");
	}
	@Test
	public void method3() {
		System.out.println("From  method3");
	}
	@Test
	public void method4() {
		System.out.println("From  method4");
	}
}
