package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        WebElement ConfirmButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        ConfirmButton.click();
        Alert ConfirmAlert = driver.switchTo().alert();
        ConfirmAlert.dismiss();
        Thread.sleep(5000);
        WebElement PromptButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
        PromptButton.click();
        Alert PromptAlert = driver.switchTo().alert();
        PromptAlert.sendKeys("Syscloud");
        PromptAlert.accept();
        WebElement SweetBox = driver.findElement(By.xpath("//*[@id='btn']"));
        Alert SweetBoxAlert = driver.switchTo().alert();
        SweetBoxAlert.accept();



    }
}
