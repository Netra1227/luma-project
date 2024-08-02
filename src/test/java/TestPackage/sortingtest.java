package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.luma.project.Signin;
import com.luma.project.Sorting;

import BasePackage.BaseClass;

public class sortingtest extends BaseClass{
	Signin si;
	Sorting so;
	@BeforeSuite
	public void beforeSuite()
	{
		initialization();
		si = new Signin();
		so = new Sorting();
	
		}
	@Test(priority = 1)
	public void SignINTest() throws InterruptedException {
		si.SignIN("anniethomas@gmail.com","Pass@123");

		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void clickOnYogaTest() {
		so.clickOnYoga();
	}
	@Test(priority=3)
	public void sortByTest() {
		so.sortBy();
	}
		@AfterSuite
	public void afterSuite() {
		quit();
	}
}
