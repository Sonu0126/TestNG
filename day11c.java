package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day11c {
	@Parameters({ "browser" })
	@Test
	public void TestCaseFour(@Optional("chromeC") String bw) {
		System.out.println(bw);
	}
}
