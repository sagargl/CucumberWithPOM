package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	//PageFactory-OR:
	
			@FindBy(xpath="//*[contains(text(),'Hello, Sign in')]")
			WebElement accountlist;
			
			@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
			WebElement signin;
			
			@FindBy(name="email")
			WebElement email;
			
			@FindBy(id="continue")
			WebElement continuebutton;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//a[contains(text(),'Forgot Password')]")
			WebElement forgotpassword;
			
			@FindBy(id="signInSubmit")
			WebElement loginbtn;
			
			
			//Initiliaze the page objects
			public LoginPage()
			{
				//PageFactory.initElements(driver, LoginPage.class);
				PageFactory.initElements(driver, this);
			}
			
		    //Action class
			public void SignInAction() throws InterruptedException
			{
				Actions act=new Actions(driver);
				act.moveToElement(accountlist).build().perform();
				Thread.sleep(100);
				signin.click();
			}
			
			public boolean validateSign()
			{
				return signin.isDisplayed();
			}
			
			
			
						
			public boolean validateForgotPassword()
			{
				return forgotpassword.isDisplayed();
			}
			
			public void login(String un, String pw)
			{
				email.sendKeys(un);
				continuebutton.click();
				password.sendKeys(pw);
				loginbtn.click();
			}
			



}
