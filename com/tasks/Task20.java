package com.tasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task20 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@src ='/resources/demos/datepicker/default.html']"));
		driver.switchTo().frame(frames);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("//a[@data-date='22']")).getText();
		Thread.sleep(5000);
		System.out.println(a);
		
		
		driver.close();

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//2.Guvi Ex
		
		//this code was written before the changes made in guvi

		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class ='nav-link btn btn-primary text-white px-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Karun");
		//Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Elango");
		//Thread.sleep(2000);
		driver.findElement(By.id("emailInput")).sendKeys("xawopix617@soebing.com");
		driver.findElement(By.id("passwordInput")).sendKeys("Royal@99");
		driver.findElement(By.id("mobileNumberInput")).sendKeys("9888776655");
		driver.findElement(By.id("signup")).click();
		driver.findElement(By.id("status_proceed")).click();
		driver.findElement(By.id("login_email")).sendKeys("xawopix617@soebing.com");
		driver.findElement(By.id("login_password")).sendKeys("Royal@99");
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		//This code was written after changes made in guvi url
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class ='nav-link btn btn-primary text-white px-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Karun");
		driver.findElement(By.id("email")).sendKeys("xwix617@soebing.com");
		driver.findElement(By.id("password")).sendKeys("Royal@99");
		driver.findElement(By.id("mobileNumber")).sendKeys("9118776655");
		driver.findElement(By.id("signup-btn")).click();
		
		WebElement drop =driver.findElement(By.id("profileDrpDwn"));		
        Select select1 = new Select(drop);
        select1.selectByIndex(2);

		WebElement dropdeg = driver.findElement(By.id("degreeDrpDwn"));
		Select select2 = new Select(dropdeg);
        select2.selectByIndex(5);
        
        driver.findElement(By.id("year")).sendKeys("2020");
        driver.findElement(By.xpath("//a[@id='details-btn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='mr-2']")).click();
        driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
        Thread.sleep(2000);
        WebElement email =driver.findElement(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc9J CDELXb']"));
        email.sendKeys("e.karunagarn@gmail.com");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
        


	}

}
