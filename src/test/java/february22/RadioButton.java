package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class RadioButton {



    @Test
    public void navigate() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        String username = "Tester";
        String password = "test";
        Thread.sleep(500);

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(username);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(password);
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();


//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();

         // Randomly

        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']//input[@type='radio']"));

        elements.get(new Random().nextInt(elements.size())).click();




    }
}
