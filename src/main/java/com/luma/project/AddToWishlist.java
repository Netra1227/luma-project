package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class AddToWishlist  extends BaseClass{
	public AddToWishlist() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Hoodies & Sweatshirts") WebElement Hoodies;

	@FindBy(xpath="(//img[@class='product-image-photo'])[5]") 
	WebElement SelectProduct;

	@FindBy(xpath="(//a[@class='action towishlist'])[1]")
	WebElement Wishlist;

	public void VerifyAddtoWishlist()
	{
		Hoodies.click();
		SelectProduct.click();
		Wishlist.click();	
	}
	
	public String VerifyWishListTitle()
	{
		return driver.getTitle();
	
	}

	
}
