package com.selenium.demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_20_20_09_2021_Task3_Myntra {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/tshirt");
		
		
		Actions act = new Actions(driver);
		
		List<WebElement> All_Price = driver.findElements(By.xpath
				("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		
		List<Integer>price = new ArrayList<>();
		
		for (int i = 0; i < All_Price.size(); i++) {
			
		    String text = All_Price.get(i).getText().replace("Rs. ","");
		    System.out.println(text);
		    
		    if (text.contains("599")) {
		    	
		    	WebElement elem = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[" + i + "]"));
				
		    	elem.click();
		    	
		    	break;
			}
		}
		
	}
	
}
