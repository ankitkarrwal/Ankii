package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary 
{
	public static WebDriver driver= null;
	public void launchurl() 
	{
		String path= "C:\\Users\\Laptop Solution\\eclipse-workspace\\Testingbaba_maven\\webdriver\\chromedriver.exe";
		//WebDriverManager.chromedriver().setup();
		System.setProperty("Webdrivermanager.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
		
	}

}
