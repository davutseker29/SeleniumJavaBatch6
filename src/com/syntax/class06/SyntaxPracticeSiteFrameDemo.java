package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {

		WebDriver driver=BaseClass.setUp();
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.name("FrameOne"));
		
		boolean image=element.isDisplayed();
		System.out.println("image is displayed:: "+image);
		
		String textDisplay=driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-5.text-left > div > p:nth-child(1)")).getText();
		System.out.println(textDisplay);
		driver.switchTo().frame(0);
		String frameText=driver.findElement(By.cssSelector("#carousel-example-generic > div > div > div > div > div.col-md-9.text-left > h3")).getText();
		System.out.println(frameText);
		boolean menu=driver.findElement(By.cssSelector("#easycont > div > div:nth-child(1) > div > div.panel-heading")).isEnabled();
		System.out.println(menu);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		BaseClass.tearDown();
	}

}
