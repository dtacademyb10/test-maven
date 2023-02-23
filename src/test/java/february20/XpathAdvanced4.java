package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathAdvanced4 {




    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait resolves majority of the synchronization issues
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");


        driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("bdcsvghd");

        // Finding elements with dynamic attribute values

        //input[starts-with(@name, 'name')]
        //input[ends-with(@name, 'name')]
        //input[contains(@name, 'name')]













           }
}
