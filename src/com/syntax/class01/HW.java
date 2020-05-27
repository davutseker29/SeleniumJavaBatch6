package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/");
		
		driver.getCurrentUrl();
		
		driver.get("https://google.com/");
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver drvrs=new FirefoxDriver();
		
		drvrs.get("https://github.com/");
		
		System.out.println(drvrs.getCurrentUrl());
		
		System.out.println(drvrs.getTitle());
	}

}
