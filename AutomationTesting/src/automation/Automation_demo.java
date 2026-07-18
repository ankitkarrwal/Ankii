package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/nav[2]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[1]")).sendKeys("Ankit");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[2]")).sendKeys("ankit@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[1]")).sendKeys("sirsa,haryana");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/textarea[2]")).sendKeys("Sherpura,Sirsa");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[3]")).click();
	}

}
