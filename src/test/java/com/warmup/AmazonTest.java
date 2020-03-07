package com.warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverFactory;

import java.util.Arrays;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
      //  public static void amazonTest() throws Exception{
            WebDriver driver = DriverFactory.createDriver("chrome");
            driver.get("http://amazon.com");
            //enter text and click ENTER
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
            Thread.sleep(4000);//to wait 2 seconds
            String title = driver.getTitle();
            if(title.contains("java book")){
                System.out.println("TEST PASSED");
            }else {
                System.out.println("TEST FAILED");
            }
            driver.quit();
        }
    }

