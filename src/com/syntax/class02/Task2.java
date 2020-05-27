package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		
		obj.navigate().to("http://newtours.demoaut.com/");
		
		obj.findElement(By.linkText("REGISTER")).click();
		
		obj.findElement(By.name("firstName")).sendKeys("David");
		obj.findElement(By.name("lastName")).sendKeys("Seker");
		obj.findElement(By.name("phone")).sendKeys("2368822918");
		obj.findElement(By.id("userName")).sendKeys("dSeker");
		obj.findElement(By.name("address1")).sendKeys("1550 Mount Douglas Cross Rd ");
		obj.findElement(By.name("address2")).sendKeys("Ground Level Suite");
		obj.findElement(By.name("city")).sendKeys("Victoria");
		obj.findElement(By.name("state")).sendKeys("BC");
		obj.findElement(By.name("postalCode")).sendKeys("v8n1z7");
		obj.findElement(By.name("country")).sendKeys("Canada");
		
		
		
		
	}

}
