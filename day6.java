package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day6 {
	ChromeDriver driver;

	@Test
	public void TestCase1() {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement contactUsLink = driver.findElement(By.id("contact-us"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", contactUsLink);
		driver.close();
	}

//scroll to the page 
	@Test
	public void TestCase2() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollEle = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollEle);
		Thread.sleep(5000);
		driver.close();
	}

//Set the Attribute 
	@Test
	public void TestCase3() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollEle = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('data-cy','two')", scrollEle);
		String scrollAttribute = scrollEle.getAttribute("data-cy");
		System.out.println(scrollAttribute);
		// js.executeScript("arguments[0].removeAttribute('data-cy','two')", scrollEle);
		// driver.close();
	}

//Get the title
	@Test
	public void TestCase4() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollEle = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title;");
		// First parameter of JavascriptExecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	}

//double click the button 
	@Test
	public void TestCase5() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement d = driver.findElement(By.id("double-click"));
		ac.doubleClick(d).build().perform();
		String className = d.getAttribute("class");
		Assert.assertEquals(className, "div-double-click double");
		driver.close();

	}

	@Test
	public void TestCase6() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		Assert.assertEquals(drop.getText(), "Dropped!");
		driver.close();

	}

//ClickAndhold
	@Test
	public void TestCase7() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement click = driver.findElement(By.id("click-box"));
		ac.clickAndHold(click).build().perform();
		Assert.assertEquals(click.getText(), "Well done! keep holding that click now.....");
		driver.close();

	}

	

}
