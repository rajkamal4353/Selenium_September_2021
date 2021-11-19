package com.selenium.demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day30_30_09_2021_Adactin_Hotel_Mini_Project {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		user_name.sendKeys("66668888");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("Brisbane");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByIndex(3);
		
		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s3 = new Select(room_type);
		s3.selectByIndex(3);
		
		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4 = new Select(room_nos);
		s4.selectByIndex(8);
		
		WebElement checkin_date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin_date.sendKeys("17/10/2021");
		
		WebElement checkout_date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout_date.sendKeys("18/10/2021");
		
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5 = new Select(adult);
		s5.selectByIndex(3);
		
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s6 = new Select(child);
		s6.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		first_name.sendKeys("Rajkamal");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		last_name.sendKeys("Muniappan");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("6/88R,Batman road,Gotham City,Brisbane");
		
		WebElement cc_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cc_no.sendKeys("8675432101234576");
		
		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s7 = new Select(cc_type);
		s7.selectByIndex(3);
		
		WebElement exp_date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8 = new Select(exp_date);
		s8.selectByIndex(8);
		
		WebElement exp_yr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9 = new Select(exp_yr);
		s9.selectByIndex(12);
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("568");
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement get = driver.findElement(By.xpath("(//td[@align='right'])[17]"));
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;	
		File src1 = ts1.getScreenshotAs(OutputType.FILE);	
		File dest1 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\AH1.png");	
		FileUtils.copyFile(src1, dest1);
		
		
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;	
		File src2 = ts2.getScreenshotAs(OutputType.FILE);	
		File dest2 = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\AH2.png");	
		FileUtils.copyFile(src2, dest2);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}
}
