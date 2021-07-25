package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SimpleClaneder extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Step 1- Click on calendar Step 2- Get all td of table using findElements
		 * method Step 3- using for loop get text of all td elements Step 4- using if
		 * else condition we will check specific date Step 5- If date is matched then
		 * click and break the loop.
		 */

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.id("btnLogin")));

		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//a[text()='Leave List']")).click();

		// click on the calender
		driver.findElement(By.id("calFromDate")).click();

		WebElement mDD = driver.findElement(By.cssSelector("select[class='ui-datepicker-month']"));
		selectDdValue(mDD, "Apr");

		WebElement yDD = driver.findElement(By.cssSelector("select[class='ui-datepicker-year']"));
		selectDdValue(yDD, 2021);

		List<WebElement> fromDay = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement days : fromDay) {

			if (days.getText().equals("15")) {
				days.click();
				break;
			}

		}

		Thread.sleep(3000);
		tearDown();
	}

}
