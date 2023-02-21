package february15;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCSSValue {


    @Test
    public void warmUP() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("fvdvfd");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("tevdsvdst");
        driver.findElement(By.className("button")).click();


        System.out.println( driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color"));
        System.out.println( driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("text-align"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("font-family"));









    }
}
