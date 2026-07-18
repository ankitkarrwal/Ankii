package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Loginpage extends Baselibrary
{
	  AndroidDriver driver;

	    public Loginpage(AndroidDriver driver) {
	        this.driver = driver;
	         PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	    }
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter your user id\"]")
	private WebElement userid;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Enter your password\"]")
	private WebElement password;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Login\"]")
	private WebElement loginbtn;
	
	
	public void login()
	{
		userid.sendKeys("Nikhil@hanu.ai");
		password.sendKeys("Nikhil@hanu.ai1");
		loginbtn.click();
	}
	
	

}
