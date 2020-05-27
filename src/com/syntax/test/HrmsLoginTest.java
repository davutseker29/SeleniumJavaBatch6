package com.syntax.test;

import org.openqa.selenium.WebElement;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods{

	public static void main(String[] args) {
		//http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		
	setUp();
	
	LoginPage login=new LoginPage();
	
	sendText(login.username, ConfigsReader.getProperty("username"));
	
	sendText(login.password, ConfigsReader.getProperty("password"));	
	
	click(login.loginBtn);
	
	
	
	wait(5);
	
	tearDown();

	}

	

}
