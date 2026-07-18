package pages;

import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Homepage extends Baselibrary
{
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
