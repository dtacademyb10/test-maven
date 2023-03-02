package march1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {


    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      // You apply implicit wait once in the beginning of the script
        // Implicit wait is considered a global wait, which means it is applicable to all elements of the script
        // in other terms, whenever findElement/s methods are called the implicit wait will be applied
        driver.get("https://www.instagram.com/");
//        Thread.sleep(5000); //static wait, should be used only when other waits do not give the expected results

        driver.findElement(By.name("username")).sendKeys("Hello");
    }
}
