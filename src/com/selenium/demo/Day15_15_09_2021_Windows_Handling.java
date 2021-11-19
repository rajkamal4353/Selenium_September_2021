package com.selenium.demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day15_15_09_2021_Windows_Handling {
	
	public static void main(String[] args)throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobile).perform();
		
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement electronic = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		
		act.contextClick(electronic).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement computer = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		
		act.contextClick(computer).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		//-----------------------Windows Handling---------------------------//
		
		
		//getWindowHandle()---> return parent window id
		
		//String WindowHandle = driver.getWindowHandle();
		
		//String title = driver.switchTo.window(windowHandle).getTitle();
		
		//System.out.println(Title);
		
		//getWindowHandles() ---> return all active window id
		
		
		Set<String> activeWindow = driver.getWindowHandles();
		
		//Iterate
		
//		for (String str : activeWindow) {
			
//			String active =  driver.switchTo().window(str).getTitle();
//		System.out.println(active);
//			Thread.sleep(2000);
//		}
		
		//iterate
		
//		String s="Computers & Accessoies: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		
//		for (String str : activeWindow) {
//			if(driver.switchTo().window(str).getTitle().contentEquals(s)) {
//				break;
				
//			}
		
		
		Iterator<String> ite = activeWindow.iterator();
		
//		while(ite.hasNext()) {
			
//			String next = ite.next();
//			String title = driver.switchTo().window(next).getTitle();
//			System.out.println(title);
		
		
		String Amazon_Home = ite.next();
		
		String Computer = ite.next();
		
		String Electronics = ite.next();
		
		String Mobile = ite.next();
		
		driver.switchTo().window(Mobile);
	}
	
}

