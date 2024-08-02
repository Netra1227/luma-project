package TestPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.Addtocart;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class AddtocartTest extends BaseClass{
	Signin si;
	Addtocart ac;
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		ac = new Addtocart();
	}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");

		Thread.sleep(5000);

	}
	@Test(priority = 2)
	public void VerifyAddtoCartTest() throws InterruptedException {

		ac.VerifyAddtoCart(2);
		Thread.sleep(2000);
	}
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}
