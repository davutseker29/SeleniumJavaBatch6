package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunching {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String currentUrl = driver.getCurrentUrl();
		
		String expected="https://www.google.com";
		
		if(currentUrl.equalsIgnoreCase(expected)) {
			System.out.println(driver.getTitle());
		}else {
			System.err.println("===================wrong address=================");
		}

		

		Thread.sleep(2000);
		driver.close();

	}

}
