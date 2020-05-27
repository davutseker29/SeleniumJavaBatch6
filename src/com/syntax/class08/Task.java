package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		String url="http://166.62.36.207/syntaxpractice/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		String text=driver.getTitle();
		System.out.println(text);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul/li[2]/a")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		int rows=row.size();
		System.out.println(rows);
		
		for (WebElement webElement : row) {
			
			String elements=webElement.getText();
			System.out.println(elements);
		}
		
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		int cols=head.size();
		System.out.println(cols);
		
		Iterator<WebElement> it = head.iterator();
		while(it.hasNext()) {
			String heads=it.next().getText();
			System.out.println(heads);
		}
		
		
		driver.close();
	}
}
