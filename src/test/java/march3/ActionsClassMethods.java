package march3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ActionsClassMethods {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com");

        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
