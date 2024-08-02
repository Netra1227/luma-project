package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class ProceedToCheckOut extends BaseClass{
	public ProceedToCheckOut() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='action showcart']") 
	WebElement ClickCart;

	@FindBy(id="top-cart-btn-checkout")
	WebElement CheckoutClick;

	@FindBy(xpath = "//button[@class='button action continue primary']") 
	WebElement Nextbtn;
	
	@FindBy(xpath = "//span[text()='Place Order']") 
	WebElement Placebtn;
		
	
	public void VerifyCheckoutClick()
	{
		ClickCart.click();
		CheckoutClick.click();
	}

	public void checkoutpage() throws InterruptedException
	{
		Thread.sleep(5000);
		Nextbtn.click();
		Thread.sleep(10000);
		Placebtn.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}
	
	
	
}


