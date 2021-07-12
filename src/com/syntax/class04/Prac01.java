package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac01 {
	
	public static String url = "https://www.demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
			
		WebElement maleRadioB = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		
		System.out.println(maleRadioB.isDisplayed());
		System.out.println(maleRadioB.isEnabled());
		System.out.println("Radio Btn is Selected:"+maleRadioB.isSelected());
		
		//first way to click on a Radio Button	
		maleRadioB.click();
		WebElement maleRadioB1AfterClik = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		
		Thread.sleep(3000);
		System.out.println("Radio Btn is afterclick selected:"+maleRadioB1AfterClik.isSelected());
		
		
	List<WebElement> listRadio = driver.findElements(By.cssSelector("div[class='custom-control custom-checkbox custom-control-inline']"));
		int listR = listRadio.size();
		System.out.println(listR);	
		
//		String hobby="2";
		for(WebElement hobbies:listRadio) {
		
			
			if(hobbies.isEnabled()) {
				String values = hobbies.getAttribute("id");
				System.out.println(values);
//				if(values.equals(hobby)) {
//					hobbies.click();
//					break;
//				}
				
				
				
			}
			
		}
		
		Thread.sleep(3000);
		driver.close();
}}
