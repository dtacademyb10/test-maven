package february20;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class XpathAdvanced3 {


    //a

    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait resolves majority of the synchronization issues
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.duotech.io/");



        //Find the non-unique element based on its unique parent

        //div[@class='side-feature-info']//p  ->  //div[@class='side-feature-info'] -> uniqe parent and p is non unique


        //To scroll down

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");


        System.out.println(driver.findElement(By.xpath("//div[@class='side-feature-info']//p")).getText());



        // locate the unique child and based on it locate the non-unique parent

        //p[contains(., 'The Software Tester is an engineer')]//parent::div

        driver.get("https://www.duotech.io/software-qa-engineer");

        System.out.println(driver.findElement(By.xpath("//p[contains(., 'The Software Tester is an engineer')]//parent::div")).getText());



        // Find unique sibling and from there find the non-unique following sibling

        //div[.='THE PROGRAM']/following-sibling::h2


        // Find unique sibling and from there find the non-unique preceding sibling

        //p[contains(., 'follow the latest trends')]/preceding-sibling::h2










           }
}
