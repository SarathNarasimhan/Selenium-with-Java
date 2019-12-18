package testing;

import cucumber.api.java.eo.Se;
import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        WebElement Drop1 = driver.findElement(By.id("dropdown1"));
        Select select=new Select(Drop1);
        select.selectByIndex(4);
        select.selectByValue("2");
        select.selectByVisibleText("Loadrunner");
        List<WebElement> ListofOptions = select.getOptions();
        int size = ListofOptions.size();
        System.out.println("Number of Elements: "+ size);
        Drop1.sendKeys("UFT");
        WebElement MultiSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
        Select MultiSelectBox = new Select(MultiSelect);
        MultiSelectBox.selectByIndex(1);
        MultiSelectBox.selectByIndex(2);
        MultiSelectBox.selectByIndex(3);
        MultiSelectBox.selectByIndex(4);




    }
}
