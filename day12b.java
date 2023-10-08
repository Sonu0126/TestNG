package testng;

import org.testng.annotations.Test;

public class day12b {
	@Test(groups = { "login" })
	public void TestCaseFour() {
		System.out.println("login test1");
	}

	@Test(groups = { "regression" })
	public void TestCaseFive() {
		System.out.println("regression2");
	}

	@Test(groups = { "login" })
	public void TestCaseSix() {
		System.out.println("login test2");
	}
}
