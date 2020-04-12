package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLinkText {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver,chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        WebElement link=driver.findElement(By.linkText("Basic Auth"));
        link.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement link2=driver.findElement(By.partialLinkText("Drag"));
        link2.click();




    }
}
