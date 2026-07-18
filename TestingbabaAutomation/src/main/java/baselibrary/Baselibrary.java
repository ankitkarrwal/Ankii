package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary 
{
	public static WebDriver driver = null;
	
	public void launchurl()
	{
		String path= "C:\\Users\\Laptop Solution\\eclipse-workspace\\TestingbabaAutomation\\webdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("testingbaba.com/old/");
		driver.manage().window().maximize();
	}

}
