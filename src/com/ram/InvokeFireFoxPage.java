package com.ram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFireFoxPage {
	public WebDriver driver;
	@Test
	public void firfoxPage() {
		System.setProperty("webdriver.gecko.driver", "/Users/r/eclipse-workspace/TestProject/Driver/geckodriver");
	driver = new FirefoxDriver();
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
