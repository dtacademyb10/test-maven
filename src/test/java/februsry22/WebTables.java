package februsry22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTables {



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
        driver.findElement(By.linkText("View all products")).click();


        // Verify the header row values are equal to [Product name, Price, Discount]

//        System.out.println( driver.findElement(By.xpath("//table[@class='ProductsTable']//tr[1]")).getText());
        List<WebElement> ths = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr[1]//th"));

        List<String> firstRow =  new ArrayList<>();
        for (WebElement th : ths) {
           firstRow.add(th.getText());
        }

        System.out.println(firstRow);
        Assert.assertEquals(firstRow, List.of("Product name",  "Price", "Discount"));


        // Verify the first column values are "MyMoney",  "FamilyAlbum", "ScreenSaver"


        List<WebElement> firstColumn = driver.findElements(By.xpath(" //table[@class='ProductsTable']//tr/td[1]"));
        List<String> firstColumnActual =  new ArrayList<>();


        for (WebElement td : firstColumn) {
            firstColumnActual.add(td.getText());
        }

        System.out.println(firstColumnActual);


        Assert.assertEquals(firstColumnActual, List.of("MyMoney",  "FamilyAlbum", "ScreenSaver" ));


        //



    }
}
