package stepDefination;

import org.junit.runner.RunWith;

import Framework.Facebook.BrowserSelection;
import Gmail.GmailSignupPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Gmail extends BrowserSelection
{

	
	
	@Given("^the account user is on the Gmail landing Page$")
	public void Launch_Gmail_landing_Page() throws Throwable {
	    Driver=initializeBrowser();
	    Driver.get(prop.getProperty("GmailURL"));
	    Thread.sleep(5000);
	   
	}

	@When("^user enters the mandatory fields\"([^\"]*)\" and \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void EntrGMAIL_SignUPForm(String frstnm, String lstnm, String emailadd, String pwd, String cnfpwd) throws Throwable 
	{
	  	  GmailSignupPage gm=new GmailSignupPage(Driver);
	  	  gm.entetfeildsGmailSignup(frstnm,lstnm,emailadd,pwd,cnfpwd);
	}

	@Then("^the user should be able to signup$")
	public void the_user_should_be_able_to_signup() throws Throwable 
	{
		GmailSignupPage gm=new GmailSignupPage(Driver);
		gm.ValidateCNFPage();
	   
	}	
	@And("^Close the Browser$")
    public void close_the_browser() throws Throwable {
		Driver.close();
		
    }
}
