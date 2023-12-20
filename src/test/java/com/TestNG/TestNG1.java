package com.TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG1 {
	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	
		
	driver= new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 Thread.sleep(2000);
	 driver.switchTo().frame("frame-top");
     int numberOfFramesInTopFrame = driver.findElements(By.tagName("frame")).size();
     System.out.println("Number of frames in the top frame: " + numberOfFramesInTopFrame);

     // Switch to the left frame and find the text "LEFT"
     driver.switchTo().frame("frame-left");
     WebElement leftFrameText = driver.findElement(By.tagName("body"));
     System.out.println("Text in left frame: " + leftFrameText.getText());

     // Switch back to the bottom frame
     driver.switchTo().defaultContent();

     // Switch to the middle frame and find the text "MIDDLE"
     driver.switchTo().frame("frame-middle");
     WebElement middleFrameText = driver.findElement(By.tagName("body"));
     System.out.println("Text in middle frame: " + middleFrameText.getText());

     // Switch back to the bottom frame
     driver.switchTo().defaultContent();

     // Switch to the right frame and verify the text "RIGHT"
     driver.switchTo().frame("frame-right");
     WebElement rightFrameText = driver.findElement(By.tagName("body"));
     System.out.println("Text in right frame: " + rightFrameText.getText());

     // Switch back to the bottom frame
     driver.switchTo().defaultContent();

     // Switch to the bottom frame and verify text "BOTTOM"
     driver.switchTo().frame("frame-bottom");
     WebElement bottomFrameText = driver.findElement(By.tagName("body"));
     System.out.println("Text in bottom frame: " + bottomFrameText.getText());

     // Switch back to the top frame
     driver.switchTo().defaultContent();

     // Verify the page title
     String pageTitle = driver.getTitle();
     System.out.println("Page title: " + pageTitle);

     // Close the browser
     driver.quit();
 }
}
		


	
		





