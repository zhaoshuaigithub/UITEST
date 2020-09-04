package com.gikoosz.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
    public static void main(String[] args) throws InterruptedException {
        untitled();
    }

    public static void untitled() throws InterruptedException {
    //    JavascriptExecutor js;
       System.setProperty("webdriver.gecko.driver","F:/UITEST/Driver/geckodriver.exe");
     //   System.setProperty("webdriver.chrome.driver","F:/UITEST/Driver/chromedriver.exe");
     //   WebDriver  driver = new FirefoxDriver();
    //    js = (JavascriptExecutor) driver;
     //   Map vars = new HashMap<String, Object>();
     //   driver.get("https://www.bilibili.com/video/BV1tz4y1f7ds/");
      //  driver.manage().window().setSize(new Dimension(1936, 1056));
      /*  for (int i=0;i<100;i++) {
            Thread.sleep(1000);
         //   WebDriver  driver = new FirefoxDriver();
            WebDriver driver = new ChromeDriver();
            Thread.sleep(1000);
           // driver.get("https://www.bilibili.com/video/BV1tz4y1f7ds/");
            driver.get("https://www.bilibili.com/video/BV1FV411m7Mm/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".bilibili-player-iconfont-start path")).click();
            // Thread.sleep(1500);
            // driver.findElement(By.cssSelector(".bilibili-player-iconfont-pause path")).click();
            Thread.sleep(2000);
           // driver.findElement(By.cssSelector(".bilibili-player-iconfont-pause path")).click();
           // Thread.sleep(1000);
            driver.navigate().refresh();
          //  driver.quit();
            if(i>40){
                driver.quit();
            }
            System.out.println("我是第"+i+"运行");
        }
        */
        for (int i=0;i<100;i++){
           // Thread.sleep(1000);
            WebDriver driver = new FirefoxDriver();
           // JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(1000);
            driver.get("https://www.bilibili.com/video/BV1FV411m7Mm/");
           // driver.get("https://www.bilibili.com/video/BV1tz4y1f7ds/");
            Thread.sleep(1000);
            driver.manage().window().setSize(new Dimension(1936, 1056));
            driver.findElement(By.cssSelector(".bilibili-player-iconfont-start path")).click();
            Thread.sleep(2000);
        //    driver.findElement(By.cssSelector(".bilibili-player-iconfont-pause path")).click();
            driver.close();
            System.out.println("第"+i+"运行");
        }

    }
}