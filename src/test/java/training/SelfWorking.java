package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorking {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.name("q"));
        Thread.sleep(3000);

        search.sendKeys("www.amazon.com", Keys.ENTER);
        WebElement search1=driver.findElement(By.cssSelector("h3"));
        search1.click();

        WebElement search2=driver.findElement(By.xpath("twotabsearchtextbox"));
       Thread.sleep(3000);
      search2.sendKeys("shoes",Keys.ENTER);

     //   WebElement search1=driver.findElement(By.tagName("a"));

//        driver.close();

    }
}
