package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomeDashboard extends TestBase{
	
	
	
	@FindBy(xpath="//a[contains(text(),'Best Sellers')]")
	public WebElement BestSellers;
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")
	public WebElement Mobiles;
	
	@FindBy(xpath="//a[contains(text(),'Fashion')]")
	public WebElement Fashion;
	
	
	@FindBy(xpath="//a[contains(text(),'Electronics')]")
	public WebElement Electronics;
	
	@FindBy(xpath="//a[contains(text(),'New Releases')]")
	public WebElement Releases;
	
	public HomeDashboard()
{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean BestSellersValidation()
	{
		System.out.println("Best sellers validation started");
		return BestSellers.isDisplayed();
			}
	
	
	public boolean FashionValidation()
	{
		return Fashion.isDisplayed();
		
	}
	
	public boolean MobilesValidation()
	{
		return Mobiles.isDisplayed();
		
	}
	
	public boolean ElectronicssValidation()
	{
		return Electronics.isDisplayed();
		
	}
	
	public boolean ReleasessValidation()
	{
		return Releases.isDisplayed();
		
	}
	
	public BestSellersPage ClickOnBestSellersLink()
	{
		BestSellers.click();
		System.out.println("Best sellers link is clicked");
		return new BestSellersPage();
		
	}
	
	public NewReleases ClickOnNewReleasesLink()
	{
		Releases.click();
		System.out.println("Releases link is linked");
		return new NewReleases();
	}
	

}
