package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		
		obj.get(url);
		obj.manage().window().maximize();
		
		obj.findElement(By.id("email")).sendKeys("d_seker1453@hotmail.com");
		obj.findElement(By.id("pass")).sendKeys("Ankara06");
		obj.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		obj.close();
		
		
		
		
		
	}

}
