package training;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class VytrackLoginPageTest {

    private WebDriver driver;
    // https is a secured version of http protocol
    // http it's hypertext transfer protocol that every single website is using now days
    // https-data encrypted, no chance for hackers to retrieve info
    // http- data is plain text, very easy to hack it
    private String URL="https://qa2.vytrack.com/user/login";
    private String userName="storemanager85";
    private String password="UserUser123";
    private By userNameBy= By.id("prependedInput");
    private By passwordBy= By.id("prependedInput2");
    // in css selector means the same thing as / in xpath-direct child
    private By warningMessageBy=By.cssSelector("[class='alert alert-error']>div");

    @Test (description = "verify that warning message displays when user enters invalid username")
    public void invalidUserName(){
        driver.findElement(userNameBy).sendKeys("invalidUserName");
        driver.findElement(passwordBy).sendKeys("UserUser123", Keys.ENTER);
        BrowserUtils.wait(5);




        WebElement warningElement=driver.findElement(warningMessageBy);
        assertTrue(warningElement.isDisplayed());

        String expected="Invalid user name or password";
        String actual=warningElement.getText();
        assertEquals(actual,expected);


    }
    @Test (description="Login  as store manager and verify that title is equals to Dashboard ")
    public void loginAsStoreManager(){
        driver.findElement(userNameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password,Keys.ENTER);
        String expected="Dashboard";
        String actual=driver.getTitle();
        assertEquals(actual,expected,"page title is not correct!");

    }


   @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();


    }
@AfterMethod
    public  void teardown(){
       // if web driver object alive
       if(driver!=null){
           driver.quit();
           // destroy web driver object for sure
           driver=null;
       }

    }
}
