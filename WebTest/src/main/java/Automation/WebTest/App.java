package Automation.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver", "E:\\SeleniumClass\\classworksWS\\WebTest\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/help/createaccount");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("u_0_2v")).click(); //for accept cookies
        driver.findElement(By.cssSelector("a._42ft:nth-child(2)")).click(); //create account
        driver.findElement(By.id("u_0_n")).sendKeys("shiny"); //first name
        driver.findElement(By.name("lastname")).sendKeys("Regu"); //last name
        driver.findElement(By.name("reg_email__")).sendKeys("PriceyAutomation@gmail.com"); //for mail id
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("PriceyAutomation@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("PA987654pa"); //password
       
        //for date
        WebElement date = driver.findElement(By.id("day"));
        Select Oselect = new Select(date);
        Oselect.selectByValue("10");
        
        //for month
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select Oselect1 = new Select(month);
        Oselect1.selectByVisibleText("May");
        
        //for year
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select Oselect2 = new Select(year);
        Oselect2.selectByValue("1996");
        
        WebElement button = driver.findElement(By.id("u_0_4")); //for gender 
        button.click();
        
        driver.findElement(By.name("websubmit")).click(); //for submit
        
       
        
        
        
        
         
    }
}
