package com.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromePage {
	
	public WebDriver driver;
	@Test
	public void chromePage() {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.javatpoint.com");
	driver.manage().window().maximize();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,5000)");
	driver.findElement(By.className("Core Java")).click();
//	driver.close();
	}

}
