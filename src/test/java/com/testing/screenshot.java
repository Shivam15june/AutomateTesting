package com.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("user-name"));
		ele.sendKeys("performance_glitch_user");
		
		WebElement ele1= driver.findElement(By.name("password"));
		ele1.sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		driver.close();
		


		
TakesScreenshot sc = ((TakesScreenshot)driver);
		
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2= new File("C:\\image\\login5.png");
		FileUtils.copyFile(src, f2);

}
}
