package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//it is inside to frame so need to move in to frame with switchTo() method
		driver.switchTo().frame(0);
		//this what  i want to drag
		WebElement drag=driver.findElement(By.id("draggable"));
		//this is where i want to drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//create Action Class
		Actions action=new Actions(driver);
		//dragged dropped and released it
		//LONGER WAY
//		action.clickAndHold(drag).moveToElement(drop).release().perform();
//		driver.navigate().refresh();
		//sHORT wAY
		action.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
	}
	

}
