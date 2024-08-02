package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.luma.project.EditAddToCart;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class EditAddToCartTest extends BaseClass{
	Signin si;
	EditAddToCart eac;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		eac = new EditAddToCart();
	}
	
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");

		Thread.sleep(10000);

	}
	@Test(priority = 2)
	public void EditCartTest() throws InterruptedException {

		eac.EditCart(4);
		Thread.sleep(2000);
	}
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}

	
