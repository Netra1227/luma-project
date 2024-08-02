package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.Addtocart;
import com.luma.project.ProceedToCheckOut;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class ProceedToCheckOutTest extends BaseClass{
	Signin si;
	Addtocart ac;
	ProceedToCheckOut ptc;
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		ac = new Addtocart();
		ptc = new ProceedToCheckOut();
	
	}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("anniethomas@gmail.com","Pass@123");

		Thread.sleep(5000);

	}
	@Test(priority= 2)
	public void VerifyAddtoCartTest() throws InterruptedException {

		ac.VerifyAddtoCart(2);
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 3)
	public void VerifyCheckoutClickTest() throws InterruptedException {
		
		ptc.VerifyCheckoutClick();
	}
	

	@Test(priority = 4)
	public void checkoutpageTest() throws InterruptedException {
		
		ptc.checkoutpage();
	}
	
	
	
	
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}
