package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_02_09_2021_Chrome_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
		
		//Parent               //Child  ---> Upcasting  
		WebDriver driver = new ChromeDriver();
	  //Interface //Reference  //Class  ---> Multiple Inheritance
		          //Name
		
		//get() ---> Launch a new browser and opens the given URL
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//getTitle()---> Return the current page title
		
    //  String title = driver.getTitle();
	//	System.out.println(title);
		
		//getCurrentURL()---> Return the current page URL
		
	//	String currentUrl = driver.getCurrentUrl();
	//	System.out.println(currentUrl);
		
		//getPageSource() ---> Return the current page source code
		
	//	String pageSource = driver.getPageSource();
    //  System.out.println(pageSource);
        
        //Navigate Methods
        //to() ---> Navigate the given URL
        driver.navigate().to("https://www.google.com/");
        
        //back() ---> Back to previous page
        driver.navigate().back();
  
        //forward() ---> forward to the next page 
        driver.navigate().forward();
        
        //refresh ---> it refresh current page 
        driver.navigate().refresh();
        
        driver.close();
   }
}
