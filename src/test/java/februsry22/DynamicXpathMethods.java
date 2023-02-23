package februsry22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicXpathMethods {


    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5_')]")).click();
        ////button[contains(@id, 'u_0_5_')]
        //button[starts-with(@id, 'u_0_5_')]


        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("The email or mobile number you entered isn’t connected to an account. "));

    }
}
