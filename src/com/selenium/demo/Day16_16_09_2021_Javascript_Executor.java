package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16_16_09_2021_Javascript_Executor {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
	//	mob.click();
		
		js.executeScript("arguments[0].click();", mob);
		
		js.executeScript("window.scrollBy(0,6000);");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-6000);");
		
		WebElement shop = driver.findElement(By.xpath("//h2[text()='Shop by feature']"));
		
		js.executeScript("arguments[0].scrollIntoView();",shop);
		
		js.executeScript("alert('Hi World');");
	}
}
