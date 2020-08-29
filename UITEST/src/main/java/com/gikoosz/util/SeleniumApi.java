package com.gikoosz.util;
import com.gikoosz.util.Config;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumApi {

    public static WebDriver Driver(String url, String drivername, String business){
        Logger log = LogManager.getLogger(SeleniumApi.class);
        Object driver =null;
        DOMConfigurator.configure(getPath()+"/Config/log4j.xml");


        if(drivername.startsWith("chromedriver")){
            System.setProperty("webdriver.chrome.driver","F:/UITEST/Driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(drivername.startsWith("geckodriver")){
            System.setProperty("webdriver.gecko.driver","F:/UITEST/Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        try{
            ((WebDriver) driver).get(url);
            return (WebDriver)driver;
        }catch (Exception var6){
            log.error(business+"=====操作失败==="+var6);
            errorScreenshot((WebDriver) driver,getPath()+"/errorPictrue/",".jpg",business);
            return null;
        }

    }
    public  static WebElement findByXpath(WebDriver driver,String key,String business,int time){
        Logger log = LogManager.getLogger(SeleniumApi.class);
        DOMConfigurator.configure(getPath()+"/Config/log4j.xml");
        try {
            if(time!=0){
                TimeUnit.SECONDS.sleep((long)time);
            }
            WebElement e = driver.findElement(By.xpath(key));
            if(!"".equals(business)){
                log.info(business+":操作完成");
            }
            return e;

        }catch (Exception var6){
            log.error(business+"=====操作失败==="+var6);
            errorScreenshot((WebDriver) driver,getPath()+"/errorPictrue/",".jpg",business);
            return null;
        }
    }
    public static void errorScreenshot(WebDriver driver, String path, String pictureFormat, String business) {
        String systemTime = getCurrentSystemTime();
        String pictureName= business+"("+systemTime+")"+pictureFormat;
        File jpg = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(jpg,new File(path+pictureName));
        }catch (Exception var8){

        }
    }
    public static void sendKeys(WebElement webElement,String content){
        if(webElement !=null){
            webElement.clear();
            webElement.sendKeys(new CharSequence[] {content});
        }
    }
    public static  void click(WebElement webElement){
        if(webElement!=null){
            webElement.click();
        }
    }

//    public static String getPath() {
//        String configPath = ""+Config.class.getResource("/");
//        configPath=configPath.replace("file:/","").replace("/target/classes/","").replace("/bin","");
//        return configPath;
//    }
    public static String getPath() {
        String configPath = "" + Config.class.getResource("/");
        configPath = configPath.replace("file:/", "").replace("/target/classes/", "").replace("/bin", "");
        return configPath;
    }
    public static  String  getCurrentSystemTime(){
        Date now = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String time = dataFormat.format(now);
        return time;
    }
}
