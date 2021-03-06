package com.selgrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//http://146.89.106.93:8080/ecmms.html
public class WorkPlaceXT {
	@Test
	public void workPlaceXTChrome() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://146.89.106.93:8080/ecmms.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("WorkPlaceXT Page title is =====>>: " + title);
		System.out.println("WorkPlaceXT URL  is =====>>: " + driver.getCurrentUrl());
		Thread.sleep(5000);
		// click on SIT XT LINK
		driver.findElement(By.xpath("//a[text()='Workplace XT']")).click();
		
		System.out.println("Clicked on SIT XT Link....");
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
