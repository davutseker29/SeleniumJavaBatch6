package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameD extends BaseClass {
	
	public static void main(String[]args) throws InterruptedException {
		
		setUp();
		
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		/*
		 * we can switch to a frame using three different methods
		 * 1. by index
		 * 2. by name or id
		 * 3. by WebElement
		 */
		
		
		/**
		 * by index
		 */
		
		driver.switchTo().frame(0);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Davut");
		name.clear();
		driver.switchTo().defaultContent();
		
		/**
		 * by name or id
		 */
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.id("name")).sendKeys("Kaan");
		driver.switchTo().defaultContent();
		
		
		/**
		 * by WebElement
		 */
		WebElement frame = driver.findElement(By.cssSelector("iframe[name='iframe_a']"));
		driver.switchTo().frame(frame);
		name.clear();
		name.sendKeys("Pamir");
		driver.switchTo().defaultContent();
		
		
		
		
		Thread.sleep(2000);
		tearDown();
	}

}
