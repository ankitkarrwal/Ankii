package test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Loginpage;
import pages.TrafficvolumePage;

public class TrafficVolumeTest extends Baselibrary
{
	
	TrafficvolumePage obj;
	
	Loginpage log;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		//Loginpage obj1= new Loginpage(driver);
		launchapp();
		log=new Loginpage(driver);
		obj=new TrafficvolumePage(driver);
	}
	
	@Test(priority=1,enabled=true)
	public void trafficvolume()
	{
		log.login();
		obj.trafficvolumedata();
	}
	
	

}