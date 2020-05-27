package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");

		String singUpTitle = driver.getTitle();
		System.out.println("Main Page Title is:: " + singUpTitle);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("what is the parent Window handle id::" + parentWindowHandle);

		for (int i = 1; i <= 3; i++) { // i clicked the same button 3 times
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
		}
		Set<String> allWindowHandle = driver.getWindowHandles(); // set to get all windows id

		for (String handle : allWindowHandle) {

			System.out.println(handle);
			driver.switchTo().window(handle);//it gives you the window you wanna work on so i can reach all the window 
			driver.get("https://www.google.com"); //after controlling them i can reach anywebsite i want
			Thread.sleep(2000);
			driver.close();
		}

	}

}
