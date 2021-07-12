package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DDDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement weekDD = driver.findElement(By.id("select-demo"));
		
		Select select = new Select(weekDD);
		
		/*
		 * Selenium provides three different ways to select a value from a DD
		 * 1. byIndex();
		 * 2.ByVisibleText(String str)
		 * 3.ByValue
		 */
		
		//byIndex()
		List<WebElement> options = select.getOptions();
		
		int num=options.size();
		System.out.println(num);
		
		select.selectByIndex(3);
		
		for (int i = 0; i<options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		// ByVisibleText(String str)
		
		select.selectByVisibleText("Friday");
		
		
		tearDown();
	}

}
