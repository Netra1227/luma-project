package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.SearchFunction;
import com.luma.project.Signin;

import BasePackage.BaseClass;

public class SearchFunctionTest extends BaseClass{
	Signin si;
	SearchFunction sf;
	
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		sf = new SearchFunction();
	}	
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("netrapoojary1456@gmail.com","Pass12345678");
		Thread.sleep(10000);
	}

	@Test(priority = 2)
	public void VerifySerach() throws InterruptedException {
		sf.Verifysearch();
		Thread.sleep(5000);
		
		
	}	

	@AfterSuite
	public void afterSuite() {
		quit();
	}
}

