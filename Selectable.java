package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selectable {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/selectable.html");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        List<WebElement> Selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
        int listsize = Selectable.size();
        System.out.println(listsize);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).
                click(Selectable.get(0)).
                click(Selectable.get(1)).
                click(Selectable.get(2)).
                click(Selectable.get(3)).build().perform();

    }
}
