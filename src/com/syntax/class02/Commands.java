package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	
		driver.navigate().to("https://www.google.com");
		
		driver.manage().window().fullscreen();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(2300);
		driver.close();
		
	}

}
