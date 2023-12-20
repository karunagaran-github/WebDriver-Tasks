package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task22 {
	
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 driver = new FirefoxDriver();
		 driver.get("https://phptravels.com/demo/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.name("first_name")).sendKeys("Karunagaran");
		 driver.findElement(By.name("last_name")).sendKeys("elango");
		 driver.findElement(By.name("business_name")).sendKeys("IT company");
		 driver.findElement(By.name("email")).sendKeys("karunagaran@gmail.com");
		 
		 WebElement num1= driver.findElement(By.xpath("//span[@id='numb1']"));
		 String one= num1.getText();
		 System.out.println(one);
		 int number1 = Integer.parseInt(one);
		 
		 WebElement num2= driver.findElement(By.xpath("//span[@id='numb2']"));
		 String two= num2.getText();
		 System.out.println(two);
		 int number2 = Integer.parseInt(two);
		 int result= number1+number2;
		 String res = Integer.toString(result);
		 
		 driver.findElement(By.xpath("//input[@id='number']")).sendKeys(res);
		 
		 driver.findElement(By.id("demo")).click();
	}

}
