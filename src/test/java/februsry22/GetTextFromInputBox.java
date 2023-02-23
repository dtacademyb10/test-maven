package februsry22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTextFromInputBox {



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
        int randomNumber = 1 + (int) (Math.random() * 99);
        String random = String.valueOf(randomNumber);
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(random);
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        int num = 0;
        if (randomNumber < 10) {
            num += randomNumber * 100;
        } else {
            num += randomNumber * 92;
        }

        String number = String.valueOf(num);
        Thread.sleep(500);
        WebElement total = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtTotal"));
        Assert.assertEquals(total.getAttribute("value"), number);

        // To get the text from an input box, use  getAttribute("value")

    }
}
