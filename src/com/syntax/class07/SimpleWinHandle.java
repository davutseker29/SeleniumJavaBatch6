package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class SimpleWinHandle extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("a[href='https://syntaxtechs.com']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/courses']")).click();
		
		
		
//		Set<String> allWindows = driver.getWindowHandles();
//		
//		int size=allWindows.size();
//		System.out.println(size);
		
		
		driver.quit();
		
	}

}
