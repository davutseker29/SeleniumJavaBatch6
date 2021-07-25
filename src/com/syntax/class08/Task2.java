package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://syntaxprojects.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Table']")).click();
		driver.findElement(By.xpath("//a[text()='Table Data Search']")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//thead[@class='thead-inverse']/tr/th"));
		System.out.println("Number of rows::"+rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
			
		String rowText=rows.get(i).getText();
		System.out.println(rowText);
			
		}
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']//tbody/tr/td[1]"));
		System.out.println("Number of cols::"+cols.size());
		
		Iterator<WebElement> it = cols.iterator();
		while (it.hasNext()) {
			String colsName=it.next().getText();
			System.out.print(colsName+" ");
		}System.out.println();
		
		System.out.println("===================printing all=====================");
		
		List<WebElement> printAll = driver.findElements(By.xpath("//table[@class='table']//tbody/tr/td"));
		System.out.println("Number of elements::"+printAll.size());
		
		for(int j=0; j<printAll.size();j++) {
			String all=printAll.get(j).getText();
			System.out.println(all);
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
