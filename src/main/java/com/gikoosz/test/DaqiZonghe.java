package com.gikoosz.test;
import com.gikoosz.util.Config;
import com.gikoosz.util.SeleniumApi;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DaqiZonghe {
    public void DaqiZonghe() throws InterruptedException {
        JavascriptExecutor js;
        String userName = Config.getUrlProperty("userName"); //正确的用户名
        String passWord = Config.getUrlProperty("passWord"); //正确的密码
        String daqiTitle = Config.getUrlProperty("daqiTitle");
        final String ceshiyongli = "【测试用例】";
        final String guokong = "[国控站点]";
        final String shengkong = "[省站点]";
        final String shikong = "[市控站点]";
        final String gangkou = "[港口空气站]";
        final String TVOCzd = "[TVOC站点]";
        String url = Config.getUrlProperty("url");
        Logger log = LogManager.getLogger(DaqiZonghe.class);
        DOMConfigurator.configure(getPath() + "/Config/log4j.xml");
        System.out.println("======");
        WebDriver driver = SeleniumApi.Driver(url, "chromedriver", "打开浏览器"); //geckodriver
        Thread.sleep(500);
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver, "/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[1]/div/div/input", "输入用户名", 1), userName);
        SeleniumApi.sendKeys(SeleniumApi.findByXpath(driver, "/html/body/div/div/div/div[2]/div/div[2]/ul/form/li[2]/div/div/input", "输入密码", 1), passWord);
        SeleniumApi.click(SeleniumApi.findByXpath(driver, ("/html/body/div/div/div/div[2]/div/div[2]/a"), "点击登录", 1));
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.linkText("首页"));//获取登录后首页信息
        System.out.println("***********element2***************");
        String value5 = element2.getText();
        // String value6=element2.getTagName();
        System.out.println("value5是什么" + value5);
        if ("首页".equals(value5)) {
            System.out.println("正确的用户和正确密码登录用例成功");

        } else {
            System.out.println("正确的用户和正确密码登录用例失败！");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[1]/div[2]/div[2]/div[1]/a/h3")).click();//点击大气环境综合系统
        js.executeScript("window.scrollTo(0,0)");
        WebElement element3 = driver.findElement(By.xpath("/html/body/div/div/header/nav/div/a/span"));
        String value6 = element3.getText();
        System.out.println("value6的值：" + value6);
        if ("大气环境综合监管平台".equals(value6)) {
            System.out.println("系统跳转到大气环境综合平台用例成功");
            log.info(ceshiyongli + "大气环境综合平台跳转测试用例执行成功！");
        } else if (daqiTitle.equals(value6)) {
            System.out.println("系统跳转到大气环境综合平台用例成功");
            log.info(ceshiyongli + "大气环境综合平台跳转测试用例执行成功！");
        } else {
            System.out.println("系统跳转到大气环境综合平台用例失败");
            log.info(ceshiyongli + "大气环境综合平台跳转测试用例执行失败！");
        }

        Thread.sleep(1000);

        WebDriver webDriver88 = (WebDriver) driver.findElement(By.xpath("/html/body/div/div"));

        log.info(""+webDriver88.getTitle());
        Kqzljc_shouye kqzljc_shouye = new Kqzljc_shouye(webDriver88);
        kqzljc_shouye.kqzljc_shouye();
    }

    public static String getPath() {
        String configPath = "" + Config.class.getResource("/");
        configPath = configPath.replace("file:/", "").replace("/target/classes/", "").replace("/bin", "");
        return configPath;
    }
}