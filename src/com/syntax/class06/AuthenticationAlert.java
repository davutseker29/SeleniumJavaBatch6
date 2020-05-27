package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
	
		String url="http://test:test@abcdatabase.com/basicauth";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}

}
