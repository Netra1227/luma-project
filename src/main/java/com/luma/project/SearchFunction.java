package com.luma.project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class SearchFunction extends BaseClass{
	public SearchFunction() 
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search']") WebElement search;

	@FindBy(xpath="(//img[@class='product-image-photo'])[1]") WebElement clickproduct;
	
	@FindBy(id="option-label-size-143-item-172") WebElement selectsize;

	@FindBy(id="option-label-color-93-item-56") WebElement color;
	
	@FindBy(id="product-addtocart-button") WebElement addcart;
	
	public void Verifysearch() throws InterruptedException
	{
		
		search.sendKeys("women dresses");
		//driver.findElement(SearchClk).click();
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);

		
		Thread.sleep(2000);
		clickproduct.click();
		selectsize.click();
		color.click();
		addcart.click();
		
		Thread.sleep(2000);

	}
	
	public String VerifySearchTitle()
	{
		return driver.getTitle();
	}		

}