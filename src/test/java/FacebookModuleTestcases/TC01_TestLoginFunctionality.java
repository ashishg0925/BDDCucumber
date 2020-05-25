package FacebookModuleTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework.Facebook.BrowserSelection;
import Framework.Facebook.FacebookLoginPage;

public class TC01_TestLoginFunctionality extends BrowserSelection
{
	public WebDriver Driver;
	@BeforeTest
	public void Launchbrowser() throws IOException, InterruptedException
	{
		Driver=initializeBrowser();
		Driver.get(prop.getProperty("AppURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void LoginUser() throws IOException, InterruptedException
	{
		
		
		FacebookLoginPage Fb= new FacebookLoginPage(Driver);
		Fb.LoginFacebook();
		Thread.sleep(1000);
	}

	@AfterTest
	public void CloseBrowser()
	{
		Driver.close();
	}
}
