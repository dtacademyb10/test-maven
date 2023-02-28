package february27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingJSAlerts2 {

    @Test
    public void handleAlerts() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//


        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        // Handle the prompt alert

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();





        Thread.sleep(2000);






    }
}
