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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ActionsClassMouseMethods5 {


    @Test
    public void fileUploadTest() throws AWTException {
        WebDriver wb = new ChromeDriver();
        wb.manage().window().maximize();
        wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wb.get("https://www.cargurus.com/");
        wb.findElement(By.xpath("//label[@data-tab-name='UsedCar']")).click();
        new Select(wb.findElement(By.id("carPickerUsed_makerSelect"))).selectByVisibleText("Lamborghini");


        new Select(wb.findElement(By.id("carPickerUsed_modelSelect"))).selectByVisibleText("Gallardo");
        wb.findElement(By.id("dealFinderZipUsedId_dealFinderForm")).clear();
        wb.findElement(By.id("dealFinderZipUsedId_dealFinderForm")).sendKeys("22031", Keys.ENTER);


        new WebDriverWait(wb, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@data-cg-ft='range-slider-handle-$$-1'])[1]")));

        WebElement slider = wb.findElement(By.xpath("(//button[@data-cg-ft='range-slider-handle-$$-1'])[1]"));


        Actions actions = new Actions(wb);

        actions.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();


    }
}
