package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WalMartPractice {

	public static void main(String[] args) {
		
		String url="https://www.ebay.ca/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int num=links.size();
		System.out.println(num);
		
		for (WebElement element : links) {
			
			String names=element.getText();
			System.out.println(names);
			if(names.equals("Electronics")) {
				element.click();
			}
			if(names.equals("Apple")) {
				element.click();
			}
			}
		
			
			
			
		}

			}
		
		
				
		
	

