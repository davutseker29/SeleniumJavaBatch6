package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	public WebElement username=driver.findElement(By.id("txtUsername")); //instance class
	
	public WebElement password=driver.findElement(By.id("txtPassword")); //instance class
	
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));//instance class
	

}
