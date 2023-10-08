package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day13b {
	@Test(dependsOnMethods = { "addtocart" })
	public void login() {
		System.out.println("Executing the login test case");
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Executing the search test case");
		Assert.assertEquals(false, true);
	}

	@Test(dependsOnMethods = { "search" })
	public void addToCart() {
		System.out.println("Adding to cart");
	}

	@Test(dependsOnMethods = { "addtocart" })
	public void Payment() {
		System.out.println("Payment done");
	}

}
