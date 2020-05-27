package com.syntax.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02 {
	
	public static void main(String[] args) {
		
		String url="https://www.spellingcity.com/?gclid=CjwKCAjwkun1BRAIEiwA2mJRWVnpFAmzbaxRAEVuSpF5YHqCamWsRIYkHAmuY2XEZKr1B7VbWNaBPxoChNQQAvD_BwE";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.cssSelector("a"));
		
		int numLinks=links.size();
		System.out.println(numLinks);
		for (WebElement webElement : links) {
			
			String link=webElement.getText();
			String allLinks=webElement.getAttribute("href");
		
			System.out.println(allLinks);
			System.out.println(link+" "+allLinks);
			
		}
		
		driver.findElement(By.id("sample-game-first-word")).sendKeys("Hi");
		
		boolean flag=driver.findElement(By.cssSelector("#menu-main-navigation > li.new-hover > a")).isEnabled();
		
		if(flag) {
			driver.findElement(By.cssSelector("#menu-main-navigation > li.new-hover > a")).click();
			
		}
		
		driver.findElement(By.cssSelector("#menu-main-navigation > li.search-icon.dropdown.menu-item.menu-item-has-children.search-dropdown-list")).click();
		
		driver.findElement(By.cssSelector("#menu-main-navigation > li.search-icon.dropdown.menu-item.menu-item-has-children.search-dropdown-list > ul > li:nth-child(1) > a")).click();
		
		System.out.println("=====================================");
		
		
			
		}
		
		
		
		
	}


