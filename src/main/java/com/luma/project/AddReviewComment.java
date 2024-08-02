package com.luma.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class AddReviewComment extends BaseClass{
	public AddReviewComment() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Hoodies & Sweatshirts") WebElement Hoodies;

	@FindBy(xpath="(//img[@class='product-image-photo'])[5]") 
	WebElement SelectProduct;

	@FindBy(xpath="//a[@class='action add']")
	WebElement AddReview;

	@FindBy(xpath="//label[@class='rating-5']")
	WebElement Rating;

	@FindBy(name="nickname")
	WebElement Nickname;
	
	@FindBy(id="summary_field")
	WebElement Summary;

	@FindBy(id="review_field")
	WebElement Review;

	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement SubmitButton;

	
	public void ClickReview()
	{
		Hoodies.click();
		SelectProduct.click();
		AddReview.click();
	}
	
	public void	AddReview(String name, String entersummary, String EnterReview)
	{
		Rating.click();
		Nickname.clear();
		Nickname.sendKeys(name);
		Summary.sendKeys(entersummary);
		Review.sendKeys(EnterReview);
		SubmitButton.click();

		
	}
	
	
}
