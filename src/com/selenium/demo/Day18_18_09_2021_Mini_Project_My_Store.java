package com.selenium.demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day18_18_09_2021_Mini_Project_My_Store {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("raj8888@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("123456789");
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Evening Dresses'])[3]")).click();
		
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",quickview);
		
		
		WebElement Qty = driver.findElement(By.cssSelector("[class$='quantity_up']"));
			for (int i = 0; i < 9; i++) {
				Qty.click();
			}
			
		WebElement size = driver.findElement(By.id("group_1"));
		Select s1 = new Select(size);
		s1.selectByIndex(2);
		
		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		
		
// Screenshot-1	
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot ts = (TakesScreenshot) driver;	
		File src = ts.getScreenshotAs(OutputType.FILE);	
		File dest = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap11.png");	
		FileUtils.copyFile(src, dest);

// Screenshot-2
		
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();

		js.executeScript("window.scrollBy(0, 450);");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;	
		File src1 = ts1.getScreenshotAs(OutputType.FILE);	
		File dest1 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap12.png");	
		FileUtils.copyFile(src1, dest1);
		
// Screenshot-3		
		
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		
		js.executeScript("window.scrollBy(0, 450);");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;	
		File src2 = ts2.getScreenshotAs(OutputType.FILE);	
        File dest2 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap13.png");	
		FileUtils.copyFile(src2, dest2);
		
// Screenshot-4
		
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
		js.executeScript("window.scrollBy(0, 450);");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot ts3 = (TakesScreenshot) driver;	
		File src3 = ts3.getScreenshotAs(OutputType.FILE);	
		File dest3 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap14.png");	
		FileUtils.copyFile(src3, dest3);

		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
// Screenshot-5
		
		driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']")).click();
		
		js.executeScript("window.scrollBy(0, 450);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot ts4 = (TakesScreenshot) driver;	
		File src4 = ts4.getScreenshotAs(OutputType.FILE);	
		File dest4 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap15.png");	
		FileUtils.copyFile(src4, dest4);
		
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		
// Screenshot-6		
		
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		
		js.executeScript("window.scrollBy(0, 450);");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot ts5 = (TakesScreenshot) driver;	
		File src5 = ts5.getScreenshotAs(OutputType.FILE);	
		File dest5 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap16.png");	
		FileUtils.copyFile(src5, dest5);
	}
}
