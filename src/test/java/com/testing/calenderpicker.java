package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderpicker {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.ixigo.com/trains");
			driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//input[@placeholder='Leaving from']")).click();
			Thread.sleep(2000);
			WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Going to']"));
			
			ele.sendKeys("Nagpur");
			
			ele.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='depart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='search u-ib u-v-align-bottom']//div[@class='u-ripple']")).click();
			Thread.sleep(2000);
			driver.close();
			
			
			
		

	}

}
