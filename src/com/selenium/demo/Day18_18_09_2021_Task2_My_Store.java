package com.selenium.demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day18_18_09_2021_Task2_My_Store {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		String windowHandle = driver.getWindowHandle();
		String Title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(Title);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("raj6565@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("raj689");
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//a[normalize-space()='Evening Dresses'])[3]")).click();
		
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",quickview);
		
		
		WebElement qty = driver.findElement(By.cssSelector("[class$='quantity_up']"));
		
			for (int i = 0; i < 9; i++) {
				qty.click();
			}
			
			
		WebElement size = driver.findElement(By.id("group_1"));
		Select s1 = new Select(size);
		s1.selectByIndex(2);
		
		
		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
		
		//Screenshot 	
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File src = ts.getScreenshotAs(OutputType.FILE);	
		File dest = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap1.png");	
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();

		
		js.executeScript("window.scrollBy(0, 500);");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;	
		File src1 = ts1.getScreenshotAs(OutputType.FILE);	
		File dest1 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap2.png");	
		FileUtils.copyFile(src1, dest1);
   }
}