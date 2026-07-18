package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Loginpage;

public class Urltest extends Baselibrary
{ 
	Loginpage obj;
	@BeforeTest
	public void launchurl()
	{
		obj = new Loginpage();	
	    launchurl();
	}
	
	@Test(priority = 0)
	public void clickonclose()
	{
		
		obj.clickonclose();
	}

}
