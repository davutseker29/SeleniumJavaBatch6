package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task {
	
	public static void main(String[] args) {
	
		WebDriver driver=BaseClass.setUp();
		
		WebElement fb=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select select=new Select(fb);
		Select sDay= new Select(day);
		Select sYear= new Select(year);

		
		List<WebElement> options=select.getOptions();
		List<WebElement> dayList=sDay.getOptions();
		List<WebElement> yearList=sYear.getOptions();
		
		System.out.println("Total number of months is::"+options.size());
		System.out.println("Total number of days is::"+dayList.size());
		System.out.println("Total numer of years is::"+yearList.size());
		
		for (WebElement option : options) {
			
			String elements=option.getText();
			System.out.println(elements);
			
		}
		
	fb=driver.findElement(By.id("day"));
	
	
	}
	
}
