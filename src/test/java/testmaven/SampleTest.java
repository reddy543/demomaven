package testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
    static WebDriver driver;
    /*public static void main(String[] args) {
       
    
        
    }*/
    @Test
    public void testmethod(){
        
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
    @BeforeMethod
    public void testMethod1() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
    }
    @AfterMethod
    public void testClose(){
            driver.close();
            
    }
}
