package march3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileDownload {

    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/download");


//        driver.findElement(By.linkText("webdriverIO.png")).click();
      // Use Robot class to interact with Operating system windows
//        Robot robot = new Robot();
//        robot.mouseMove(500, 500);




    }
}
