package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Textboxpage;

public class Textboxtest extends Baselibrary
{
	Textboxpage obj;
	
	@BeforeTest
	public void launchurl()
	{
		obj = new Textboxpage();
		obj.launchurl();
	}
	
	@Test
	public void clickoncross()
	{
		obj.clickoncross();
	}

}
