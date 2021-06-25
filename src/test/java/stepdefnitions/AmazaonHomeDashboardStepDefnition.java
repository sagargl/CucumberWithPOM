package stepdefnitions;

import com.qa.base.TestBase;
import com.qa.pages.HomeDashboard;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazaonHomeDashboardStepDefnition extends TestBase {
	 HomeDashboard amazondashobard;
	
 public AmazaonHomeDashboardStepDefnition() {
		super();
		}
	
// @Before(order=1)
//	public void launchBrowser()
//	{
//		//String browserName=prop.getProperty("browser");
//		//driverfactory=new DriverFactory();
//		//driver=driverfactory.init_driver(browserName);
//		TestBase.initialization();
//		System.out.println("Berofe");
//	}

@Given("User is on Amazon Dashboard Page")
public void user_is_on_amazon_dashboard_page() {
		  //initialization();
		   System.out.println("User is on Dashboard page");
		   amazondashobard=new HomeDashboard();
		   
		 
}

@Then("Validate the BestSellers Is present")
public void validate_the_best_sellers_is_present() {
	amazondashobard.BestSellersValidation();
	System.out.println("Best sellers validation is completed");
   }

@Then("Validate the Mobiles Is present")
public void validate_the_mobiles_is_present() {
amazondashobard.MobilesValidation();
}

@Then("Validate the Fashion Is present")
public void validate_the_fashion_is_present() {
   amazondashobard.FashionValidation();
}

@Then("Validate the Electronics Is present")
public void validate_the_electronics_is_present() {
   amazondashobard.ElectronicssValidation();
   }

@Then("Validate the NewReleases Is present")
public void validate_the_new_releases_is_present() {
    amazondashobard.ReleasessValidation();
    }



}
