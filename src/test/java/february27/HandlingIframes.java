package february27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandlingIframes {


    //table//thead//th

    @Test
    public void webtables() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.duotech.io/enroll-sqae2");

        //switch the driver's context to an iframe

//        driver.switchTo().frame(0); //switches to the first ifame on the page
//        driver.switchTo().frame("idOrName");
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[starts-with(@id, '167')]"));
        driver.switchTo().frame(iframeElement);

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Erick");


        driver.switchTo().defaultContent();  //switches the context to the main page


        WebElement lmsLink = driver.findElement(By.linkText("LMS"));

        ( (JavascriptExecutor) driver).executeScript("arguments[0].click();", lmsLink);


//        driver.switchTo().parentFrame(); //Change focus to the parent iframe.





























    }
}
