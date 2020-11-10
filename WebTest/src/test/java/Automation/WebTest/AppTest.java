package Automation.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest
{
	@Test
    public void testApp()
    {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumClass\\classworksWS\\WebTest\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		     
		     driver.findElement(By.cssSelector(".shopping_cart > a:nth-child(1)")).click();
		     driver.findElement(By.cssSelector(".sf-menu > li:nth-child(3) > a:nth-child(1)")).click();
		     driver.findElement(By.cssSelector(".available-now")).click();
		     driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span:nth-child(1)")).click();
		    
		     WebDriverWait wait = new WebDriverWait(driver, 30);
		     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.button-medium > span:nth-child(1) > i:nth-child(1)")));
		     element.click();
		     
		     WebDriverWait obj = new WebDriverWait(driver, 30);
		     WebElement delete = obj.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-trash")));
		     delete.click();
		     
		
		  


    }   
    
}
