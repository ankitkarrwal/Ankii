package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary 
{
	public static WebDriver driver= null;
	public void launchurl()
	{
		
		String path = "C:\\Users\\Laptop Solution\\eclipse-workspace\\Testing_automation_maven\\webdriver\\chromedriver.exe";
		 
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
		
	}

}
