package TestPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.Addtocart;
import com.luma.project.DeleteFromCart;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class DeleteFromCartTest extends BaseClass{
	Signin si;
	Addtocart ac;
	
	DeleteFromCart de;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		ac = new Addtocart();
		de = new DeleteFromCart();

	}	
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");
		Thread.sleep(10000);
	}
	@Test(enabled=false)
	public void VerifyAddtoCartTest() throws InterruptedException {

		ac.VerifyAddtoCart(2);
		Thread.sleep(30000);
	}

	@Test(priority = 3)
	public void VerifyDeletefromCartTest() throws InterruptedException {
		de.VerifyDeletefromCart();
		
		}
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}

