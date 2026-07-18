package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary 
{
	public static WebDriver driver;
	public void launchurl(String browsername)
	{
		WebDriver helium = null  ;
		if(browsername.equals("chrome"))
		{
	    WebDriverManager.chromedriver().setup();
	    helium = new ChromeDriver();
		}
		
		
		else if(browsername.equals("firefox"))
		{
	    WebDriverManager.firefoxdriver().setup();
	    helium= new FirefoxDriver();
	    
		}
		
		driver= SelfHealingDriver.create(helium);
		
		Long  Starttime = System.currentTimeMillis();
		driver.navigate().to("https://pkrms.binamarga.pu.go.id/login");
		Long endtime =System.currentTimeMillis();
		long  total =  endtime - Starttime;
		System.out.println("time for open website"+ total +" milliseconds");
	    
	    
	}

}
