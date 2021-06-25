package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class BestSellersPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"zg_tabs\"]/ul/li/div/a")
	public static List<WebElement> sellerlist;
	
	
	
	public BestSellersPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public static List<WebElement> BestSellerslist()
	{
		System.out.println("Best sellers validation started");
		for(int i=0; i<sellerlist.size(); i++)
		{
			String sellertext=sellerlist.get(i).getText();
			System.out.println("Seller list is:"+sellertext);
					
		}
			return sellerlist;
	}


}