package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/validateCredentials";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name*='txtP']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[name^='Submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id$='elcome']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
