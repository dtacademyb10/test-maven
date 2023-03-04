package march3;

import march1.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ActionsClassMouseMethods {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
        SeleniumUtilities.scrollTillElement(driver, driver.findElement(By.linkText("Result")));

        driver.switchTo().frame("frame_examples");

        WebElement element = driver.findElement(By.xpath("//aside"));

        Actions actions = new Actions(driver);

        actions.doubleClick(element).build().perform();


    }
}
