package march1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class HandlingWindows2 {


    @Test
    public void testWindows(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.cars.com/");

        driver.findElement(By.linkText("Grow with CARS")).click();

        //Switch to a newly opened window using its title

        // Get all window handles

        Set<String> windowHandles = driver.getWindowHandles();


        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);  //switch to a window
            if(driver.getTitle().equals("Let’s Grow Your Dealership ROI | GrowWithCars.com")){  //check the title
                break; // stay in the current page
            }
        }

        System.out.println("The current url is: " + driver.getCurrentUrl());


        driver.findElement(By.xpath("//a[@aria-label='YouTube']")).click();


        switchToWindow("Grow With Cars - YouTube", driver);

        System.out.println("The current url is: " + driver.getCurrentUrl());


        // Close the YouTube window and switch back to the second window


        driver.quit();

       // NoSuchWindowException: no such window: target window already closed
        // happens when you close the current window and do not switch


        // After closing the current active window, you still need to switch to a new window since Selenium does not automatically switch to another window

        switchToWindow("New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com", driver);

        System.out.println("The current url is: " + driver.getCurrentUrl());



       // NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
        // Happens when you quit the driver and try to use it afterwards by calling a method on a driver


        // Common Selenium Exceptions:

        // NoSuchElementException, StaleElementReferenceException, ElementClickInterceptedException



    }



    public static void switchToWindow(String title, WebDriver driver){

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);  //switch to a window
            if(driver.getTitle().equals(title)){  //check the title
                break; // stay in the current page
            }
        }
    }
}
