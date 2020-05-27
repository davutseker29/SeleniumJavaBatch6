package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DynamicTable extends BaseClass {

	public static void main(String[] args) {

		setUp(); //      http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.manage().window().maximize();
		
		String expectedValue="Bob Feather";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("Number of rows is:: "+rows.size());
		
		for(int i=0; i<rows.size();i++) {
			String rowText=rows.get(i+1).getText(); // i did +1 cause dont want to print the header
			System.out.println(rowText);
			if(rowText.contains(expectedValue)) {			
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}
		}
		
		
		
		driver.close();
	}

}
