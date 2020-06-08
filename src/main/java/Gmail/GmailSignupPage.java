package Gmail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailSignupPage 


{
	
	public static WebDriver Driver;
	
	By txt_Firstname = By.xpath("//input[@type='text'][@name='firstName']");
	By txt_lastName = By.xpath("//input[@type='text'][@name='lastName']");	
    By txt_emailaddress = By.xpath("//input[@type='text'][@name='Username']");		
	By txt_pwd = By.xpath("//input[@type='password'][@name='Passwd']");
	By txt_cnfpwd = By.xpath("//input[@type='password'][@name='ConfirmPasswd']");
	By btn_Next = By.xpath("//div[@role='button'][@id='accountDetailsNext']");	
	By txt_cnfbanner = By.xpath("//*[@id=\'headingText\']");
	
	
	
	
public GmailSignupPage(WebDriver driver2) {
	GmailSignupPage.Driver=driver2;
	}





public void entetfeildsGmailSignup(String fnmane,String lstname,String emailadd,String pwd, String cnfpwd ) throws InterruptedException
{
		Boolean flag=Driver.findElement(txt_Firstname).isDisplayed();
		if(flag)
		{
			System.out.println("Enter First Name As "+fnmane);
			Driver.findElement(txt_Firstname).sendKeys(fnmane);
			Thread.sleep(2000);
			System.out.println("Enter Last Name As "+lstname);
			Driver.findElement(txt_lastName).sendKeys(lstname);
			Thread.sleep(2000);
			System.out.println("Enter Email Address As "+emailadd);
			Driver.findElement(txt_emailaddress).sendKeys(emailadd);
			Thread.sleep(2000);
			System.out.println("Enter Password As "+pwd);
			Driver.findElement(txt_pwd).sendKeys(pwd);
			Thread.sleep(2000);
			System.out.println("Enter CNFpwd As "+cnfpwd);
			Driver.findElement(txt_cnfpwd).sendKeys(cnfpwd);
			Thread.sleep(2000);
		}
}
	
	

public void ValidateCNFPage()
{
	Driver.findElement(btn_Next).click();
	String banner = Driver.findElement(txt_cnfbanner).getText();
	if (banner.contentEquals("Welcome to Google"))
	{
		System.out.println("Gmail Validation Successfully");
	}
	else{
		System.out.println("Gmail Validation Failed");
	}
}
 
}
