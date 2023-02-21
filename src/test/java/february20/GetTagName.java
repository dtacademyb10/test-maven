package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class GetTagName {


    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");

        List<WebElement> elements = driver.findElements(By.xpath("//*"));


        for (WebElement element : elements) {
//            System.out.println(element.getTagName());

            if(element.getTagName().equals("a")){
                System.out.println(element.getAttribute("href"));
            }
        }


    }
}
