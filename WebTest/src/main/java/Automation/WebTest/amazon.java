package Automation.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumClass\\classworksWS\\WebTest\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("JBL earphones");
		WebElement SearchIcon = driver.findElement(By.xpath("//input[@value='Go']"));
		SearchIcon.click();
		
        driver.quit();
 
		
		

	}

}
