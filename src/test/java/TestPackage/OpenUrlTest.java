package TestPackage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.project.OpenUrl;

import BasePackage.BaseClass;
public class OpenUrlTest extends BaseClass{
	OpenUrl ou;

	@BeforeMethod
	public void beforeMethod()
	{
		initialization();
		ou = new OpenUrl();
	}

	@Test
	public void verifyHomePageTitleTest() {
		String Title =ou.verifyHomePageTitle();
		Assert.assertEquals(Title, "What's New");

	}
    @Test
	public void createAccTest() throws InterruptedException
	{
		ou.createAcc();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() {
		quit();
	}
}
