package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExploringAssertions {
	@Test
	public void matching() {
		String expectedtitle="swiggy";
		String actualtitle="zomato";
		
		//hard assert
		//assertEquals(actualtitle, expectedtitle);
		
		//softasssert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualtitle, expectedtitle);
		//soft.assertAll();
		System.out.println("done");
	}
}