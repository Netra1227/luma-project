package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class CreateAccount extends BaseClass{
	public CreateAccount() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create an Account") 
	WebElement CreateAccount;

	@FindBy(id="firstname")
	WebElement Firstname;
	
	@FindBy(id="lastname")
	WebElement Lastname;

	@FindBy(id="email_address")
	WebElement EmailAddress;

	@FindBy(id="password")
	WebElement Password;

	@FindBy(id="password-confirmation")
	WebElement PassConf;
	
	@FindBy(xpath="//button[@class='action submit primary']") 
	WebElement CreateAccountSubmit;



	
	public void createAcc(String fn,String ln,String email,String pass,String confpass)
	{
		CreateAccount.click();
		Firstname.sendKeys(fn);
		Lastname.sendKeys(ln);
		EmailAddress.sendKeys(email);
		Password.sendKeys(pass);
		PassConf.sendKeys(confpass);
		CreateAccountSubmit.click();
	
	}

	public String verifyAcctPageTitle()
	{
		return driver.getTitle();
	
	}
	
}


