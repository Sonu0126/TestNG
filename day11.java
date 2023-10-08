package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day11 {
	@Parameters({ "browser", "username", "password" })
	@Test
	public void TestcaseOne(String bw, String un, String pw) {
		System.out.println("Testcase one pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pw);
	}

	@Test
	public void TestcaseTwo() {
		System.out.println("Testcase two pass");
	}

	@Test
	public void TestcaseThree() {
		System.out.println("Testcase three pass");
	}
}
