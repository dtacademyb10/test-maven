package march3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ActionsClassMouseMethods4 {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://javascript.info/mouse-drag-and-drop");




        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://en.js.cx/article/mouse-drag-and-drop/ball3/']")));

        Actions actions = new Actions(driver);

        // Drag and drop with an x or y
        WebElement source = driver.findElement(By.id("ball"));

        actions.dragAndDropBy(source, 100, 100).
                dragAndDropBy(source, 50, -50).
                dragAndDropBy(source, 50, 50).
                dragAndDropBy(source, 50, -50).
                dragAndDropBy(source, 50, 50).

                build().perform();



        


    }
}
