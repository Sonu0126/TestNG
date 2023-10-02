package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will run before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I will run after every method");
	}

	@Test(priority = 2)
	public void test1() {
		System.out.println("Testcase one");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("Testcase two");
	}

	@Test(priority = 0)
	public void test3() {
		System.out.println("Testcase three");
	}

	@Test(priority = -1)
	public void test4() {
		System.out.println("Testcase four");
	}

	@Test(priority = -1)
	public void test5() {
		System.out.println("Testcase five");
	}

	@Test(priority = -2)
	public void test6() {
		System.out.println("Testcase six");
	}

}
