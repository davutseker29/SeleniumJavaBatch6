package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HW extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * TC 2: Delete Employee Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
		 * the application Add Employee Verify Employee has been added Go to Employee
		 * List Delete added Employee Quit the browser
		 */

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.id("btnLogin")));

		WebElement pimLink = driver.findElement(By.linkText("PIM"));
		waitForClickability(pimLink);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		waitForVisibility(driver.findElement(By.id("employeeId")));

		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empID);

		sendText(driver.findElement(By.id("firstName")), "Hakki");
		sendText(driver.findElement(By.id("lastName")), "Hakkiydi");
		click(driver.findElement(By.id("btnSave")));

		String empIDInfo = driver.findElement(By.id("profile-pic")).getText();

		if (empIDInfo.equals("Hakki Hakkiydi")) {
			System.out.println("Employee is created");
		} else {
			System.out.println("Employee is not created");
		}

		driver.findElement(By.linkText("Employee List")).click();

		boolean found = false;
		while (!found) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

			for (int i = 0; i < rows.size(); i++) {
				String rowText = rows.get(i-1).getText();
				if(rowText.contains(empID)) {
					found=true;
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[\"+i+\"]/td[1]")).click();
					driver.findElement(By.id("btnDelete")).click();
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}
			}
			
			driver.findElement(By.xpath("//a[text()='Next']")).click();
		}

		Thread.sleep(4000);
		tearDown();

	}

}
