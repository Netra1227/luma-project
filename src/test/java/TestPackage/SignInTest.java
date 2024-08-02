package TestPackage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.Signin;

import BasePackage.BaseClass;

public class SignInTest extends BaseClass{
	Signin si;
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
	}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("anniethomas@gmail.com","Pass@123");

		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void verifyloginPageTitleTest() throws InterruptedException {
		String Title =si.verifyloginPageTitle();
		Assert.assertEquals(Title, "What's New");
		Thread.sleep(5000);

	}
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}
