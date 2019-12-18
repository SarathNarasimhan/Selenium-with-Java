package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoComplete {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/autoComplete.html");
        WebElement Input = driver.findElement(By.id("tags"));
        Input.sendKeys("S");
        Thread.sleep(4000);
        List<WebElement> OptionsList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

        for (WebElement webElement : OptionsList) {
            if (webElement.getText().equals("Web Services")) {
                webElement.click();
                break;
            }
        }

    }

}


