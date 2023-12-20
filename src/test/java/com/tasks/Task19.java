package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task19 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Guvi Ex
		
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Karun");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xwix7@soebing.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Royal@99");
		driver.findElement(By.cssSelector("[class='form-control countrycode-left']")).sendKeys("9118776655");
		driver.findElement(By.cssSelector("[class='btn signup-btn']")).click();
		WebElement drop =driver.findElement(By.id("profileDrpDwn"));		
        Select select1 = new Select(drop);
        select1.selectByIndex(2);

		WebElement dropdeg = driver.findElement(By.id("degreeDrpDwn"));
		Select select2 = new Select(dropdeg);
        select2.selectByIndex(5);
        
        driver.findElement(By.id("year")).sendKeys("2020");
        driver.findElement(By.xpath("//a[@id='details-btn']")).click();

		//driver.findElement(By.className("laterBtn btn")).click();

	}

}
