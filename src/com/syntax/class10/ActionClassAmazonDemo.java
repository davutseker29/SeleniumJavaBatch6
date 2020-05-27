package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {

	public static void main(String[] args) {
		
		String url="http://www.amazon.com/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement account=driver.findElement(By.id("nav-link-accountList"));
		//hovering over the menu (not clicking)
		Actions action=new Actions(driver);
		action.moveToElement(account).perform();
		WebElement element=driver.findElement(By.id("nav-flyout-ya-newCust"));
		
		if(element.getText().contains("Start")){
			System.out.println("Menu display");
		}else {
			System.out.println("Menu was not dispalyed");
		}
		
		//How to right-click on a element
		action.contextClick(element).perform();		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));		
		//how to double click on a element.
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.close();
		
		
	}

}
