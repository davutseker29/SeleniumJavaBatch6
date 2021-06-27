package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * chrome browser 1-open chrome browser 2-navigate to "https://github.com/"
		 */

		/*
		 * firefox browser 1-open firefox browser navigate to "https://www.redfin.com"
		 */

		// 1st step
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		// 2nd step
		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.close();
		
		//2nd homework
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver drive=new FirefoxDriver();
		drive.get("https://www.redfin.com");
		
		System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getTitle());
		
		Thread.sleep(2000);
		drive.close();
		
		

	}

}
