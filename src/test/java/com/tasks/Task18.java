package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task18 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//1.Facebook EX
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");

        // Check if the current URL is the Facebook homepage.
        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
            System.out.println("Successfully redirected to Facebook homepage.");
        } else {
            System.out.println("Not redirected to Facebook homepage.");
        }
        
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Test");
        driver.findElement(By.name("lastname")).sendKeys("User");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("8076645332");
        driver.findElement(By.id("password_step_input")).sendKeys("Royal@99");
       WebElement day = driver.findElement(By.id("day"));
       Select select1 = new Select(day);
       select1.selectByIndex(10);
       
       WebElement month = driver.findElement(By.id("month"));
       Select select2 = new Select(month);
       select2.selectByIndex(4);
       
       WebElement year = driver.findElement(By.id("year"));
       Select select3 = new Select(year);
       select3.selectByValue("1985"); 
       
       driver.findElement(By.xpath("//input[@value='2']")).click();
       driver.findElement(By.xpath("//button[@name='websubmit']")).click();
       
       driver.close();
       
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       
       //2.Drag and drop Ex
       
       
       



		

	}

}
