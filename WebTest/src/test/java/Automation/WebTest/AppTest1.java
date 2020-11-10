package Automation.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest1
{

	@Test
	public void testapp1()
	
	{
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumClass\\classworksWS\\WebTest\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.className("sf-with-ul")).click(); //for getting women dresses
	     driver.findElement(By.cssSelector("#categories_block_left > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(2)")).click(); //for getting Dresses
	     driver.findElement(By.cssSelector("#categories_block_left > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click(); //for getting Summer Dresses
	     
		
	}
}
