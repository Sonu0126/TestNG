package testng;

import org.testng.annotations.Test;

public class day11e {
	@Test(priority = 1)
	public void TestFour() {
		System.out.println("Testcase four pass");
	}

	@Test(priority = 2)
	public void TestFive() {
		System.out.println("Testcase five pass");
	}

	@Test(priority = 3, enabled = false)
	public void TestSix() {
		System.out.println("Testcase six pass");
	}
}
