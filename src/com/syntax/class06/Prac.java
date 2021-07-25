package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Prac extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement allOptions = driver.findElement(By.id("multi-select"));
		
		Select select=new Select(allOptions);
		
		List<WebElement> all = select.getOptions();
		
		int size = all.size();
		System.out.println(size);
		
		boolean dDownIsMultiple = select.isMultiple();
		System.out.println(dDownIsMultiple);
		
		for (WebElement web : all) {
			
			String printAll = web.getText();
			System.out.println(printAll);
			
		}
	}

}
