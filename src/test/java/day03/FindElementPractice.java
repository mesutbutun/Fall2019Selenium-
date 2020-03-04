package day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DriverFactory;

public class FindElementPractice {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();

        WebDriver driver= DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.quit();
    }
}
