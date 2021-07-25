package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertD extends BaseClass {

	public static void main(String[] args)  {

		setUp();

		//handling simple alert
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text::" + simpleAText);
		simpleAlert.accept();

		//handling comfirmation alert
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Alert confirm = driver.switchTo().alert();
		String confirmText = confirm.getText();
		System.out.println("This is confirm alert text::" + confirmText);
		confirm.dismiss();
		
		//handling prompt alerts/confirmation alerts by providing some confirmation massage
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText();
		System.out.println("This is prompt alet text::"+promptText);
		String key="Davut";
		promptAlert.sendKeys(key);
		promptAlert.accept();
		
		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		if(text.contains("Davut")) {
			System.out.println("Successfully added");
		}else {
			System.err.println("Not added");
		}
		
		
		
		
		tearDown();

	}

}
