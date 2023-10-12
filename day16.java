package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day16 {
	ChromeDriver driver;

	@Test
	public void CalenderSelection() {
		String month = "January";
		String year = "2024";
		String date = "1";

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\imson\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");

		driver.findElement(By.id("datepicker")).click();
		selectDate(driver, date, month, year);
	}

	public static void selectDate(ChromeDriver driver, String date, String month, String year) {
		String text = driver.findElement(By.className("datepicker-switch")).getText();
		// System.out.println(text);
		String actualMonth = text.split(" ")[0];
		String actualYear = text.split(" ")[1];
		System.out.println(actualMonth);
		System.out.println(actualYear);
		System.out.println(actualMonth.equals(month) && actualYear.equals(year));

		while (!(actualMonth.equals(month) && actualYear.equals(year))) {
			System.out.println("hello");
			driver.findElement(By.className("next")).click();
			text = driver.findElement(By.className("datepicker-switch")).getText();
			actualMonth = text.split(" ")[0];
			actualYear = text.split(" ")[1];

			System.out.println(actualMonth);
			System.out.println(actualYear);
		}
		List<WebElement> ele = driver.findElements(By.className("day"));
		for (int i = 0; i < ele.size(); i++) {
			if (ele.get(i).getText().equals(date)) {
				ele.get(i).click();
				break;
			}
		}
	}
}
