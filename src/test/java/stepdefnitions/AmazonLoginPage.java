package stepdefnitions;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginPage extends TestBase {
	LoginPage loginpage=new LoginPage();
	
	 public AmazonLoginPage() {
		super();
		}
	 
@Given("User is on Amazon Landing Page")
public void user_is_on_amazon_landing_page() {
   System.out.println("User is on landing page");
   initialization();
   }

@When("Sign In Button Present in Screen")
public void sign_in_button_present_in_screen() {
	
	//loginpage.validateSign();
	System.out.println("Sign in Buttpm Present in screen");
		 
}

@Then("User Clicks on Sign In Button")
public void user_clicks_on_sign_in_button() throws InterruptedException {
	loginpage.SignInAction();
	System.out.println("User Clicks on Sign in button");
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));    

	 
}


}

