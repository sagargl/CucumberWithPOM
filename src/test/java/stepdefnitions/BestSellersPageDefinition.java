package stepdefnitions;



import com.qa.base.TestBase;
import com.qa.pages.BestSellersPage;
import com.qa.pages.HomeDashboard;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BestSellersPageDefinition extends TestBase{
	HomeDashboard amazondashobard;
	BestSellersPage bestseller;
	
	
	public BestSellersPageDefinition()
	{
		super();
		
	}
	
	
	
	   
@Given("User click on Best Seller Link")
public void user_click_on_best_seller_link() {
	//initialization();
	amazondashobard=new HomeDashboard();
   amazondashobard.BestSellersValidation();
   amazondashobard.ClickOnBestSellersLink();
}

@Then("validate the BestSeller List")
public void validate_the_best_seller_list() {
	bestseller=new BestSellersPage();
	bestseller.BestSellerslist();
}
	

}
