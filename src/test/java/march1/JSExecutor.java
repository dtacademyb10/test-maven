package march1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSExecutor {

    @Test
    public void testJSexecutor() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");


        // Choose used from the first dropdown menu

        // locate the webelement
        WebElement usedDropDownBox = driver.findElement(By.id("make-model-search-stocktype"));
        // pass the webelement into the constructor
        Select select = new Select(usedDropDownBox);
        select.selectByVisibleText("Used");

        // Next dropdownbox

        new Select(driver.findElement(By.id("makes"))).selectByValue("lamborghini");

        // Next dropdownbox

        new Select(driver.findElement(By.id("models"))).selectByIndex(7); // the index is zero-based

        new Select(driver.findElement(By.id("make-model-max-price"))).selectByVisibleText("No max price");
        new Select(driver.findElement(By.id("make-model-maximum-distance"))).selectByVisibleText("All miles from");

        Thread.sleep(2000);

        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("22031", Keys.ENTER);

        //        driver.findElement(By.id("model_lamborghini-400_gt")).click();

        //ElementClickInterceptedException: element click intercepted
        // happens when one element covers another element

        WebElement checkbox = driver.findElement(By.id("model_lamborghini-400_gt"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", checkbox );

//        SeleniumUtilities.jsClick(driver, checkbox);







    }



}
