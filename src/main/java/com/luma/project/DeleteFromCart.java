package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class DeleteFromCart extends BaseClass{
	public DeleteFromCart() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='action showcart']") 
	WebElement ClickCart;

	@FindBy(xpath="//a[@title='Remove item']") 	
	WebElement Delete;

	@FindBy(xpath="//button[@class='action-primary action-accept']")
	WebElement ClickDelete;
	
	public void VerifyDeletefromCart () throws InterruptedException
	{
		ClickCart.click();
		Thread.sleep(2000);
		Delete.click();
		ClickDelete.click();
		Thread.sleep(2000);
		}
	}


