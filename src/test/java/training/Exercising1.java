package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercising1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.get("http://www.google.com");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //System.out.println("driver = " +;
      //  String title=driver.getTitle();
        System.out.println("title = " +driver.getTitle());




        driver.close();
    }
}
