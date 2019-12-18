package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.findElement(By.xpath("//a[@data-cli_action=\"accept\"]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Sys");
        driver.findElement(By.id("lastname")).sendKeys("Cloud");
        WebElement radioBtn = driver.findElement(By.id("sex-0"));
        radioBtn.click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement close = driver.findElement(By.xpath("//img[@alt='close-link']"));
        wait.until(ExpectedConditions.elementToBeClickable(close)).click();
        Thread.sleep(3000);
        WebElement radioBtn1 = driver.findElement(By.xpath("//input[@id='exp-3']"));
        wait.until(ExpectedConditions.elementToBeClickable(radioBtn1)).click();
    }
}
