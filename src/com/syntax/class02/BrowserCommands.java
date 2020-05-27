package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
	}

}
