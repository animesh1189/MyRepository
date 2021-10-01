package common;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Selenium_Practice {

    //public static void main(String[] args) throws Exception {
    @Test
    public void x() throws Exception {
        // browser type and chromedrover.exe path as parameters
        System.setProperty("webdriver.chrome.driver", "src//main//resources//Drivers//chromedriver_new.exe");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver=new Chromedriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='xtXmba']"));
        for (WebElement wb : list) {
            System.out.println("the options are " + wb.getText());
            String mob = "Mobiles";
            if (wb.getText().equals(mob)) {
                System.out.println("Mobiles is present");
                driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
            }
        }

        driver.findElement(By.name("q")).sendKeys("Redmi");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    /*@Test
    public void y() throws Exception {
        // browser type and chromedrover.exe path as parameters
        System.setProperty("webdriver.chrome.driver", "src//main//resources//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver=new Chromedriver();
        driver.get("https://www.airtel.in");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        String MainWindow = driver.getWindowHandle();
// To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        //String MainWindow=null;
        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                break;
            }
            WebElement dismiss=driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-block']"));
            dismiss.click();
            driver.switchTo().defaultContent();
        }
    }*/
}

