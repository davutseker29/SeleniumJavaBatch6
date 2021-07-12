package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("davutseker29@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Ankarasd06");
		
		driver.findElement(By.tagName("u_0_c_6E"));
				
		Thread.sleep(300);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
	}

}
