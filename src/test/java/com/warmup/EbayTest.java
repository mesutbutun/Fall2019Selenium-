package com.warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverFactory;

import java.util.Arrays;

public class EbayTest {



        static WebDriver driver;
        public static void main(String[] args) throws Exception{

                WebDriver driver = DriverFactory.createDriver("chrome");
                driver.get("http://ebay.com");
                Thread.sleep(2000);//to wait 2 seconds
                driver.findElement(By.id("gh-ac")).sendKeys("java book");
                Thread.sleep(2000);//to wait 2 seconds
                driver.findElement(By.id("gh-btn")).click();
                Thread.sleep(4000);//to wait 2 seconds
                WebElement searchResults = driver.findElement(By.tagName("h1"));
                String[] searchSentence = searchResults.getText().split(" ");
                System.out.println(Arrays.toString(searchSentence));
                System.out.println(searchSentence[0]);
                driver.quit();
            }
        }


//        ebayTest();
//        amazonTest();


        /**
         * Go to ebay --->          driver.get("http://ebay.com");
         * enter search term        input.sendKeys("java book");
         * click on search button   searchButton.click();
         * print number of results
         */
