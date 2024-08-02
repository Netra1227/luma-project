package com.luma.project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class AddAddress extends BaseClass{
	
	@FindBy (xpath="(//button[@type='button'])[1]") WebElement Welcome;
	@FindBy(xpath = "(//ul[@class='header links'])[1]//li//a") List<WebElement> options;
	@FindBy(xpath = "//a[contains(text(),'Address Book')]") WebElement Address;
	@FindBy(xpath= "//span[text()='Add New Address']") WebElement AddnewAddress;
	@FindBy(id = "country") WebElement Country;
	@FindBy(id = "telephone") WebElement Phone;
	@FindBy(id = "street_1") WebElement Street;
	@FindBy(id = "city") WebElement City;
	@FindBy(id = "region_id") WebElement State;
	@FindBy(id = "zip") WebElement Pincode;
	@FindBy(xpath = "//button[@title='Save Address']") WebElement Save;
	
	public AddAddress() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnWelcome() throws InterruptedException {
		Thread.sleep(5000);
		Welcome.click();
		for(WebElement option : options) {
			String optiontext = option.getText();
			if(optiontext.equals("My Account")) {
				option.click();
				break;
			}
		}
	}
	public void clickOnAddress() {
		Address.click();
		AddnewAddress.click();
	}
	
	public void saveAddress(String country,int Ph,String street,String city,String state,int pincode) throws InterruptedException {
		
		Phone.sendKeys(String.valueOf(Ph));
		Street.sendKeys(street);
		City.sendKeys(city);
		Select s1 = new Select(Country);
		s1.selectByVisibleText(country);
		Select s2 = new Select(State);
		s2.selectByVisibleText(state);
		Pincode.sendKeys(String.valueOf(Pincode));
		Save.click();
		}
	
	}