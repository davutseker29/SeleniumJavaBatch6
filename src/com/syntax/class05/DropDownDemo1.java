package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass { //
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDD);
		
		/*
		 * Selenium provides three different ways to select a value from a DD
		 * 1. byIndex();
		 * 2.ByVisibleText(String str)
		 * 3.ByValue
		 */
				
		List<WebElement> options=select.getOptions();
		System.out.println("Numer of Options in the DD:: "+ options.size());
		
		select.selectByIndex(1);
		
		for(int i=0; i<options.size();i++) {
			
			select.deselectByIndex(i);
			Thread.sleep(1000);
			
		}
		
		select.deselectByVisibleText("Friday"); //select an option by Visible text
		//in the parameter provide the text Visible on UI
		
	}
	
	

}
