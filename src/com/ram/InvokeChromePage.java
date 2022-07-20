package com.ram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromePage {
	
	public WebDriver driver;
	@Test
	public void chromePage() {
		System.setProperty("webdriver.chrome.driver", "/Users/r/Desktop/Automation/chromedriver");
	driver = new ChromeDriver();
	driver.navigate().to("https://sda.edu.sa");
	driver.manage().window().maximize();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	}

}
