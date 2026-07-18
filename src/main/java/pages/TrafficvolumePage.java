package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TrafficvolumePage extends Baselibrary
{
	
	AndroidDriver driver;
	
	
	public TrafficvolumePage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Traffic Volume\"]")
	private WebElement trafficvolumebtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select\"]")
	private WebElement selectlink;
	
	@AndroidFindBy(className = "android.widget.TextView")
	private WebElement link;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@text=\"0\"])[1]")
	private WebElement aadtcar;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[2]")
	private WebElement aadtlargetruck;
	
	@AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[3]")
	private WebElement aadtmc;
	
    @AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[4]")
	private WebElement aadtmediumtruck;
    
    @AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[5]")
    private WebElement aadtmicrotruck;
    
    @AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[6]")
    private WebElement aadtpickup;
    
    @AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"0\"])[7]")
    private WebElement aadtsemitrailer;
    
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")
    private WebElement addbtn;
    
    public void trafficvolumedata()
    {
    	//obj.login();
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOf(trafficvolumebtn));
    	
    	
    	waitforvisibility(trafficvolumebtn);
    	
    	
    	//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait1.until(ExpectedConditions.elementToBeClickable(selectlink));
        
        
        waitforvisibility(selectlink);
    	
    	waitforclick(link);
    	
    	waitforvisibility(aadtcar);
    	aadtcar.sendKeys("100");
    	
    	waitforvisibility(aadtlargetruck);
    	aadtlargetruck.sendKeys("50");
    	
    	waitforvisibility(aadtmc);
        aadtmc.sendKeys("30");
        
        waitforvisibility(aadtmediumtruck);
    	aadtmediumtruck.sendKeys("20");
    	
    	waitforvisibility(aadtmicrotruck);
    	aadtmicrotruck.sendKeys("10");
    	
    	waitforvisibility(aadtpickup);
    	aadtpickup.sendKeys("5");
    	
    	waitforvisibility(aadtsemitrailer);
    	aadtsemitrailer.sendKeys("2");
    	
    	waitforclick(addbtn);
    }
	
	

}
