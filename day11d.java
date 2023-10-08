package testng;

import org.testng.annotations.Test;

public class day11d {
	@Test(priority = 2)
	public void TestCaseOne() {
		System.out.println("TestCase one pass");

	}

	@Test(priority = 1)
	public void TestCaseTwo() {
		System.out.println("TestCase two pass");

	}

	@Test(priority = 3, enabled = false)
	public void TestCaseThree() {
		System.out.println("TestCase three pass");

	}
}
