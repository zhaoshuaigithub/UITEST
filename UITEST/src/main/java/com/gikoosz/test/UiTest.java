package com.gikoosz.test;

import com.gikoosz.util.Config;
import com.gikoosz.util.SeleniumApi;
import org.apache.log4j.LogManager;
import org.openqa.selenium.*;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;


public class UiTest {

    public  static  void main(String[] args) throws InterruptedException {
        zonghemh(); //综合门户测试用例
        DaqiZonghe daqiZonghe = new DaqiZonghe();
        daqiZonghe.DaqiZonghe();//大气综合测试用例
     }
    public static void zonghemh() throws InterruptedException {
        final  String ceshiyongli ="【测试用例】";
        JavascriptExecutor js;
        String userName=Config.getUrlProperty("userName"); //正确的用户名
        String passWord=Config.getUrlProperty("passWord"); //正确的密码
        String userNameNo=Config.getUrlProperty("userNameNo"); //不存在的用户名
        String passWordNo=Config.getUrlProperty("passWordNo"); //不存在的密码
        String url = Config.getUrlProperty("url");
        Logger log = LogManager.getLogger(UiTest.class);
        DOMConfigurator.configure(getPath()+"/Config/log4j.xml");
        System.out.println("======");
        WebDriver driver = SeleniumApi.Driver(url,"chromedriver","打开浏览器"); //geckodriver
      //  WebDriver driver = SeleniumApi.Driver(url,"geckodriver","打开浏览器"); //火狐浏览器

        Thread.sleep(1000);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        //账号登录测试
        //1.输入用户名不输入密码的用例
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input","输入用户名",1),userName);
        SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        String Value1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/p")).getText();
        System.out.println("输出Value1"+Value1);
        if("密码不能为空".equals(Value1)){
            log.info(ceshiyongli+"输入用户名不输入密码测试用例操作成功");

        }
        else {
            log.info(ceshiyongli+"输入用户名不输入密码测试用例失败");
        }
        Thread.sleep(1000);
        //2.不输入任何信息的用例
        driver.navigate().refresh();
        SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        String Value2 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/p")).getText();
        if("用户名不能为空".equals(Value2)){
            log.info(ceshiyongli+"用户名和密码都不输入的用例操作成功");

        }
        else {
            log.info(ceshiyongli+"用户名和密码都不输入的用例操作失败");
        }
        //3.输入不存在的用户
        Thread.sleep(500);
        driver.navigate().refresh();
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input","输入用户名",1),userNameNo);
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input","输入密码",1),passWord);
        SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        Thread.sleep(500);
      //  String Value3 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/p")).getText();
      //  String Value3 = driver.findElement(By.cssSelector(".warning")).getText();
        WebElement element1 = driver.findElement(By.cssSelector(".warning"));
        String Value3=element1.getText();
                if("账号或密码不正确".equals(Value3)){
            log.info(ceshiyongli+"输入不存在的用户用例操作成功");

        }
        else {
            log.info(ceshiyongli+"输入不存在的用户用例操作失败");
        }

        driver.navigate().refresh();
        Thread.sleep(1000);
        //4.输入错误的密码
        driver.navigate().refresh();
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input","输入用户名",1),userName);
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input","输入密码",1),passWordNo);
        SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        Thread.sleep(1000);
        String Value4 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/p")).getText();
        if("账号或密码不正确".equals(Value4)){
            log.info(ceshiyongli+"输入错误的密码用例操作成功");

        }
        else {
            log.info(ceshiyongli+"输入错误的密码用例操作失败");
        }
        driver.navigate().refresh();
        Thread.sleep(1000);
        //5.正确的用户密码登录用例
        System.out.println("***********start***************");
     //   SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"","输入用户名",1),userName);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input")).sendKeys(userName);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input")).sendKeys(passWord);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/a")).click();
     //   SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver,"/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input","输入密码",1),passWord);
    //    SeleniumApi.click(SeleniumApi.findByXpath(driver,("/html/body/div/div/div/div[2]/div/div[2]/a"),"点击登录",1));
        System.out.println("***********end***************");
     //   driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement element2=driver.findElement(By.linkText("首页"));//获取登录后首页信息
        System.out.println("***********element2***************");
        String value5=element2.getText();
       // String value6=element2.getTagName();
        System.out.println("value5是什么"+value5);
      //  System.out.println("value6是什么"+value6);
        if("首页".equals(value5)){
            System.out.println(ceshiyongli+"正确的用户和正确密码登录用例成功");
        }
        else{
            System.out.println(ceshiyongli+"正确的用户和正确密码登录用例失败！");
        }
        WebElement element3= driver.findElement(By.cssSelector(".sub-item:nth-child(1) .sub-item-title"));
        String value6=element3.getText();
        if (value6.contains("空气质量")){
            log.info(ceshiyongli+"首页空气质量加载成功！");
        }
        else{
            log.info(ceshiyongli+"首页空气质量加载有问题！");
        }
        WebElement element4= driver.findElement(By.cssSelector(".sub-item:nth-child(3) .sub-item-title"));
        String value7=element4.getText();
        if (value7.contains("连云港市空气质量达标趋势月度分析")){
            log.info(ceshiyongli+"首页空气质量达标趋势月度分析加载成功！");
        }
        else{
            log.info(ceshiyongli+"首页空气质量达标趋势月度分析加载有问题！");
        }
     //   driver.findElement(By.cssSelector(".line-charts canvas"));
     //  log.info("月度达标月度分析点击成功");
    //    driver.findElement(By.cssSelector(".line-charts canvas"));
   //     log.info("月度达标月度分析点击成功");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".slider-btn-right > .iconfont")).click();
        log.info(ceshiyongli+"轮播图切换测试用例编写成功！");
        Thread.sleep(1000);
        WebElement element5= driver.findElement(By.cssSelector(".sub-item:nth-child(1) .sub-item-title"));
        String value8=element5.getText();
        if (value8.contains("水环境质量达标率")){
            log.info(ceshiyongli+"首页水环境质量达标率加载成功！");
        }
        else{
            log.info(ceshiyongli+"首页水环境质量达标率加载有问题！");
        }
        WebElement element6= driver.findElement(By.cssSelector(".sub-item:nth-child(2) .sub-item-title"));
        String value9=element6.getText();
        if (value9.contains("空气质量考核完成情况")){
            log.info(ceshiyongli+"空气质量考核完成情况加载成功！");
        }
        else{
            log.info(ceshiyongli+"空气质量考核完成情况加载有问题！");
        }
        WebElement element7= driver.findElement(By.cssSelector(".sub-item:nth-child(3) .sub-item-title"));
        String value10=element7.getText();
        if (value10.contains("连云港市考核断面水质达标率变化")){
            log.info(ceshiyongli+"连云港市考核断面水质达标率变化加载成功！");
        }
        else{
            log.info(ceshiyongli+"连云港市考核断面水质达标率变化加载有问题！");
        }
        driver.findElement(By.cssSelector(".selected-item")).click();
        boolean clickAble =true;
        WebElement element8= driver.findElement(By.linkText("省考断面"));
        try {
            element8.click();
            log.info(ceshiyongli+"省考断面点击事件正常");
            clickAble =true;
        }catch(Exception var6){
            clickAble=false;
            log.info(ceshiyongli+"省考断面点击事件出问题");
        }
        WebElement element9= driver.findElement(By.linkText("饮用水源"));
        try {
            element9.click();
            log.info(ceshiyongli+"饮用水源点击事件正常");
            clickAble =true;
        }catch(Exception var6){
            clickAble=false;
            log.info(ceshiyongli+"饮用水源点击事件出问题");
        }
        //跳转业务场景子系统业务用例
        driver.findElement(By.cssSelector(".app-item:nth-child(1) .app-name")).click(); //点击大气环境综合平台
        js.executeScript("window.scrollTo(0,0)");
        WebElement element10= driver.findElement(By.linkText("空气质量在线监测系统"));
        String value11=element10.getText();
        if (value11.contains("空气质量在线监测系统")){
            log.info(ceshiyongli+"大气环境综合平台跳转测试用例执行成功！");
        }
        else
        {
            log.info(ceshiyongli+"大气环境综合平台跳转测试用例执行失败！");
        }
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.cssSelector(".sys-name")).click();//返回首页
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-item:nth-child(3) .app-name")).click(); //点击水环境综合平台
    //    {
    //        WebElement element = driver.findElement(By.cssSelector(".slider-btn-left > .iconfont"));
    //        Actions builder = new Actions(driver);
    //        builder.moveToElement(element).perform();
    //    }
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(1000);
        driver.findElement(By.linkText("环境水监测系统")).click();
        WebElement element11= driver.findElement(By.linkText("环境水监测系统"));
        String value12=element11.getText();
        if (value12.contains("环境水监测系统")){
            log.info(ceshiyongli+"水环境综合平台点击执行成功！");
        }
        else
        {
            log.info(ceshiyongli+"水环境综合平台点击执行失败！");
        }
        driver.findElement(By.cssSelector(".sys-name")).click();//返回首页
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-item:nth-child(4) .app-name")).click();//点击污染源综合系统
        WebElement element12= driver.findElement(By.xpath("/html/body/div/header/nav[1]/div/a/span"));
        String value13=element12.getText();
        if (value13.contains("污染源综合管理系统")){
            log.info(ceshiyongli+"污染源综合管理系统点击执行成功！");
        }
        else
        {
            log.info(ceshiyongli+"污染源综合管理系统点击执行失败！");
        }


    }
    public static String getPath() {
        String configPath = "" + Config.class.getResource("/");
        configPath = configPath.replace("file:/", "").replace("/target/classes/", "").replace("/bin", "");
        return configPath;
    }
}
