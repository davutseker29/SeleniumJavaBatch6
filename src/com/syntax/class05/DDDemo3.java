package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DDDemo3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement months = driver.findElement(By.id("month"));
		
		Select select=new Select(months);
		
		select.selectByValue("10");
		
		List<WebElement> options = select.getOptions();
		
		Iterator<WebElement> optionsIter = options.iterator();
		
		while (optionsIter.hasNext()) {
			String text = optionsIter.next().getText();
			System.out.println(text);
			
		}
		Thread.sleep(3000);
		 tearDown();
	}

}
