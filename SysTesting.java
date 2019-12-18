package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SysTesting {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.syscloud.com/");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        WebElement WebElement1 = driver.findElement(By.xpath("//a[@class='buton-tile']"));
        WebElement1.click();
        driver.findElement(By.xpath("//input[@name='ctl00$LoginMainBody$txtEmail']")).sendKeys("adminalertadminGrc9ybjx");
        driver.findElement(By.xpath("//input[@name='ctl00$LoginMainBody$txtPassword']")).sendKeys("asdff");
        WebElement WebElement2 = driver.findElement(By.id("LoginMainBody_btnLogin"));
        WebElement2.click();
        WebElement WebElement3 = driver.findElement(By.xpath("//i[@class='material-icons']"));
        WebElement3.click();
        WebElement WebElement4 = driver.findElement(By.xpath("//a[@href='policycenter.aspx?type=dlp']"));
        WebElement4.click();
        WebElement WebElement5 = driver.findElement(By.xpath("//md-item-content[@aria-label='Student Safety']"));
        WebElement5.click();

        WebElement WebElement6 = driver.findElement(By.xpath("//button[@ng-click='vm.selectPolicy(policy)']"));
        WebElement6.click();
        WebElement WebElement7 = driver.findElement(By.xpath("//button[@class='md-primary md-raised md-button ng-scope md-ink-ripple']"));
        WebElement7.click();
        WebElement WebElement8 = driver.findElement(By.xpath("//a[@class='user-items user-items-0']"));
        WebElement8.click();
        WebElement WebElement9 = driver.findElement(By.xpath("//label[@for='sys-user-child3744180140216583512_undefined']"));
        WebElement9.click();
        WebElement WebElement10 = driver.findElement(By.xpath("//label[@for='sys-user-child3744180140216583779_undefined']"));
        WebElement10.click();
        WebElement WebElement11 = driver.findElement(By.xpath("//label[@for='sys-user-child3744180140216583304_undefined']"));
        WebElement11.click();
        WebElement WebElement12 = driver.findElement(By.xpath("//button[@ng-if='vm.steppers.isNextVisible()']"));
        WebElement12.click();
        WebElement Next_Button = driver.findElement(By.xpath("//button[@ng-click='vm.steppers.next()']"));
        Next_Button.click();
        



    }
}
