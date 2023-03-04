package march3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ActionsClassMethods2 {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");

        Actions actions = new Actions(driver);
        WebElement inputBox = driver.findElement(By.name("q"));
        actions.keyDown(Keys.SHIFT).sendKeys(inputBox, "actions class selenium", Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
        // in the next page type something on the input box
        inputBox = driver.findElement(By.name("q"));
        actions.sendKeys(inputBox, "cbdcsbjsdbcjdsb").build().perform();

    }
}
