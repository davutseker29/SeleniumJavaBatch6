package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement multiSelectDD = driver.findElement(By.id("multi-select"));
		
		Select select=new Select(multiSelectDD);
		boolean multi = select.isMultiple();
		System.out.println(multi);
		
		if(multi) {
			select.selectByIndex(2);
			Thread.sleep(2000);
			select.selectByValue("New York");
			Thread.sleep(2000);
			select.selectByVisibleText("Ohio");
			select.deselectByIndex(2);
			
		}
		 tearDown();
	}

}
