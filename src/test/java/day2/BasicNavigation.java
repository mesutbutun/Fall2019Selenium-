package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args)throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();

        driver.get("http://google.com"); // to open a website

        Thread.sleep(3000); // for demo, wait 3 seconds

        String title= driver.getTitle();
        String expectedTitle= "Google";
        System.out.println("Title is " + title);
        if(expectedTitle.equals(title)){
            System.out.println("Test Passed" );
        }else {
            System.out.println("Test Failed");
        }

        driver.close(); // to close browser
        // browser can not close itself
    }
}
