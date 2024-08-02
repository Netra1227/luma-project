package com.luma.project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class SignOut extends BaseClass{
	public SignOut() 
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "(//button[@type='button'])[1]") WebElement Welcome;

	@FindBy(xpath="//a[contains(text(), 'Sign Out')]")
	List<WebElement> Signout; 

	public void VerifySignOut() throws InterruptedException {
		Thread.sleep(2000);
		Welcome.click();
		for(WebElement option : Signout) {
			String optiontext = option.getText();
			if(optiontext.equals("Sign Out")) {
				option.click();
				break;
			}
			
		}
		
	}


}