package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DDDemo2 extends BaseClass {

	public static void main(String[] args) {

		setUp(); 
		
		WebElement days = driver.findElement(By.id("month"));
		
		Select select=new Select(days);
		
		List<WebElement> options = select.getOptions();
		
		int num=options.size();
		System.out.println(num);
		
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
			
			if(text.equals("Jul")) {
				option.click();
				String ddText=option.getText();
				if(ddText.equals("Jul")) {
					System.out.println("July is selected::"+option.isSelected());
				}else {
					System.out.println("July is not selected::"+option.isSelected());
				}
			}
		}
		
		boolean ddMulti = select.isMultiple();
		System.out.println("this dropdown is multiple::"+ddMulti);
		
		
		tearDown();
	}

}
