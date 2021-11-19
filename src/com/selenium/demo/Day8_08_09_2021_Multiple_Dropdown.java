package com.selenium.demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8_08_09_2021_Multiple_Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select s = new Select(state);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		//s.getOptions();
		
		List<WebElement> options = s.getOptions();
		
		
		//iterate
		
	    Iterator<WebElement> ite = options.iterator();
		
	    while (ite.hasNext()) {
	    	
			WebElement states = ite.next();
			
			String text = states.getText();
			
			System.out.println(text);
	    }
			s.selectByValue("Florida");
			s.selectByIndex(3);
			s.selectByValue("Pennsylvania");
			s.selectByValue("Washington");
			
			
			// getAllSelectedOptions()
			
			System.out.println("-----------------------");
			
			List<WebElement> selectedOptions = s.getAllSelectedOptions();
			
			
			//iterate
			
			for (WebElement all : selectedOptions) {
				
			String text = all.getText();
			
			System.out.println(text);
			
			}
			
			s.deselectByValue("Washington");
			
			s.deselectAll();
	}
	
}
