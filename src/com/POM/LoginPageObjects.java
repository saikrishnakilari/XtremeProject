package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class LoginPageObjects extends Base
{
	public LoginPageObjects(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id = "userId")
	public  WebElement userName;
	
	@FindBy(id = "password")
	public  WebElement Password;
	
	@FindBy(id = "btnSignIn")
	public WebElement signIn;
	
	public void Login(String uName, String password)
	{		
		userName.sendKeys(uName);
		Password.sendKeys(password);
		signIn.click();
		
	}
}
