import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests {




    @Test
    public void testGoogleSearchResultsPageTitle(){



        WebDriver driver = new ChromeDriver(); //

        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));


        String searchTerm = "chatGPT";
        String expectedTitle =  searchTerm + " - Google Search";
        searchBox.sendKeys(searchTerm, Keys.ENTER);


        String actualTitle = driver.getTitle()+"vdbh";// returns the title of the current page


        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test
    public void testGoogleSearchResultsPageTitle2(){



        WebDriver driver = new ChromeDriver(); //

        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));


        String searchTerm = "ai";
        String expectedTitle =  searchTerm + " - Google Search";
        searchBox.sendKeys(searchTerm, Keys.ENTER);


        String actualTitle = driver.getTitle();// returns the title of the current page


        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
