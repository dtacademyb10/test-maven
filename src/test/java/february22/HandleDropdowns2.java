package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandleDropdowns2 {



    @Test
    public void handleDropDowns() throws InterruptedException {

        // Navigate to cars.com

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");


        // Verify that the first dropdown options are "New and used", "New and certified", "New", "Used", "Certified"

        List<String> expectedValues = List.of("New & used", "New & certified", "New", "Used", "Certified");


        List<WebElement> options = new Select(driver.findElement(By.id("make-model-search-stocktype"))).getOptions();
        //returns all options belonging to this select tag

        List<String> actualValues =  new ArrayList<>();
        //Extract the text from each option and add them to a list of String
        for (WebElement option : options) {
            actualValues.add( option.getText() );
        }

        Assert.assertEquals( actualValues, expectedValues);


        //


    }

}
