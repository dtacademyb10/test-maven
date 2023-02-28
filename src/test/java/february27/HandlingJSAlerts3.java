package february27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingJSAlerts3 {

    @Test
    public void handleAlerts() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/");

//


        driver.findElement(By.id("loginUsername")).sendKeys("minnie2022",
                Keys.TAB,
                "minnie2022",
                Keys.ENTER);

        // Handle the prompt alert

        driver.findElement(By.xpath("//span[.='Your Music']")).click();
        driver.findElement(By.xpath("//button[.='NEW PLAYLIST']")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Relax");
        alert.accept();

        Thread.sleep(1000);


        Assert.assertTrue(driver.getPageSource().contains("Relax"));









    }
}
