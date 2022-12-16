package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testnew {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//input[@id='name']"));
		ele.sendKeys("Preeti");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("country"));
		ele1.sendKeys("India");

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("//input[@id='city']"));
		ele2.sendKeys("Noida");

		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.xpath("//input[@id='card']"));
		ele3.sendKeys("Axis@123");

		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.xpath("//input[@id='month']"));
		ele4.sendKeys("Nove,ber");

		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.xpath("//input[@id='year']"));
		ele5.sendKeys("2022");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
//		
	}
}
