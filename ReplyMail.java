package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ReplyMail {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com/");
        Thread.sleep(100);
        driver.findElement(By.id("identifierId")).sendKeys("kumarsarath18@gmail.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sarathsgmail7777");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();


    }

}

