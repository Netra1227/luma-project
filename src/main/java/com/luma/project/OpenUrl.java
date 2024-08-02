package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class OpenUrl extends BaseClass{
	public OpenUrl() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create an Account") 
	WebElement CreateAccount;
	
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void createAcc()
	{
		CreateAccount.click();
	}
}
