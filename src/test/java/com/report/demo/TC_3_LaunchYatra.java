package com.report.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_3_LaunchYatra {
	
	@Test
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver", "..//natasaTech_Jenkins/src/test/resources/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		driver.close();
	}

}
