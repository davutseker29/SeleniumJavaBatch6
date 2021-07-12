package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommends {

	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username="Tester";
	public static String password="test";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']"));
		userName.sendKeys(username);
		System.out.println(userName.getAttribute("value"));
		
		WebElement userPassword = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$password']"));
		userPassword.sendKeys(password);
		System.out.println(userPassword.getAttribute("value"));
		
		WebElement loginBtn = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$login_button']"));
		loginBtn.click();
		
		boolean webOrders = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		System.out.println("Web Orders displayed::"+webOrders);
		
		
		WebElement loginInfo = driver.findElement(By.cssSelector("div[class=login_info]"));
		String info=loginInfo.getText();
		
		if(info.contains(username)) {
			System.out.println("Test Case passed");
		}else {
			System.out.println("Test Case failed");
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
