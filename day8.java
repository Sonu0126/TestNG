package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day8 {
	ChromeDriver driver;
@Test
public void Testcase1() {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/");
	//verify Title
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, "WebDriverUniversity.com");
	// verify url
//			boolean avail = driver.getCurrentUrl().contains("more");
//			Assert.assertTrue(avail);
//			// verify element displayed
//			boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
//			Assert.assertTrue(avail2);
//			driver.close();
		
}

@Test
public void TestCase2() {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/");
	SoftAssert  sA  = new SoftAssert ();
	// verify title 
	String actualtitle = driver.getTitle();
	sA.assertEquals(actualtitle, "WebDriverUniversity.com");
	// verify url
	boolean avail = driver.getCurrentUrl().contains("more");
	sA.assertTrue(avail);
	// verify element displayed
	boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
	sA.assertTrue(avail2);
	
	driver.close();
	
	sA.assertAll();  
}
}
