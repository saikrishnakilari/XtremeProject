package com.Suite;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Base.Config;
import com.POM.LoginPageObjects;
import com.Util.ExcelLib;


public class TestSuite 
{
	ExcelLib excel = null;
	@BeforeTest
	public void Initialize() throws IOException, BiffException
	{	
		Base.BrowserInitialize(Config.browser);
		Base.OpenURL();			
	}
	
	@Test
	public void ABC() throws BiffException, IOException
	{
		excel = new ExcelLib(Config.Path,"Sheet1");
		LoginPageObjects loginPage = new LoginPageObjects(Base.d);
		loginPage.Login(excel.ReadCell(excel.GetCell("UserName"),1),excel.ReadCell(excel.GetCell("Password"),1));
	}

	
}
