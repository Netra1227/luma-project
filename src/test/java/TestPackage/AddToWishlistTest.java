package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.AddToWishlist;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class AddToWishlistTest extends BaseClass{
	Signin si;
	AddToWishlist aw;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		aw = new AddToWishlist();
	}	
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");
		Thread.sleep(10000);
	}

	@Test(priority = 2)
	public void VerifyAddtoWishlistTest() throws InterruptedException {
		aw.VerifyAddtoWishlist();
		Thread.sleep(5000);
		}
	
	@Test(priority = 3)
	public void VerifyWishListTitleTest() throws InterruptedException {
		String Title =aw.VerifyWishListTitle();
		Assert.assertEquals(Title, "My Wish List");
		Thread.sleep(5000);

	}

	@AfterSuite
	public void afterSuite() {
		quit();
	}
}

