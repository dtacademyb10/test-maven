package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathDemoUsingAttributes {


    @Test
    public void warmUP() {


        // Xpath -> XML Path query language that is used to retrieve values from an XML/HTML document

        // Xpath can be created in 2 ways:  absolute path or relative path
        // absolute path -> the full path that starts from the root element of html document (<html>)
        // Example ->  html/body/div


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        System.out.println( driver.findElement(By.xpath("html/body/div")).getText());

//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Full Xpath");

        // Relative path -> path that you can create using // and it does not have start with root html element
        // Example : //input[@class='gLFyf']

//        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Relative Xpath");

      // syntax ->  //elementName[@attrName='attrValue']
        //input[@maxLength='2048']
        //button[@type='submit']

        // Using more than one attribute

        //input[@role='button'][@]

        //input[@role='button'][@value="I'm Feeling Lucky"]

        driver.findElement(By.xpath("//input[@role='button'][@value=\"I'm Feeling Lucky\"]")).click();




    }
}
