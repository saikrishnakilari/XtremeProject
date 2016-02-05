package com.Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testing {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
	capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	System.setProperty("webdriver.ie.driver","C:\\Infor\\Selenium\\Selenium Jar Files\\JAR Files\\IEDriverServer.exe");	
	WebDriver d = new InternetExplorerDriver(capability);
		d.get("https://usalvwixwebqa12/allogin/allogin.aspx");
		d.findElement(By.cssSelector("input#userId")).sendKeys("saikrishna"); //tag#id
		d.findElement(By.cssSelector("input.inforTextbox")).sendKeys("kilari"); //tag.class
		d.findElement(By.cssSelector("input[name=userId]")).sendKeys("bobby"); //tag[attribute=value]
		d.findElement(By.cssSelector("input.inforTextbox[name=userId]")).sendKeys("chintu"); //tag.class[attribute=value]
		
	}

}
