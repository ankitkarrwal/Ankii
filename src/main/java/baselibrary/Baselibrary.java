package baselibrary;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationutility.Applicationutility;
import io.appium.java_client.android.AndroidDriver;

public class Baselibrary implements Applicationutility
{
	
	
	public static AndroidDriver driver;
	
	public void launchapp() throws MalformedURLException
	{
		String appiumserverurl="http://127.0.0.1:4723";
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:app", System.getProperty("user.dir") + "\\app\\app-release.apk");
        
        
        URL url = new URL(appiumserverurl);
        driver = new AndroidDriver(url, dc);
	}

	@Override
	public void waitforvisibility(WebElement eee)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(eee));
		eee.click();	
	}

	@Override
	public void waitforclick(WebElement eee) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(eee));
		eee.click();
		
	
	}

	
	
		
	

	
		
	}
	


