package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WarmUp {




    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait resolves majority of the synchronization issues
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");



        driver.findElement(By.id("typeaheadInput")).sendKeys("SDET", Keys.ENTER);



        List<WebElement> elements = driver.findElements(By.xpath("//a[@class='card-title-link bold']"));

        if(elements.size()==0){
            throw new RuntimeException("List is empty");
        }else{
            System.out.println("The list size is " + elements.size() );
        }
//


        for (WebElement each:elements) {
            System.out.println(each.getText());
            Assert.assertTrue(each.getText().contains("SDET"));
        }


    }
}
