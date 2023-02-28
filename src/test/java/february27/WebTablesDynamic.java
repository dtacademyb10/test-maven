package february27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTablesDynamic {


    //table//thead//th

    @Test
    public void webtables() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://coinmarketcap.com/");

        // get the number of th's in the header row
        int columnCount = driver.findElements(By.xpath("//table//thead//th")).size();
        // get the number of rows by finding the tr's in tbody
        int rowCount = driver.findElements(By.xpath("//table//tbody//tr")).size();

        System.out.println("The column count: " + columnCount);
        System.out.println("The row count: " + rowCount);


        //scroll down slowly so that all the rows are loaded

//        for (int i = 0; i < 9; i++) {
//            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", "");
//            Thread.sleep(500);
//        }



//        Thread.sleep(3000);
        // print each cell value using a nested loop



//        for (int i = 1; i <=rowCount ; i++) {
//
//            for (int j = 1; j <=columnCount ; j++) {
//
//                String xpath = "//table//tbody//tr["+i+"]//td["+j+"]";  // create a dynamic xpath using row and column values
//
//                System.out.print(driver.findElement(By.xpath(xpath)).getText() + "\t") ;
//
//            }
//            System.out.println();
//
//        }

//        List<WebElement> crytoNames = driver.findElements(By.xpath("//table//tbody//tr//td[3]//p[@class='sc-e225a64a-0 ePTNty']"));
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println( crytoNames.get(i).getText());
//        }


        //Find the max value from 1h change column dynamically (the column values change every 2 seconds)


        // We eill need to scroll down for this application specifically so that rows appear
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);


        // Grab all elements for the column in a list
        List<WebElement> percentagesList = driver.findElements(By.xpath("//table//tbody//tr//td[5]//span[@class='sc-97d6d2ca-0 bQjSqS']"));


         // Get the text of the first row value and convert to double and assign to a max
        String text = driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]//span[@class='sc-97d6d2ca-0 bQjSqS']")).getText();
        double max = Double.parseDouble( text.substring(0, text.length()-1));


        // Get the text of the other row values and convert to double and compare with max and update max when necassary
        int indexOfMax = -1;
        for (int i = 2; i <=10 ; i++) {
            String text1 = percentagesList.get(i).getText();
            double current = Double.parseDouble( text1.substring(0, text1.length()-1));
            if(current > max){
                max = current;
                indexOfMax = i;
            }
        }

        System.out.println("The max change is " + max + " at row no " + indexOfMax);


    }
}
