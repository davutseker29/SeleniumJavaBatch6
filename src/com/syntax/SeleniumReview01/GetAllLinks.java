package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class GetAllLinks extends BaseClass {

	public static void main(String[] args) {
		
		setUp();

		List<WebElement> allLinks=driver.findElements(By.tagName("a")); //capturing all the links with anchor 
		int numLinks=allLinks.size();
		System.out.println(numLinks);
		
		for (WebElement webElement : allLinks) {
			
			String textOfLink=webElement.getText();	
			String link=webElement.getAttribute("href");
			System.out.println(textOfLink+" "+link);
			
		}
		System.out.println("========");
	}

}
