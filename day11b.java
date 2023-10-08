package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day11b {
	@Parameters({"browser","username","password","db-admin"})
	@Test
	public void TestCaseFour(String bw, String un, String pw, String db) {
		System.out.println("Testcase four pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pw);
		System.out.println(db);
	}
@Test
public void TestCaseFive() {
	System.out.println("Testcase five pass");
}
@Test
public void TestCaseSix() {
	System.out.println("Testcase six pass");
}
}
