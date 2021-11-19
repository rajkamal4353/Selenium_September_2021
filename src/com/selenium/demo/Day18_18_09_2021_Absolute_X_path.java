package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_18_09_2021_Absolute_X_path {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		
		//AbsoluteXpath ---> H1 tag
		
		WebElement textValue = driver.
				findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1"));
		
		System.out.println(textValue.getText());
		
		System.out.println("-------------------------");
		
		//AbsoluteXpath ---> H2 tag
		
		List<WebElement> findElements = driver.
				findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
		
		//iterate
		
		for (WebElement ele : findElements) {
			System.out.println(ele.getText());
		}
	}
}
