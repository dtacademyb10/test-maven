package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class XpathAdvanced2 {


    //a

    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait resolves majority of the synchronization issues
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");



        driver.findElement(By.id("typeaheadInput")).sendKeys("SDET", Keys.ENTER);

        //Using predicates
       //    (//a[@class='card-title-link bold'])[2]  -> out of multiple matches, gives the second one

//        driver.findElement(By.xpath("(//a[@class='card-title-link bold'])[2]")).click();


        // Click on the last link regardless of how many links are on the page
        List<WebElement> elements =
                driver.findElements(By.xpath("//a[@class='card-title-link bold']"));


        elements.get(elements.size()-1).click();


        // Find all img elements whose has an alt attribute
        //img[@alt]
        System.out.println( driver.findElements(By.xpath("//img[@alt]")).size());


        // Using not to flip the locator condition

        //a[ not ( @class='card-title-link bold' )] -> find all a's whose class is NOT equal to card-title-link bold

        // Locate all elements that have id attribute
        //*[@id]

        // Locate all elements that DO NOT have id attribute
        //*[not (@id)]


        // Locat ALL elements with that given class
        //*[@class='card-title-link bold']




//








           }
}
