package testNGEcecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoForParameter {
	@Test
	@Parameters("Sample")
	public void demo(String data) {
		System.out.println("success");
		System.out.println(data);
	}
}
