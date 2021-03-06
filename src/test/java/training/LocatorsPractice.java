package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.name("q"));
        Thread.sleep(3000);
        search.sendKeys("java", Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        driver.quit();
    }
}