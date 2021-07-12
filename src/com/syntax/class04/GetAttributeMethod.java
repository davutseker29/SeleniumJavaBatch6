package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {

		String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement userName=driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		String text=userName.getAttribute("value");//it will return the value of any attribute you specify.

		System.out.println(text);
		
		

	}

}