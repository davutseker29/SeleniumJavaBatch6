package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Recap2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement mainPage = driver.findElement(By.cssSelector("a[href='index.php']"));
		boolean isMainPageEnabled = mainPage.isEnabled();
		
		System.out.println(isMainPageEnabled);
		
		driver.switchTo().frame("FrameOne");
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//span[text()='LIVE MASTERCLASS for FREE']"));
		System.out.println(text.isDisplayed());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		
		boolean button = driver.findElement(By.cssSelector("a[class='brand-2 w-nav-brand w--current']")).isEnabled();
		System.out.println(button);
		
		tearDown();
	}

}
