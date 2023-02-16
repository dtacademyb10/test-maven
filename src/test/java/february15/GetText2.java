package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");
//
        System.out.println( driver.findElement(By.className("hero-table-intro")).getText());






    }
}
