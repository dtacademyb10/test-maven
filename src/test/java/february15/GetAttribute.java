package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAttribute {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));

        System.out.println(searchBox.getAttribute("maxLength"));
        System.out.println(searchBox.getAttribute("title"));
        System.out.println(searchBox.getAttribute("data-ved"));



        // Locate all links on the page and print all of the links' url

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getText() + ": " + link.getAttribute("href"));
        }


    }
}
