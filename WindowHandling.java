package testing;

import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Window.html");
        String oldWindow = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement FirstButton = driver.findElement(By.id("home"));
        FirstButton.click();
        Set<String> handles = driver.getWindowHandles();

        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);
        }
        WebElement EditButton = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
        EditButton.click();
        driver.close();

        driver.switchTo().window(oldWindow);
        WebElement SecondButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        SecondButton.click();

        int NumberofWindows = driver.getWindowHandles().size();
        System.out.println("No. of windows opened: " + NumberofWindows);

        WebElement DoNotCloseMe = driver.findElement(By.xpath("//button[@onclick='openWindows();']"));
        DoNotCloseMe.click();

        Set<String> newWindowHandles = driver.getWindowHandles();
        for (String allWindows : newWindowHandles) {
            if (!allWindows.equals(oldWindow)) {
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }

    }
}

