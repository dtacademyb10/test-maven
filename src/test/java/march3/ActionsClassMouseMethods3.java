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

public class ActionsClassMouseMethods3 {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://javascript.info/mouse-drag-and-drop");




        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));

        Actions actions = new Actions(driver);

        // Drag and drop with a target
        WebElement source = driver.findElement(By.id("ball"));
        WebElement target = driver.findElement(By.id("gate"));
        actions.dragAndDrop(source, target).build().perform();



        


    }
}
