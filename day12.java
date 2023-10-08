package testng;

import org.testng.annotations.Test;

public class day12 {
	@Test(groups = { "smoke" })
	public void TestCaseOne() {
		System.out.println("smoke test1");
	}

	@Test(groups = { "smoke", "regression" })
	public void TestCaseTwo() {
		System.out.println("smoke test2");
	}

	@Test(groups = { "smoke" })
	public void TestCaseThree() {
		System.out.println("smoke test3");
	}
}
