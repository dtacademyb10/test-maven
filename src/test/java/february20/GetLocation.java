package february20;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GetLocation {


    @Test
    public void testingDice() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.dice.com/");

        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/binaries/content/gallery/dice/icons/dice-logo.svg']"));

        System.out.println(logoElement.getLocation());

        Assert.assertEquals(logoElement.getLocation().toString(), "(396, 271)");


        // Verify the size of the logo

        System.out.println( logoElement.getSize());

        Assert.assertEquals(logoElement.getSize().toString(), "(147, 95)");

        // Check the size of all elements on the page

//        for ( WebElement element : driver.findElements(By.xpath("//*"))){
//            System.out.println(element.getSize());
//        }

        // How to check if element is visible/displayed?

        //Check the size (height and width) and verify that they are greater than 0

        if(logoElement.getSize().getHeight() > 0 && logoElement.getSize().getWidth() > 0){
            System.out.println("Logo is visible");
        }

        // An easier way -> use a built in isDisplyed() method


        if(logoElement.isDisplayed()){
            System.out.println("Logo is visible");
        }



    }
}
