package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class ChooseRandomOptionFromDropdown {



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



        Select sel = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        List<WebElement> allOptions = sel.getOptions();
        sel.selectByVisibleText( allOptions.get(new Random().nextInt(allOptions.size())).getText() );
//        sel.selectByIndex( new Random().nextInt(allOptions.size()) ); // alternatively



    }
}
