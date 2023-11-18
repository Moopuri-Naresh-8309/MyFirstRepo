package testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ImplementationOfListners.class)
public class ListenerToTestCaseConnection {
	@Test
	public void sample() {
		System.out.println("from testcase");
	}
}
