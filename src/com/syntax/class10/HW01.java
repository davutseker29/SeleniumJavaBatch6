package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW01 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
		 * 
		 * 1-Login to the application by writing xPath based on Parent and Child
		 * Relation 2-Login to the application by writing xPath based on
		 * "following and preceding siblings"
		 */

		setUp();

		WebElement username = driver.findElement(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div/input[@name='txtUsername']"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div/input[@name='txtPassword']"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//div[@id='logInPanelHeading']/following-sibling::div/input[@name='Submit']")));

		WebElement welcomeText = driver.findElement(By.id("welcome"));
		waitForVisibility(welcomeText);
		String text = welcomeText.getText();
		if (text.equals("Welcome Admin")) {
			System.out.println("Logged in succesfully");
		} else {
			System.out.println("not logged in");
		}

		Thread.sleep(3000);
		tearDown();
	}

}
