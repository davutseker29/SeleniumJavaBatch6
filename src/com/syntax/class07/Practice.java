package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.ConfigsReader;

public class Practice {

	public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("a[href='https://syntaxtechs.com']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itWin = allWindows.iterator();
		
		String firstWinPage = itWin.next();
		System.out.println(firstWinPage);
		
		String secondWinPage=itWin.next();
		System.out.println(secondWinPage);
		
		driver.switchTo().window(secondWinPage);
		
		driver.findElement(By.cssSelector("a[href='https://www.youtube.com/channel/UCJZ53EsAlk5uZgJPfeD9oEg/featured']")).click();
		
		driver.close();
	}

}
