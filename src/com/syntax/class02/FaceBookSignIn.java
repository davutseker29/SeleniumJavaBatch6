package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignIn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();;
		
		driver.findElement(By.id("email")).sendKeys("davuttest.yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("davut123");
		driver.findElement(By.tagName("u_0_c_6E"));
		driver.findElement(By.linkText("Forgot account?")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
