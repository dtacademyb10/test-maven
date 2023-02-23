package february22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTables2 {



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




        // Verify  first row values by printing

//        List<String> newList =  new ArrayList<>();
//        for (WebElement e: driver.findElements(By.xpath("//table//tr[9]/td"))){
//            newList.add(e.getText());
//        }
//
//        System.out.println(newList);


        System.out.println( getRowValues(driver,0)) ;
        System.out.println( getRowValues(driver,2)) ;
        System.out.println( getRowValues(driver,8)) ;

    }

    public static List<String> getRowValues(WebDriver driver, int rowNo){
        List<String> newList =  new ArrayList<>();

        String myXpath = "//table[@class='SampleTable']//tr["+(rowNo+1)+"]/td"; // rowNo+1 -> to adjust the row number to actual xpath index

        for (WebElement e: driver.findElements(By.xpath(myXpath))){
            newList.add(e.getText());
        }

        return  newList;
    }


}
