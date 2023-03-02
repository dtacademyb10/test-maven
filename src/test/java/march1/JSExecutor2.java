package march1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSExecutor2 {

    @Test
    public void testJSexecutor() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("document.getElementById('twotabsearchtextbox').value='coffee';"); // sendKeys using jsExecutor
//        js.executeScript("alert (\"Hello world!\");"); //display an alert using jsExecutor


//        js.executeScript("window.scrollBy(0,2000)");  //scroll down
//        js.executeScript("window.scrollBy(0,-500)");  //scroll up


        // Scroll till a specific element on the page

        int y = driver.findElement(By.linkText("Careers")).getLocation().getY();  //find the y (vertical) location of the element
        js.executeScript("window.scrollBy(0,"+y+")"); // use it in a scrollBy method

//        SeleniumUtilities.scrollTillElement(driver, driver.findElement(By.linkText("Careers"))); // using a utility method for the same action above

        // Click on a link that is hidden
       // driver.findElement(By.xpath("//a[@href='/gp/subs/primeclub/account/homepage.html?ref_=nav_AccountFlyout_prime']")).click();
        WebElement primeLink = driver.findElement(By.xpath("//a[@href='/gp/subs/primeclub/account/homepage.html?ref_=nav_AccountFlyout_prime']"));
        js.executeScript("arguments[0].click();", primeLink );

      //  SeleniumUtilities.jsClick(driver, primeLink);  // using a utility method for the same action above


    }



}
