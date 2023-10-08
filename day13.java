package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day13 {
	@Test
	public void login() {
		System.out.println("Executing the login test case");
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Executing the search test case");
		Assert.assertEquals(false, true);
	}

	@Test(dependsOnMethods = { "login", "search" })
	public void addToCart() {
		System.out.println("Adding to cart");
	}
}
