package com.automation.tests.warmup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.automation.utilities.DriverFactory;

public class March4 {
    public static void main(String[] args) throws InterruptedException {
       ;
       // public static void wikiTest() throws Exception{
            WebDriver driver = DriverFactory.createDriver("chrome");
            //Go to wikipedia.org
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            //enter search term `selenium webdriver` & click on search button
            driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.RETURN);
            Thread.sleep(3000);
            //click on search result `Selenium (software)`
            driver.findElement(By.partialLinkText("Selenium (software)")).click();
            Thread.sleep(2000);
            String link = driver.getCurrentUrl(); // to get link as a String
            //verify url ends with `Selenium_(software)`
            if(link.endsWith("Selenium_(software)")){
                System.out.println("TEST PASSED");
            }else {
                System.out.println("TEST FAILED");
            }
            driver.quit();
        }
    }







        /**
         * go to amazon
         * enter search term
         * click on search button
         * verify title contains search term
         */

        /**
         * Go to wikipedia.org
         * enter search term `selenium webdriver`
         * click on search button
         * click on search result `Selenium (software)`
         * verify url ends with `Selenium_(software)`
         */

