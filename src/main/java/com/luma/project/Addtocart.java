package com.luma.project;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class Addtocart  extends BaseClass{
	public Addtocart() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Hoodies & Sweatshirts") WebElement Hoodies;

	@FindBy(xpath="(//img[@class='product-image-photo'])[5]") WebElement SelectProduct;

	@FindBy(id="option-label-size-143-item-168") WebElement Size;

	
	@FindBy(id="option-label-color-93-item-57") WebElement Color;

	@FindBy(id="qty") 	WebElement quantity;
	
	@FindBy(id="product-addtocart-button")
	WebElement CartButton;

	public void VerifyAddtoCart(int qr)
	{
		Hoodies.click();
		SelectProduct.click();
		quantity.clear();
		quantity.sendKeys(Integer.toString(qr));
		Size.click();
		Color.click();
		CartButton.click();	
	}
}
