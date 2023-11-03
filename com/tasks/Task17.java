package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task17 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		driver = new ChromeDriver();
		driver.get("http://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement signInButton = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
Thread.sleep(20000);
        // Create an instance of the Actions class.
        Actions actions = new Actions(driver);

        // Move the cursor to the "Sign In" button and hold it.
        actions.moveToElement(signInButton).perform();

        // Locate and click the "Login" option.
        WebElement loginOption = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']"));
        loginOption.click();

        // Wait for the login page to load (add explicit wait if needed).

        // Locate the email and password input fields and the login button.
        WebElement emailInput = driver.findElement(By.id("userName"));
        WebElement passwordInput = driver.findElement(By.id("j_password"));
        WebElement loginButton = driver.findElement(By.id("checkUser"));

        // Enter a valid email and password.
        emailInput.sendKeys("aaa@gmail.com");
        passwordInput.sendKeys("Royal@99");

        // Click the login button.
        loginButton.click();

        // Wait for the login to complete 

        // Check for the login success message.
        WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(),'Logged in successfully.')]"));

        if (successMessage.isDisplayed()) {
            // Print the success message.
            System.out.println("Login Successful: " + successMessage.getText());
        } else {
            System.out.println("Login Failed");
        }

        // Close the browser.
        driver.quit();
  

	}

}
