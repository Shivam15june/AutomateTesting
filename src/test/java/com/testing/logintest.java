package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
        String url= driver.getCurrentUrl();
        System.out.println("The url of the page is=:"+url);
        
        Thread.sleep(2000);
        
        WebElement ele = driver.findElement(By.xpath("//input[@id='user-name']"));
        ele.sendKeys("performance_glitch_user");
        Thread.sleep(2000);
        
        WebElement ele1=driver.findElement(By.xpath("//input[@id='password']"));
        ele1.sendKeys("secret_sauce123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);
        
        driver.close();

	}

}
