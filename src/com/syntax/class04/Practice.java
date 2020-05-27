package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static String url="https://www.amazon.ca/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']")).click();
		
		driver.findElement(By.cssSelector("div[id='hmenu-customer-name']")).click();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("davutseker29@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ankara06");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
