package march3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUpload {

    @Test
    public void fileUploadTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/upload");


        // relative path does not work, need to provide absolute path

        //To obtain the path to the current project's folder, Use System.getProperty("user.dir")
//        String pathTotheCurrentProject = System.getProperty("user.dir");
//        System.out.println(pathTotheCurrentProject);

        String absolutePathDynamic = System.getProperty("user.dir") + "/src/test/java/march3/chat.txt";

        System.out.println(absolutePathDynamic);
        //C:\Users\\username\IdeaProjects\test-maven/src/test/java/march3/chat.txt

        driver.findElement(By.id("file-upload")).sendKeys(absolutePathDynamic);

        driver.findElement(By.id("file-submit")).click();



    }
}
