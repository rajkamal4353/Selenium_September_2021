package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day18_18_09_2021_Wait_Concept {
	
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com//");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("empire@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		WebElement createBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createBtn.click();
	
		 
        //Thread.sleep(10000); //Static Wait	
		 
		 
		//Wait Concept
		 
		//Implicity Wait
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		 
		//Explicity Wait 
		 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(firstname));
		 
		//Fluent Wait 
		 
		Wait wait1 = new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class);
		 
	}
	
}
