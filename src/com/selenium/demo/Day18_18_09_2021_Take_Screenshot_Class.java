package com.selenium.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_18_09_2021_Take_Screenshot_Class {
	
	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//Convert web driver object to TakeScreenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Call getScreenshotAs method to create image file 
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//create a file Location 
		
		File dest = new File("C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\Screenshot\\snap6.png");
		
		//Copy file to desired Location
		
		FileUtils.copyFile(src, dest);
		
	}
}
