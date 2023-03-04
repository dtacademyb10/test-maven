package march3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ActionsClassMouseMethods6 {


    @Test
    public void fileUploadTest() throws AWTException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/hovers");

        // SHORTCU to store the result of the method call in a variable
        // Ctrl+Alt+V -> Windows
        // Option+Command+V -> Mac
        WebElement element = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));


        Actions actions = new Actions(driver);

        actions.moveToElement(element).build().perform();

        driver.findElement(By.xpath("//a[@href='/users/1']")).click();


        driver.get("https://www.amazon.com/");

        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();





    }
}
