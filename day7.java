package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day7 {
	ChromeDriver driver;

	@BeforeMethod()
	public void beforeMethod() {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}

	@Test
	public void TestCase1() {
		// assertEquals(expected,actual)
		String actualTitle = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		assertEquals(expectedTitle, actualTitle);

		// assertNotEquals(expected,actual)
		// WebDriver | Contact Us
		WebElement contactus = driver.findElement(By.cssSelector("#contact-us"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('target')", contactus);
		contactus.click();
		actualTitle = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);
	}

	@Test
	public void TestCase2() {
		String currenturl = driver.getCurrentUrl();
		// assertTrue(condition)
		boolean avail = currenturl.contains("university");
		assertTrue(avail);
		driver.get("https://www.google.com");
		// assertFalse(condition)
		avail = driver.getCurrentUrl().contains("university");
		assertFalse(avail);

	}

	@AfterTest
	public void afterMethod() {
		driver.close();
	}

}
