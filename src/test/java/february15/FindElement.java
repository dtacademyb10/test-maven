package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement {


    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


//        driver.findElement(By.name("w")).sendKeys("cdbvsg");
//        // If findElement() cannot find the element, it throws NoSuchElementException

        List<WebElement> list = driver.findElements(By.tagName("h1"));

        // If findElements() cannot find the element/s, it does not throw any exception but  returns an empty list

        // Since the empty does not throw any exception, you can create a custom logic of throwing an exception
        if(list.size() == 0){
            throw  new RuntimeException("No elements were found");
        }




    }
}
