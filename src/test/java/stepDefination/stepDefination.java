package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination 
{
	
@Given("^User is on the landing page$")	
public void LaunchChromeBrowser()
{
	System.out.println("Launched Chrome Browser");
}


@When("^User logins into application with username and password$")	
public void Login_Credentials()
{
	System.out.println("UserNameValue");
	System.out.println("Password");
}

@Then("^Home page is populated$")	
public void ValidateHomepage()
{
	System.out.println("HomePage is displayed");
}

@And("^homepage is displayed$")	
public void HomePageIconValidation()
{
	System.out.println("Validate HomePage Icon");
}

@When("^User logins into application with username = \"([^\"]*)\" and password = \"([^\"]*)\"$")
public void user_logins_into_application_with_username_and_password(String arg1, String arg2) 
{
    arg1="Hello";
    arg2="World";
    
    System.out.println(arg1);
    System.out.println(arg2);
    ;
}
}
