package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathAdvanced {


    //a

    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        driver.get("https://www.hoteltonight.com/");

        //a -> matches all a elements on the page

        //input[@id='hello']  -> finds an input element with an id attribute that is equal to hello


//        System.out.println( driver.findElement(By.xpath("//h1[@class='_1v5veuv']")).getText()) ;
        System.out.println( driver.findElement(By.xpath("//h1[@class='_1v5veuv']")).getText()) ;


        // By exact text
        //h1[text()='Incredible last-minute hotel deals']
        //h1[.='Incredible last-minute hotel deals']

        System.out.println( driver.findElement(By.xpath(" //h1[.='Incredible last-minute hotel deals']")).getText()) ;


        // By partial match

        //h1[ contains( text(), 'last-minute' )]
        //h1[ contains( . , 'last-minute' )]

        System.out.println( driver.findElement(By.xpath("//h1[ contains( . , 'last-minute' )]")).getText()) ;







           }
}
