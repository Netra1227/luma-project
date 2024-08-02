package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.CreateAccount;

import BasePackage.BaseClass;

public class CreateAccountTest  extends BaseClass{
	CreateAccount ca;

	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		ca = new CreateAccount();
	}
	@Test(priority = 1)
	public void createAccTest() throws InterruptedException {
		ca.createAcc("Annie","Thomas","anniethomas@gmail.com","Pass@123","Pass@123");

		Thread.sleep(5000);

	}
	@Test(priority = 2)
	public void verifyAcctPageTitleTest() throws InterruptedException {
		String Title =ca.verifyAcctPageTitle();
		Assert.assertEquals(Title, "My Account");
		Thread.sleep(5000);

	}


	@AfterSuite
	public void afterSuite() {
		quit();
	}

}
