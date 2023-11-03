package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task16 {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. Firefox Browser Ex
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 String url = driver.getCurrentUrl();
		 
		 System.out.println(url);
		 driver.close();

		 
	
		 
	
	
		
		//2.Chrome Browser Ex
		 driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 String title =driver.getTitle();
		 System.out.println(title);
		 
		 String a = "STORE";
		 
		 if (title.equals(a)) {
			 System.out.println("Page landed on correct website");
		 }
		 else {
			 System.out.println("Page not landed on correct website");
			 
		 }
		 driver.close();
		 
		 
		 
		 //3.Chrome Browser EX2
		 driver = new ChromeDriver();
		 driver.get("https://www.wikipedia.org/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 WebElement History =driver.findElement(By.xpath("//a[@href='#History']"));
		 History.click();
		 String Title =driver.getTitle();
		 System.out.println("The Title is "+Title);
		 driver.close();
		 
		
		
	}

}
