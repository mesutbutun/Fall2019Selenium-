package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws  Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        // find all elements  with tag name it
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        // loop through this  list of elements
        for(WebElement checkbox:checkboxes){
            Thread.sleep(3000);
            // if checkbox is not selected yet
            if(!checkbox.isSelected()){
                // select it
                checkbox.click();
            }
        }

        driver.quit();

    }
}
