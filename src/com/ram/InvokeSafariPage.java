package com.ram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class InvokeSafariPage {
	public WebDriver driver;
	@Test
	public void chromePage() {
	driver = new SafariDriver();
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
