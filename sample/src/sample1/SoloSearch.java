package sample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SoloSearch {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.gecko.driver", "E:\\SeleniumClass\\classworksWS\\sample\\Drivers\\geckodriver.exe");
     WebDriver driver =new FirefoxDriver();
     driver.get("http://automationpractice.com/index.php");
     
     //1.acceptance criteria
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
     
     //2acceptance criteria
     
     driver.findElement(By.className("sf-with-ul")).click(); //for getting women dresses
     driver.findElement(By.cssSelector("#categories_block_left > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(2)")).click(); //for getting Dresses
     driver.findElement(By.cssSelector("#categories_block_left > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click(); //for getting Summer Dresses
     
     //3 acceptance criteria
     WebElement slider = driver.findElement(By.cssSelector("a.ui-slider-handle:nth-child(3)"));
	 Actions action = new Actions(driver);

   	action.dragAndDropBy(slider, 169, 1226).release().build().perform();
	slider.click();
   
	//After this Website is not loading
	
	//4 acceptance criteria
	
     //Creating Account
     driver.findElement(By.className("login")).click();
     driver.findElement(By.id("email_create")).sendKeys("PriceyAutomation@gmail.com"); //for email
     driver.findElement(By.cssSelector("#SubmitCreate > span:nth-child(1)")).click(); //for create account
    
     WebElement radio2 = driver.findElement(By.id("id_gender2"));
     radio2.click();
     
     driver.findElement(By.id("customer_firstname")).sendKeys("Pricey");
     driver.findElement(By.id("customer_lastname")).sendKeys("Regu");
     driver.findElement(By.name("email")).sendKeys("PriceyAutomation@gmail.com");
     driver.findElement(By.id("passwd")).sendKeys("PA987654pa");
     
     //for date
     WebElement date = driver.findElement(By.id("days")); 
     Select oselect = new Select(date);
     oselect.selectByValue("10");
     
     //for month
     WebElement month = driver.findElement(By.id("months"));
     Select oselect1 = new Select(month);
     oselect1.selectByVisibleText("May");
     
     //for year
     WebElement year = driver.findElement(By.id("years"));
     Select oselect2 = new Select(year);
     oselect2.selectByVisibleText("2010");
     
     //newsletter
     WebElement checkbox = driver.findElement(By.id("newsletter"));
     checkbox.click();
     
     // special offers
     WebElement special = driver.findElement(By.id("optin"));
     special.click();
     
     //Your Address
     driver.findElement(By.id("firstname")).sendKeys("Pricey");
     driver.findElement(By.id("lastname")).sendKeys("Regu");
     driver.findElement(By.id("company")).sendKeys("ABC.com");
     driver.findElement(By.id("address1")).sendKeys("lONDON");
     driver.findElement(By.id("address2")).sendKeys("London");
     driver.findElement(By.id("city")).sendKeys("London");
     
     //for state
     WebElement state = driver.findElement(By.id("id_state"));
     Select oselect3 = new Select(state);
     oselect3.selectByVisibleText("indiana");
     
     driver.findElement(By.id("postcode")).sendKeys("IG3 2XX");
     
     //for country
     WebElement country = driver.findElement(By.id("postcode"));
     Select oselect4 = new Select(country);
     oselect4.selectByVisibleText("United States");
     
     driver.findElement(By.id("other")).sendKeys("abc ..........");
     driver.findElement(By.id("phone")).sendKeys("555555");
     driver.findElement(By.id("phone_mobile")).sendKeys("07541111111");
     
     driver.findElement(By.name("alias")).sendKeys("..sbn....");
     driver.findElement(By.cssSelector("#submitAccount > span:nth-child(1)")).click();
     driver.findElement(By.cssSelector("#submitAccount > span:nth-child(1) > i:nth-child(1)")).click();

    
     
     
   
     
    
     
         
     
    		 
   
     

	}

}
