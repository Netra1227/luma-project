package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver; 		
		
	public void initialization()
	{
		
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	 driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
	}
	
	public void quit()
	{
	 driver.quit();
	}


}
