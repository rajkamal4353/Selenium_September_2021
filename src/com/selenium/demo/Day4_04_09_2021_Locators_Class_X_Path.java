package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day4_04_09_2021_Locators_Class_X_Path{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com//");
		
		//findelement  ---> Webelement      ---> get single element
		//findelements ---> List<WebElement ---> get group of element 
		
		//ID Locators 
		WebElement email = driver.findElement(By.id("email"));
		
		//sendkeys() ---> pass the input values
		email.sendKeys("empire@gmail.com");
		
		//Name Locators
	    WebElement password = driver.findElement(By.name("pass"));
	    
	    password.sendKeys("123456789");
	    
	//  ClassName Locators
	//  WebElement loginBtn = driver.findElement(By.name("login"));
	    
    //  click() ---> click on element
	    
	//  loginBtn.click();
	    
	    WebElement createBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    createBtn.click();
	    Thread.sleep(3000);
	    
	    WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    firstname.sendKeys("raj");
	    
	    WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    surname.sendKeys("muniappan");
	    Thread.sleep(3000);
	    
	    WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
	    String text = mobile.getText();
	    System.out.println(text);
	    
	    WebElement mobileNumber = driver.findElement(By.xpath("//input[contains(@aria-label,'number or email address')]"));
	    mobileNumber.sendKeys("8899776655");
	    
	    
	    WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    pass.sendKeys("889876qwerty");
	    
	    WebElement FBtxt = driver.findElement(By.xpath("//p[contains(text(),'Sign Up, you agree to')]"));
	    String text2 = FBtxt.getText();
	    System.out.println(text2);
	    
	//    firstname.clear();
	    
	// ---------------------DropDown---------------------
	    
	//Select ---> Class    
	    
	    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s1 = new Select(day);
	    s1.selectByValue("18");
	    
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s2 = new Select(month);
	    s2.selectByValue("May");
	    
   //   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
   //   Select s3 = new Select(year);
   //   s3.selectByValue("2021");
	    
	    Select s3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	    s3.selectByIndex(5);
   }
}
