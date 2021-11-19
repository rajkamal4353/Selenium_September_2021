package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day14_14_09_2021_Action_Class {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
	        driver.get("https://demoqa.com/buttons");
			
			WebElement dynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
			Actions act = new Actions(driver);
			act.click(dynamicClick).perform();
			
			WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
			act.contextClick(rightClick).build().perform();
			
			WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
			act.doubleClick(doubleClick).perform();
			
	//		WebElement about = driver.findElement(By.xpath("//a[text()='About Us']"));
	//		act.moveToElement(about).perform();
	//		act.contextClick(about).perform();
			
			
	//		driver.get("https://demoqa.com/droppable");
	//		Actions act = new Actions(driver);
			
	//		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	//		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	//		act.dragAndDrop(src, target).perform();
			
	  }
}
