package stepDefination;

import org.junit.runner.RunWith;

import Framework.Facebook.BrowserSelection;
import Framework.Facebook.FacebookLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination extends BrowserSelection
{
	
	@Given("^the account user is on the Facebook landing Page$")
	public void LaunchFacebookURL() throws Throwable {
	   
		Driver=initializeBrowser();
		Driver.get(prop.getProperty("AppURL"));
		Driver.manage().window().maximize();
		Thread.sleep(5000);
	}


	@When("^the user enters valid credentials\\.$")
	public void Login_WithValidCred() throws Throwable {
		FacebookLoginPage Fb = new FacebookLoginPage(Driver);
		Fb.LoginFacebook();
		Thread.sleep(5000);
 	}

	@Then("^the user should be able to log in\\.$")
	public void ValidateLoginFunctionality() throws Throwable {
	   
		FacebookLoginPage Fb = new FacebookLoginPage(Driver);
		Fb.ValidateSuccessfulLogin();
		
	}

	@When("^the user enters Invalid credentials$")
	public void Login_withInvalidCred() throws Throwable {
		FacebookLoginPage Fb = new FacebookLoginPage(Driver);
		Fb.TestLoginInvalidcredentials();
		
	}

	@Then("^the user should not be able to log in\\.$")
	public void Validate_InvalidLogin() throws Throwable {
	   
		FacebookLoginPage Fb = new FacebookLoginPage(Driver);
		Fb.ValidateInvalidcred();
		
		
	
	}

	 @And("^Close the Browrser$")
	    public void close_the_browrser() throws Throwable {
	        FacebookLoginPage fb =new FacebookLoginPage(Driver);
	        fb.LogoutApplication();
	    }
	 



	 
	 
}
