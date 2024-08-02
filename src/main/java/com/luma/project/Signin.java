package com.luma.project;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class Signin extends BaseClass{
	public Signin() 
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(linkText="Sign In") 
	WebElement Signin;

	@FindBy(id="email")
	WebElement EmailAddress;

	@FindBy(id="pass")
	WebElement Password;

	@FindBy(id="send2") 
	WebElement SignInButton;

	public void SignIN(String email,String pass)
	{
		Signin.click();
		EmailAddress.sendKeys(email);
		Password.sendKeys(pass);
		SignInButton.click();
	}
	public String verifyloginPageTitle()
	{
		return driver.getTitle();
	}		
}

