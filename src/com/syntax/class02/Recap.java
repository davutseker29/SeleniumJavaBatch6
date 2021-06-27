package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String fburl="https://www.facebook.com";
		driver.get(fburl); //will open a browser
		
		String url=driver.getCurrentUrl(); 
		System.out.println("Current URL is: "+url);
		
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
