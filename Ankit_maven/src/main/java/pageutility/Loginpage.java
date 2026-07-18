package pageutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Loginpage extends Baselibrary
{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement cross;
	
	public void clickoncross()
	{
		cross.click();
	}

}
