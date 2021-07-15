package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement years = driver.findElement(By.id("year"));
		WebElement months = driver.findElement(By.id("month"));
		WebElement days = driver.findElement(By.id("day"));

		Select year = new Select(years);
		Select month = new Select(months);
		Select day = new Select(days);

		List<WebElement> allYear = year.getOptions();
		List<WebElement> allMonth = month.getOptions();
		List<WebElement> allDay = day.getOptions();
		
		for (WebElement daysName : allDay) {
			String dayName = daysName.getText();
			System.out.println(dayName);
		}
		
		for (WebElement monthsName : allMonth) {
			String monthName = monthsName.getText();
			System.out.println(monthName);
		}
		
		for (WebElement yearsName : allYear) {
			String yearName = yearsName.getText();
			System.out.println(yearName);
		}

		System.out.println("=================== number of ===================");
		
		System.out.println(allYear.size());
		System.out.println(allMonth.size());
		System.out.println(allDay.size());

		System.out.println("----------------");

		year.selectByValue("1986");
		month.selectByIndex(9);
		day.selectByVisibleText("28");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement isButtonSelected = driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
		boolean radioBisSelected = isButtonSelected.isSelected();
		if(radioBisSelected) {
			System.out.println("gender is selected");
		}else {
			System.err.println("not selected");
		}
		
		Thread.sleep(3000);
		tearDown();

	}

}
