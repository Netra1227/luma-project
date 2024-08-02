package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.AddReviewComment;

import com.luma.project.Signin;

import BasePackage.BaseClass;

public class AddReviewCommentTest extends BaseClass{
	Signin si;
	AddReviewComment ar;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		ar = new AddReviewComment();
	}	
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");
		Thread.sleep(10000);
	}

	@Test(priority = 2)
	public void VerifyAddtoReviewTest() throws InterruptedException {
		ar.ClickReview();
		Thread.sleep(5000);
		
		ar.AddReview("Annie","Productisnice","Lovethecolor");
		Thread.sleep(5000);
		}
	
	
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}

