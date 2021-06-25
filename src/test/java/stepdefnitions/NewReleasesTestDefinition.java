package stepdefnitions;

import com.qa.base.TestBase;
import com.qa.pages.BestSellersPage;
import com.qa.pages.HomeDashboard;
import com.qa.pages.NewReleases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NewReleasesTestDefinition extends TestBase{
	HomeDashboard amazondashobard;
	NewReleases releases;
	
	public NewReleasesTestDefinition()
	{
		super();
		
	}
	
	
	   
@Given("User click on NewReleases Link")
public void user_click_on_best_seller_link() {
//	initialization();
   amazondashobard=new HomeDashboard();
   amazondashobard.ReleasessValidation();
   amazondashobard.ClickOnNewReleasesLink();
}

@Then("validate the Releases List")
public void validate_the_best_seller_list() {
	System.out.println("Validation REleases list");
	releases=new NewReleases();
	releases.BooksList();
}
	
}
