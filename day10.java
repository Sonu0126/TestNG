package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day10 {
	ChromeDriver driver;

	@Test
	public void AutoSuggestiveDropDown() {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("C");
		List<WebElement> listA = driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for (int i = 0; i < listA.size(); i++) {
			System.out.println(i);
//	    	String element = listA.get(i).getText();
//	    	System.out.println(element);
			if (listA.get(i).getText().contains("Coffee")) {
				listA.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("submit-button")).click();
		boolean url = driver.getCurrentUrl().contains("Coffee");
		Assert.assertTrue(url);
		driver.close();

	}

	@Test
	public void AutoSuggestiveDropDownTwo() {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		WebElement input = driver.findElement(By.id("myInput"));
		input.sendKeys("C");
		input.sendKeys(Keys.ARROW_DOWN);
		input.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		String url = driver.getCurrentUrl();
		boolean avail = url.contains("Cabbage");
		Assert.assertTrue(avail);
		driver.close();

	}
}
