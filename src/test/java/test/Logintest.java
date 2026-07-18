package test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Loginpage;

public class Logintest extends Baselibrary
{
	
	Loginpage obj;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		launchapp();
		obj=new Loginpage(driver);
	}
	
	@Test(priority=1,enabled=true)
	public void login()
	{
		obj.login();
	}

}
