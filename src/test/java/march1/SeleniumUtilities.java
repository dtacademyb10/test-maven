package march1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtilities {

    public static void jsClick(WebDriver driver, WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element );
    }


    public static void switchToWindow(String title, WebDriver driver){

        for (String windowHandle : driver.getWindowHandles()) { // get all window handles in to a set and iterate through the set
            driver.switchTo().window(windowHandle);  //switch to a window using its handle
            if(driver.getTitle().equals(title)){  //check the title
                break; // if the title is as expected, stay in the current page
            }
        }
    }


    public static void waitTillElementIsClickable(WebDriver driver, WebElement element, long waitTime){
        new WebDriverWait(driver, Duration.ofSeconds(waitTime)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitTillElementIsVisible(WebDriver driver, WebElement element, long waitTime){
        new WebDriverWait(driver, Duration.ofSeconds(waitTime)).until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollTillElement(WebDriver driver, WebElement element ){
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+element.getLocation().getY()+")");
    }
}
