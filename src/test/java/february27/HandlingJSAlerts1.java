package february27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingJSAlerts1 {

    @Test
    public void handleAlerts() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//


        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        // Handle the confirm alert

        Alert alert = driver.switchTo().alert();  //switches the context to a current alert


        System.out.println( "The alert text is: " + alert.getText()) ;
//        alert.accept();  //clicking ok
        alert.dismiss();  //clicking cancel



        Thread.sleep(2000);


        driver.findElement(By.linkText("Elemental Selenium")).click();



    }
}
