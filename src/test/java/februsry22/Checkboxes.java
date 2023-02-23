package februsry22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class Checkboxes {



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
        driver.findElement(By.linkText("View all orders")).click();




        List<WebElement> elements = driver.findElements(By.xpath("//table//input[@type='checkbox']"));

//     Check on the last checkbox

        // Before clicking on a checkbox, check is it is NOT selected already since clicking twice will uncheck it
//        WebElement lastCheckbox = elements.get(elements.size() - 1);
//
//        if(!lastCheckbox.isSelected()){ //Determine whether this element is selected or not. This operation only applies to input elements such as checkboxes, options in a select and radio buttons
//            lastCheckbox.click();
//        }

        for (WebElement checkbox : elements) {
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }







    }
}
