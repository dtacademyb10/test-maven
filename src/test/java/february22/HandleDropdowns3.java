package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDropdowns3 {



    @Test
    public void handleDropDowns() throws InterruptedException {

        // Navigate to cars.com

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");


        // Verify that the default selected option for new/used and make dropdowns are Certified and Volvo

       String actualNewUsed =  new Select(driver.findElement(By.id("make-model-search-stocktype"))).getFirstSelectedOption().getText();
       //The first selected option in this select tag (or the currently selected option in a normal select)
        String actualMake =   new Select(driver.findElement(By.id("makes"))).getFirstSelectedOption().getText();

        Assert.assertEquals(actualNewUsed,"Certified");
        Assert.assertEquals(actualMake,"Volvo");




    }

}
