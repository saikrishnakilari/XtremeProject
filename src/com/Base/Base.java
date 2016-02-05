package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.SheetSettings;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.*;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Base 
{
	public  static WebDriver d = null;
	public  static DesiredCapabilities capabilities = null;
	public  static XSSFSheet sheet = null;
	
	public  static Workbook wrkBook = null;
	public  static jxl.Sheet sht = null;
	


	public static void BrowserInitialize(String browser)
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
	
	public static void InitializeExcel(String sheetName) throws IOException
	{
//	file = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\config\\IXS-TestData.xlsx"));
		FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\com\\TestData\\IXS_TestData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		
	}
	
	public static void excel(String sheetName) throws BiffException, IOException
	{
//		wrkBook = Workbook.getWorkbook(new File(System.getProperty("user.dir")+"\\src\\com\\TestData\\IXS_TestData.xlsx"));
		wrkBook = Workbook.getWorkbook(new File("C:\\Users\\skilari\\Desktop\\Book1.xls"));
		sht = wrkBook.getSheet(sheetName);

	}
	
	public  static WebElement xpath(String xpath)
	{
		return d.findElement(By.xpath(xpath));
		
	}
	
	public static WebElement id(String id)
	{
		return d.findElement(By.xpath(id));
		
	}
	
	public  static void OpenURL()
	{
		d.get(Config.Url);
	}



}
