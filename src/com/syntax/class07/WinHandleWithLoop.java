package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String text = driver.getTitle();
		System.out.println(text);

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);

		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.cssSelector("button[id=tabButton]")).click();
			Thread.sleep(3000);
		}

		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());

		for (String handle : allWin) {
			System.out.println("Id of the window "+handle);
			driver.switchTo().window(handle);
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.close();
			
		}
		driver.quit();
	}

}
