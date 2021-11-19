package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day18_18_09_2021_Task1_My_Store {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\eclipse-workspace\\SeleniumSeptember2021\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		
//		String windowHandle = driver.getWindowHandle();
//		String title = driver.switchTo().window(windowHandle).getTitle();
//		System.out.println(title);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(2000);
		
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("raj8888@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(3000);
		
		
		WebElement Firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Firstname.sendKeys("Rajkamal");
		Thread.sleep(2000);
		
		WebElement Lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Lastname.sendKeys("Muniappan");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
		password.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1 = new Select(Day);
		s1.selectByValue("13");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2 = new Select(Month);
		s2.selectByVisibleText("May ");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s3 = new Select(Year);
		s3.selectByIndex(20);
		
		WebElement t = driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']"));
		String text = t.getText();
		System.out.println(text);
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
		WebElement t1 = driver.findElement(By.xpath("//label[text()='Receive special offers from our partners!']"));
		String text2 = t1.getText();
		System.out.println(text2);
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	    company.sendKeys("raj@co");
	    
	    WebElement t2 = driver.findElement(By.xpath("//span[text()='Street address, P.O. Box, Company name, etc.']"));
		String text3 = t2.getText();
		System.out.println(text3);
	    
	    WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
	    address.sendKeys("55/6789,Patel Nagar");
	    
	    WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	    city.sendKeys("Sivagangai");
	    Thread.sleep(2000);
	    
	    WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
	    Select s4 = new Select(state);
	    s4.selectByIndex(15);
	    
	    WebElement postal = driver.findElement(By.xpath("//input[@name='postcode']"));
	    postal.sendKeys("98765");
	    
	    WebElement t3 = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	    t3.sendKeys("Hey!!!");
	    
	    WebElement ph = driver.findElement(By.xpath("//input[@name='phone']"));
	    ph.sendKeys("9182736450");
	    
	    WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	    mobile.sendKeys("9182736450");
	    
	    WebElement add = driver.findElement(By.xpath("//input[@name='alias']"));
	    add.sendKeys("My Address");
	    
	    
	    driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//a[@title='Home']")).click();
 
   }
}
