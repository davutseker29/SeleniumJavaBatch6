package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class DeltaCalendar extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//button[text()='Canada - English']")).click();
		driver.findElement(By.id("input_departureDate_1")).click();

		String dMonth = driver.findElement(By.cssSelector("span[class='dl-datepicker-month-0']")).getText();

		while (!dMonth.equals("May")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			dMonth = driver.findElement(By.cssSelector("span[class='dl-datepicker-month-0']")).getText();

		}
		
		
		
		List<WebElement> dDay = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		for (WebElement day : dDay) {
			String allDay=day.getText();
			if(allDay.equals("16")) {
				day.click();
				break;
			}
		}
		
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();

		while(!returnMonth.equals("March")) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			Thread.sleep(2000);
			returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		}
		
		List<WebElement> rDays = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']//td"));
		for (WebElement rDay : rDays) {
			String reDay=rDay.getText();
			if(reDay.equals("27")) {
				rDay.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[text()='done']")).click();
		
		
		Thread.sleep(3000);
		tearDown();
	}

}
