package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class NewReleases extends TestBase{
	//@FindBy(xpath="//*[@id=\"zg_left_col1\"]/div/div/div/div[1]")
	@FindBy(xpath="//*[@id=\"lfkdlfdllkl\"]/div/div/div/div[1]")
	public static List<WebElement> bookslist;
	
	
	
	public NewReleases()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public static List<WebElement> BooksList()
	{
		String bookstext;
		System.out.println("Books List validation started");
		for(int i=0; i<bookslist.size(); i++)
		{
			 bookstext=bookslist.get(i).getText();
			System.out.println("Books text is:"+bookstext);
					
		}
			return bookslist;
	}


}
