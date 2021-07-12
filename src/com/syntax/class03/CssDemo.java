package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
	
	public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name*='txtP']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[type^='Sub']")).click();
		
		driver.findElement(By.cssSelector("a[id*='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
