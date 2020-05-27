package com.syntax.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice03 {
	
	public static void main(String[] args) {
		
		String url="https://www.bodyenergyclub.com/collections/tdf-sports-nutrition";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.cssSelector("#sort-by"));
		int size=links.size();
		System.out.println(size);
		for (WebElement webElement : links) {
			String linkName=webElement.getText();
			System.out.println(linkName);
			driver.findElement(By.cssSelector("#sort-by > option:nth-child(1)")).isEnabled();
				
			
			
		}
		
		
		
		
		
		
		
	}

}
