package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.AddAddress;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class AddAddressTest extends BaseClass{
	Signin si;
	AddAddress ad;
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		ad = new AddAddress();
	}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("anniethomas@gmail.com","Pass@123");

		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void clickOnWelcomeTest() throws InterruptedException {
		ad.clickOnWelcome();
	}
	@Test(priority=2)
	public void clickOnAddressTest() {
		ad.clickOnAddress();
	}
	@Test(priority=3)
	public void saveAddressTest() throws InterruptedException {
		ad.saveAddress("India", 9123446, "Mumbai", "Maharashtra", "Karnataka",12345);
	}

	@AfterSuite
	public void afterSuite() {
		quit();
	}
}
