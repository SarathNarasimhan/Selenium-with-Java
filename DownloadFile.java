package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFile {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/download.html");

        Thread.sleep(3000);
        WebElement DownloadLink = driver.findElement(By.linkText("Download Excel"));
        DownloadLink.click();

        File FileLocation = new File("D://Users//sarath//Downloads");
        File[] TotalFiles = FileLocation.listFiles();

        for (File file: TotalFiles) {
            file.getName().equals("Download Excel");
            System.out.println("File is Downloaded");
            break;
        }
            
    }

}
