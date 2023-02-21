package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SendKeys2 {


    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        driver.get("https://www.hoteltonight.com/");



        driver.findElement(By.name("searchfield")).click();
        driver.findElement(By.name("searchfield")).sendKeys(Keys.chord(Keys.SHIFT, "A"), Keys.BACK_SPACE, "New York City, NY");

//        driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).submit();
        //If this current element is a form, or an element within a form, then this will be submitted to the remote server.
        // doesn't always work, instead use click() or Enter
        driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).click();

    }
}
