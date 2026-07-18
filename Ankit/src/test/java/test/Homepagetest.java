package test;

import org.testng.annotations.BeforeTest;

import baselibrary.Baselibrary;
import pages.Homepage;

public class Homepagetest extends Baselibrary
{
	
	Homepage obj;
	
	@BeforeTest
	public void launchurl()
	{
		launchurl("chrome");
		obj = new Homepage();
	}

}
