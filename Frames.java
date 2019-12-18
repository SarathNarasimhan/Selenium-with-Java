package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/frame.html");
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        WebElement InsideFrame = driver.findElement(By.xpath("//*[@id='Click']"));
        InsideFrame.click();

        String Text = driver.findElement(By.xpath("//*[@id='Click']")).getText();
        System.out.println("The Text is: "+ Text );

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement NestedFrame = driver.findElement(By.xpath("//*[@id='Click1']"));
        NestedFrame.click();

        driver.switchTo().defaultContent();
        List<WebElement> Total_Frames = driver.findElements(By.tagName("iFrame"));
        int Size = Total_Frames.size();
        System.out.println("The Total Number of Frames is: "+ Size );


    }
}
