package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DynamicTblAnotherWay extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String expectValue = "Bob Feather";

		WebElement table = driver.findElement(By.id("//table[@id='ctl00_MainContent_orderGrid']"));
		List<WebElement> rows = table.findElements(By.tagName("//tr"));
		
		for (WebElement row : rows) {
			String rowText=row.getText();
			if(rowText.contains(expectValue)) {
				
			}
		}
		

		Thread.sleep(5000);
		driver.close();

	}

}