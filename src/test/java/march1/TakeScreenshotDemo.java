package march1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TakeScreenshotDemo {




    @Test
    public void testScreenshot() throws IOException {

        // How to take a screenshot in Selenium?
        // We use TakesScreenshot interface and its getScreenshotAs method
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test1", Keys.ENTER);

        // if assertion fails, take a screenshot
        try{
            Assert.assertEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        }catch (AssertionError e){
//            byte[] screenshotAsFiles = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            Files.write(Path.of("screenshot.png"),screenshotAsFiles);
            SeleniumUtilities.takeScreenshot(driver, "src/test/java/march1/screenshots/image.jpeg");
            throw e; //re-throw the error so that this test's status will be failed
        }





        // To get a unique value in Java use either System.currenttimemillis() or UUID.randomUUID() methods



    }
}
