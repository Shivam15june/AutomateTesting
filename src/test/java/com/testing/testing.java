package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		WebElement ele = driver.findElement(By.id("user-name"));

		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");

		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		System.out.println("*************");

		driver.navigate().back();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);

		driver.close();

	}

}
