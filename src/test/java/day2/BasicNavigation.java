package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args)throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();

        driver.get("http://google.com"); // to open a website

        Thread.sleep(3000); // for demo, wait 3 seconds

        driver.close(); // to close browser
    }
}
