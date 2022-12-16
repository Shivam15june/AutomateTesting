package com.testing;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gooletest {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/events/greatindianfestival");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

		driver.findElement(By.xpath("//img[@alt='Redmi A1 | starting from 5319 (including additional offers)']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@data-testid='grid-filter-PRICE']//li[1]//div[1]//a[1]")).click();
		Thread.sleep(2000);

		driver.close();

	}
}