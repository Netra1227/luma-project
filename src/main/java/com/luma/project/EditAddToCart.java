package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class EditAddToCart extends BaseClass{
	public EditAddToCart() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='action showcart']") 
	WebElement ClickCart;

	@FindBy(xpath="//a[@title='Edit item']") 	
	WebElement Edit;
	
	@FindBy(id="option-label-size-143-item-169") 
	WebElement Size;

	@FindBy(id="product-updatecart-button") 
	WebElement UpdateCart;


	@FindBy(id="qty") 	WebElement quantity;
	
	public void EditCart(int qr)
	{
		ClickCart.click();
		Edit.click();
		Size.click();
		quantity.clear();
		quantity.sendKeys(Integer.toString(qr));
		UpdateCart.click();
		}
}
