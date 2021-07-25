package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableD {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://syntaxprojects.com/table-search-filter-demo.php");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of Rows::" + rows.size());

		Iterator<WebElement> it = rows.iterator();

		while (it.hasNext()) {
			String rowText = it.next().getText();
			System.out.println(rowText);
		}

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of Columns::" + cols);

		for (WebElement col : cols) {

			String colText = col.getText();
			System.out.println(colText);

		}

		driver.close();
	}

}
