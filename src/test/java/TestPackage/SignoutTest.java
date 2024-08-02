package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.SignOut;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class SignoutTest extends BaseClass{
	Signin si;
	SignOut so;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
			
		si = new Signin();
		so = new SignOut();
	
		}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");

		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void VerifySignoutTest() throws InterruptedException {

		so.VerifySignOut();
	}
	
	
	
	@AfterSuite
	public void afterSuite() {
		quit();
	}
}
