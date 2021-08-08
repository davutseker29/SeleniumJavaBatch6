package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException{
		
		//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		setUp();
		
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.className("button")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Create an object of TakesScreenshot interface and cast the WebDriver with it
		TakesScreenshot ts=(TakesScreenshot) driver;
		//Use getScreenShotAs() method to take the screen shot(int the constructor pass Type.File)
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		//Copy the file from source to a another destination 
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboards.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Screenshot wan not taken");
		}
		
		BaseClass.tearDown();
	}

}
