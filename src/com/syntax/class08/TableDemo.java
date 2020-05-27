package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemo {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		int numOfRows=row.size();
		System.out.println("Number of size is:: "+numOfRows);
		
		Iterator<WebElement> it = row.iterator();
		while(it.hasNext()) {
			String rowText=it.next().getText();
			System.out.println(rowText);
		}
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		int numOfCols=col.size();
		System.out.println("Number of columns is:: "+numOfCols);
		
		for (WebElement element : col) {
			String colText = element.getText();
			System.out.println(colText);
			
			
		}
		
		
		driver.close();
		
	}

}
