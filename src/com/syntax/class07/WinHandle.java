package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
		driver.manage().window().maximize();
		String text = driver.getTitle();
		System.out.println(text);

		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle ID is::" + ParentWindowHandle);

		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(3000);

		Set<String> allWindows = driver.getWindowHandles();
		int size = allWindows.size();
		System.out.println(size);

		Iterator<String> all = allWindows.iterator();
		while (all.hasNext()) {
			String handle = all.next();
			if(!handle.equals(ParentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(2000);
			}
		}

	}

}
