package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		//click on File Upload link
		driver.findElement(By.xpath("//a[text()= 'File Upload']")).click();
		
		//We simply use sendkeys() method to upload the file.
		//locate the choose element and send() path of file to it.
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (50).png");
		
		//click on upload button
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
