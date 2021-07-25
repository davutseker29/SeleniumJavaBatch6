package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SyntaxPracticePageFrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

	setUp();
	
	driver.switchTo().frame("FrameOne");
	String text = driver.findElement(By.xpath("//span[text()='LIVE MASTERCLASS for FREE']")).getText();
	System.out.println("Text from 1st frame"+text);
	driver.switchTo().defaultContent();
	
	WebElement frameTwo = driver.findElement(By.cssSelector("iframe[name='FrameTwo']"));
	driver.switchTo().frame(frameTwo);
	WebElement logo = driver.findElement(By.cssSelector("img[alt='8e2d87aa3d921626377166-webinar-24.5-1.png']"));
	boolean isLogoDisplayed = logo.isDisplayed();
	if(isLogoDisplayed) {
		System.out.println("I am in 2nd Frame and logo is displayed");
	}else {
		System.err.println("Logo is not displayed");
	}
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	tearDown();
	}

}
