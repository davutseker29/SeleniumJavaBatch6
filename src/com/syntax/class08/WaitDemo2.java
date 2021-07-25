package com.syntax.class08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class WaitDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement cBox = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));
		cBox.click();
		WebElement checkBox = driver.findElement(By.cssSelector("input[type=checkbox]"));
		checkBox.click();
		WebElement btn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
		btn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement massage = wait.until(ExpectedConditions.presenceOfElementLocated((By.id("message"))));
		String text = massage.getText();
		System.out.println(text);
		
		WebElement backBtn = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
		backBtn.click();
		WebElement massage2 = wait.until(ExpectedConditions.presenceOfElementLocated((By.id("message"))));
		String text2 = massage2.getText();
		System.out.println(text2);
		
		
		BaseClass.tearDown();
	}

}
