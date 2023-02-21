package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SendKeys {


    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");

//        driver.findElement(By.id("typeaheadInput")).sendKeys(Keys.chord(Keys.SHIFT,"engineer") );
//        driver.findElement(By.id("typeaheadInput")).sendKeys(Keys.chord(Keys.CONTROL,"A"), Keys.BACK_SPACE );

//        driver.findElement(By.id("typeaheadInput")).sendKeys( "engineer", Keys.TAB, Keys.TAB, "Washington DC", Keys.TAB, Keys.ENTER);

        driver.findElement(By.id("google-location-search")).clear();
        driver.findElement(By.id("google-location-search")).sendKeys("New York, NY");




    }
}
