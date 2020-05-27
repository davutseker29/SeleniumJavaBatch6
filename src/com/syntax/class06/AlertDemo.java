package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp(); // Below code is for UItestPractice.com

		// Max the windows screen
		driver.manage().window().maximize();

		// Handling simple alert/PopUps
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String simpleText = simpleAlert.getText();
		System.out.println("This is simple alert text:: " + simpleText);
		simpleAlert.accept();

		// Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmText = confirmAlert.getText();
		System.out.println("This is Confirm alert text ::" + confirmText);
		Thread.sleep(3000);
		confirmAlert.dismiss();

		// Handling Prompt alerts/confirmation alerts by providing some confirmation
		// message
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("This is Prompt alert text:: " + promptAlert.getText());
		promptAlert.sendKeys("Alex");
		Thread.sleep(3000);
		promptAlert.accept();

		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		if (text.contains("Alex")) {
			System.out.println("Text was successfully added");
		}else{
			System.err.println("Text was not entered");
		}
		
		
		

		//		BaseClass.tearDown();

	}
}
