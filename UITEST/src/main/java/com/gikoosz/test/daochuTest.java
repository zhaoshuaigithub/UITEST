package com.gikoosz.test;

import com.gikoosz.util.Config;
import com.gikoosz.util.SeleniumApi;
import com.gikoosz.util.WenjianBidui;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;

public class daochuTest {

    public  static  void main(String[] args) throws InterruptedException {
        test();
    }
    public static void test() throws InterruptedException {
        JavascriptExecutor js;
        String userName= Config.getUrlProperty("userName"); //正确的用户名
        String passWord=Config.getUrlProperty("passWord"); //正确的密码
        String url = Config.getUrlProperty("url");
        Logger log = LogManager.getLogger(daochuTest.class);
        DOMConfigurator.configure(getPath()+"/Config/log4j.xml");
        System.out.println("======");
        WebDriver driver = SeleniumApi.Driver(url,"chromedriver","打开浏览器"); //geckodriver
        Thread.sleep(500);
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input","输入用户名",1),userName);
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input","输入密码",1),passWord);
        SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        System.out.println("***********end***************");
     //   driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement element2=driver.findElement(By.linkText("首页"));//获取登录后首页信息
        System.out.println("***********element2***************");
        String value5=element2.getText();
        // String value6=element2.getTagName();
        System.out.println("value5是什么"+value5);
        if("首页".equals(value5)){
            System.out.println("正确的用户和正确密码登录用例成功");
        }
        else{
            System.out.println("正确的用户和正确密码登录用例失败！");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[1]/div[2]/div[2]/div[1]/a")).click();
        WebElement element3 = driver.findElement(By.linkText("空气质量在线监测系统"));
        element3.click();
        log.info("我进入空气质量在线监测系统！");
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,0)");
      //  driver.findElement(By.xpath("//*[@id=\"monitor-warning\"]/div/header/nav[2]/div/div[1]/a")).click();
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.linkText("历史数据查询")).click();
        log.info("历史数据查询页面！");
        Thread.sleep(1500);
       // driver.findElement(By.cssSelector(".concentration-index:nth-child(3) .btn:nth-child(3)")).click();//导出操作
        driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();//导出操作
        log.info("我点击了导出操作！");
        boolean fanhuizhi =  WenjianBidui.wenjianBidui("C:/Users/Administrator/Downloads","空气质量历史数据查询"+new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        log.info("我的返回值是"+fanhuizhi);

    }
    public static String getPath() {
        String configPath = "" + Config.class.getResource("/");
        configPath = configPath.replace("file:/", "").replace("/target/classes/", "").replace("/bin", "");
        return configPath;
    }
}
