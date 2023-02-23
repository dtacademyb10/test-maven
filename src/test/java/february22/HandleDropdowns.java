package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDropdowns {



    @Test
    public void handleDropDowns() throws InterruptedException {

        // Navigate to cars.com

        WebDriver driver = new EdgeDriver();
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
        new Select(driver.findElement(By.id("make-model-maximum-distance"))).selectByVisibleText("100 miles");

        Thread.sleep(2000);

        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("22031", Keys.ENTER);







    }

}
