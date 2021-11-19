package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_11_09_2021_Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("http://demo.automationtesting.in/Frames.html");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		//iframe ---> id or name, index, Webelement
		
		driver.switchTo().frame("singleframe");
        WebElement input1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        input1.sendKeys("Hello Frame!!!");
        
        driver.switchTo().defaultContent();
        WebElement nestedframetab = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        nestedframetab.click();
        
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);
        
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);
        
        WebElement input2 = driver.findElement(By.xpath("//input[@type='text'][1]"));
        input2.sendKeys("Hello Java!!!");  
	}
}
