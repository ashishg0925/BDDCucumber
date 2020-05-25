package Framework.Facebook;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {
	
	
	public static WebDriver Driver;
	
	static HashMap<String , By> map = new HashMap<String, By>();
	static {
		map.put("email", By.xpath("//*[@type='email'][@name='email']"));
	}
	By Emailaddress=By.xpath("//*[@type='email'][@name='email']");
	By pwd = By.xpath("//*[@type='password'][@name='pass']");
	By btnLogin = By.xpath("//*[@value='Log In'][@data-testid='royal_login_button']");
	By errormsg = By.xpath("//div[@role='alert'][contains(text(),'The email ')]");
	By txt_Username=By.xpath("//input[@name='firstname'][@aria-label='First name']");
	By txt_FBhomePageMesg=By.xpath("//span[@dir='auto'][text()='Add to Your Story']");
	By dbtn_logout = By.xpath("//div[@aria-label='Account']/img");
	By lnk_Logout = By.xpath("//span[@dir='auto'][text()='Log Out']");
	By btn_createnewaccount = By.xpath("//a[@role='button'][contains(text(),'Create')]");
	public FacebookLoginPage(WebDriver driver) 
	{
		FacebookLoginPage.Driver=driver;
	}


	


	public void LoginFacebook() throws InterruptedException
	{
		Driver.findElement(Emailaddress).sendKeys("ashishgoyal0925@gmail.com");
		Driver.findElement(pwd).sendKeys("Welcome@123");
		Driver.findElement(btnLogin).click();
		Thread.sleep(2000);
		
	}
	
	public void TestLoginInvalidcredentials() throws InterruptedException
	{
		Driver.findElement(Emailaddress).sendKeys("asfpdo@gmail.com");
		Driver.findElement(pwd).sendKeys("fdhsdfhk");
		Driver.findElement(btnLogin).click();
		Thread.sleep(10000);
		
	}
	
	public void ValidateSuccessfulLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean Flag =Driver.findElement(txt_FBhomePageMesg).isDisplayed();
		if(Flag)
		{
			System.out.println("Logged in Succesfully");
		}else
		{
			System.out.println(" The user did not Logged in Succesfully");
		}
	}
	
	public void LogoutApplication() throws InterruptedException
	{
		Thread.sleep(2000);
		Driver.findElement(dbtn_logout).click();
		Thread.sleep(2000);
		Driver.findElement(lnk_Logout).click();
		Thread.sleep(10000);
		Driver.close();
	}

	
	public void ValidateInvalidcred()
	{
		Boolean Flag=Driver.findElement(btn_createnewaccount).isDisplayed();
		if(Flag)
		{
			System.out.println("The account user is landed on invalid cred page");
		}else
		{
			System.out.println("The account user is not landed on invalid cred page");
		}
		Driver.close();
	}
}
