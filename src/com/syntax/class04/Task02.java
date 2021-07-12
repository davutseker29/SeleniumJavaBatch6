package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
	
	public static String url="https://amazon.com/";
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int numLinks=allLinks.size();
		System.out.println(numLinks);
		
		int count=0;
		for (WebElement webElement : allLinks) {
			String links = webElement.getText().toString();
			
			if(!links.isEmpty()) {
				
				System.out.println(links);
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
