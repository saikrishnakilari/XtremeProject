package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class Base 
{
	public WebDriver d = null;
	public DesiredCapabilities capabilities = null;


	public void BrowserInitialize(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			d= new FirefoxDriver();
		}
		else
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Infor\\Selenium\\Selenium Jar Files\\JAR Files\\chromedriver.exe");
				d= new ChromeDriver();
			}
			else
				if(browser.equalsIgnoreCase("IE"))
				{
					
					capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					System.setProperty("webdriver.ie.driver", "C:\\Infor\\Selenium\\Selenium Jar Files\\JAR Files\\IEDriverServer.exe");
					d = new InternetExplorerDriver(capabilities);
				}
	}



}
