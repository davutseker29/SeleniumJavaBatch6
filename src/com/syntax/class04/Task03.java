package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
	
	public static String url="https://ebay.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int links=allLinks.size();
		System.out.println(links);
		
		int count=0;
		for (WebElement webElement : allLinks) {
			
			String linkNames=webElement.getText().toString();
			
			
			if(!linkNames.isEmpty()) {
				System.out.println(linkNames);
				
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
	}

}
