package com.tasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Task21 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//1 question
		 driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/iframe");
		 driver.manage().window().maximize();
		 driver.switchTo().frame("mce_0_ifr");
		WebElement Iframe= driver.findElement(By.tagName("p"));
		
		 Iframe.clear();
		
		 Iframe.sendKeys("Hello people");
		 Thread.sleep(2000);
		 
		 //2 question
		 
		 driver.get("https://the-internet.herokuapp.com/windows");
		 String window1 = driver.getWindowHandle();
		 driver.findElement(By.partialLinkText("Click")).click();
		 Set<String> allwindows = driver.getWindowHandles();
		 
		 for(String eachwindow:allwindows) {
				Thread.sleep(2000);
			 driver.switchTo().window(eachwindow);
		 }
		 Thread.sleep(3000);
		 String Childwindow = driver.findElement(By.tagName("h3")).getText();
		 System.out.println(Childwindow);
		 String Expected=("New Window");
		 		
		if(Childwindow.equals(Expected)) {
			System.out.println("success");
		}
		else {System.out.println("no");}
		
		//3 question
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
		 driver.switchTo().frame(0);
		 WebElement Left =driver.findElement(By.tagName("body"));
		 String textL =Left.getText();
		 System.out.println(textL);
			if(textL.equals("LEFT")) {
				System.out.println("success");
			}
			else {System.out.println("no");}

				 
		 	
}
}
