package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAttribute2 {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));

        driver.findElement(By.name("q")).sendKeys("Chicken", Keys.ENTER);

      // To get the text from an input box, you need to use getAttribute("value");
//        System.out.println( driver.findElement(By.name("q")).getText() ) ;
        System.out.println( driver.findElement(By.name("q")).getAttribute("value") ) ;

    }
}
