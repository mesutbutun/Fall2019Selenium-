package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementXpath {
    public static void main(String[] args) throws Exception{
      // System.setProperty("webdriver,chrome.driver","chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

         driver.get("http://practice.cybertekschool.com");
        WebElement link=driver.findElement(By.xpath("span[@class='h1y']"));
        link.click();
        System.out.println(" = " +link.getText());

    }
}
