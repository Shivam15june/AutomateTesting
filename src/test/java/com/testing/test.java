package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static void main(String[] args) {
		
	

	 WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	 String baseUrl = "http://demo.guru99.com/test/upload/";
     

     driver.get(baseUrl);
     WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));

     // enter the file path onto the file-selection input field
     uploadElement.sendKeys("D:\\newhtml.html");

     // check the "I accept the terms of service" check box
     driver.findElement(By.id("terms")).click();

     // click the "UploadFile" button
     driver.findElement(By.name("send")).click();
	

}

}