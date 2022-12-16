package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement use = driver.findElement(By.name("userName"));
		use.sendKeys("shivam");
		
		WebElement pass = driver.findElement(By.name("password1"));
		pass.sendKeys("password");
		
		Thread.sleep(2000);
		
		WebElement sub = driver.findElement(By.name("submit"));
		sub.click();
		
	
	}
	

}
