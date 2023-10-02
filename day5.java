package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day5 {
	ChromeDriver driver;

	@BeforeMethod
	public void Openbrowser() {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}

	@Test(priority = 1, description = "login functionality")
	public void testOne() {
		String title = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(title, expectedTitle);
	}

	@Test(priority = 2, description = "Validate homepage url")
	public void testtwo() {
		String url = driver.getCurrentUrl();
		boolean expectedUrl = url.contains("webdriveruniversity");
		Assert.assertEquals(expectedUrl, true);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
