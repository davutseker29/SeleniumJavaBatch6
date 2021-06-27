package com.review.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LucnhChromeBrowser {
	
	public static void main(String[] args) {
		
		//making connection to the driver		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//opeening the browser by calling the constructor of chromedriver class and upcasting
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.ca/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getTitle());
	}	

}
