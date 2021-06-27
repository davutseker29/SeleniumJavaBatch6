package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * to be able to talk with chromedriver first you need to talk with webdriver
		 * than chrome firefox or internet explorer
		 */
		// 1st thing i have to connect to webdriver

//		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

//		WebDriver driver=new FirefoxDriver();
		// 2nd create an object of ChromeDriver
		WebDriver driver = new ChromeDriver();

		driver.get("http://youtube.com");
		String currentUrl = driver.getCurrentUrl();
		
		String expected="ww.youtube.com";
		
		if(currentUrl.equalsIgnoreCase(expected)) {
			System.out.println(driver.getTitle());
		}else {
			System.err.println("==================please check the address================");
		}
		
		System.out.println(driver.getTitle());
		

		
		Thread.sleep(2000);
		driver.close();
	}

}
