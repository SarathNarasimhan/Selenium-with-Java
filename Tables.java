package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tables {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/table.html");

        List<WebElement> Columns = driver.findElements(By.tagName("th"));
        int columncount = Columns.size();
        System.out.println("The no. of columns is "+ columncount);

        List<WebElement> Rows= driver.findElements(By.tagName("tr"));
        int rowcount = Rows.size();
        System.out.println("The no. of rows is "+ rowcount);

        WebElement GetPercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        String Percentage = GetPercent.getText();
        System.out.println("The Percentage is "+Percentage);

        List<WebElement> Progress = driver.findElements(By.xpath("//td[2]"));
        List<Integer> numberlist = new ArrayList<Integer>();

        for (WebElement webElement: Progress){
            String individualvalue=webElement.getText().replace("%", "");
            numberlist.add(Integer.parseInt(individualvalue));
        }
        System.out.println("Final List"+numberlist);

        int smallvalue = Collections.min(numberlist);
        System.out.println("The smallest value is "+smallvalue);
        String SmallValueString=Integer.toString(smallvalue)+"%";
        Thread.sleep(2000);
        String FinalXpath = ("//td[normalize-space()="+"\""+ SmallValueString + "\""+"]"+"//following::td[1]");

        System.out.println(FinalXpath);

        WebElement Checkbox = driver.findElement(By.xpath("//td[normalize-space()="+"\""+ SmallValueString + "\""+"]"+"//following::td[1]"));
        Checkbox.click();

    }

}
