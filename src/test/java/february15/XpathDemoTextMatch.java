package february15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathDemoTextMatch {


    @Test
    public void warmUP() {




        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");


        // full text match
        //p[.='Software Automation became the most important and integral part of any app or software. ']

        //partial text match
        //p[  contains( text(), 'Software Automation became')  ]


        System.out.println( driver.findElement(By.xpath("//p[.='Software Automation became the most important and integral part of any app or software. ']")).getText());
        System.out.println( driver.findElement(By.xpath("//p[  contains( text(), 'Software Automation became')  ]")).getText());





        

    }
}
