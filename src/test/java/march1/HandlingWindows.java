package march1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class HandlingWindows {


    @Test
    public void testWindows(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.cars.com/");

        driver.findElement(By.linkText("Grow with CARS")).click();

        //Switch to a newly opened window

        //Get the handle of the window
        String windowHandleOfCarsCom = driver.getWindowHandle();
        System.out.println("The first window: " + windowHandleOfCarsCom);

        Set<String> allWindowHandles = driver.getWindowHandles();

        System.out.println("All windows: " + allWindowHandles);

        for (String current : allWindowHandles) {
            if(!current.equals(windowHandleOfCarsCom)){
                driver.switchTo().window(current);
            }
        }




        System.out.println("The current url is: " + driver.getCurrentUrl());

        // If you have 2 windows/tabs, grab the current window's handle, then you need to grab both windows' handles and
        // iterate through the set of handles and eliminate the current one and switch to the other one




    }
}
