package february27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarmUp {


    @Test
    public void testCarsCom() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");



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

//        Thread.sleep(2000);

        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("22031", Keys.ENTER);


        String actual = new Select(driver.findElement(By.id("sort-dropdown"))).getFirstSelectedOption().getText();

        Assert.assertEquals(actual, "Best match");

        new Select(driver.findElement(By.id("sort-dropdown"))).selectByVisibleText("Lowest price");

        Thread.sleep(2000);


        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='vehicle-card-main js-gallery-click-card']//span[@class='primary-price']"));

        List<Integer> original =  new ArrayList<>();

        for (WebElement price : prices) {
            System.out.println(price.getText());
            System.out.println(price.getText().replaceAll("[$,]", ""));
            original.add(Integer.parseInt(price.getText().replaceAll("[$,]", "")));
        }



        List<Integer> sorted =  new ArrayList<>(original);
        Collections.sort(sorted);

        System.out.println("orig:" + original);
        System.out.println("sorted" + sorted);

        Assert.assertEquals(original, sorted);


        new Select(driver.findElement(By.id("sort-dropdown"))).selectByVisibleText("Highest mileage");

        Thread.sleep(2000);

        //div[@class='vehicle-card-main js-gallery-click-card']//div[@class='mileage']

        List<WebElement> mileages = driver.findElements(By.xpath("//div[@class='vehicle-card-main js-gallery-click-card']//div[@class='mileage']"));

        List<Integer> originalMiles =  new ArrayList<>();


        // 290,000 mi.
        // 32,456 mi
        for (WebElement miles : mileages) {
            String text = miles.getText();
            originalMiles.add(Integer.parseInt(text.substring(0, text.indexOf(" ")).replace(",", "")));
        }

        List<Integer> sortedMiles =  new ArrayList<>(originalMiles);

        Collections.sort(sortedMiles, Collections.reverseOrder());

        System.out.println("origMiles: " + originalMiles );
        System.out.println("sortedMiles: " + sortedMiles );
        Assert.assertEquals(originalMiles, sortedMiles);



    }
}
