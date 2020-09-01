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
        final String ceshiyongli  = "【测试用例】";
        final String guokong="[国控站点]";
        final String shengkong="[省站点]";
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
        WebElement element3 = driver.findElement(By.xpath("/html/body/div/div/header/nav/div/a/span"));
        String value6 = element3.getText();
        System.out.println("value6的值：" + value6);
        if ("大气环境综合监管平台".equals(value6)) {
            System.out.println("系统跳转到大气环境综合平台用例成功");
            log.info(ceshiyongli  + "大气环境综合平台跳转测试用例执行成功！");
        } else if (daqiTitle.equals(value6)) {
            System.out.println("系统跳转到大气环境综合平台用例成功");
            log.info(ceshiyongli  + "大气环境综合平台跳转测试用例执行成功！");
        } else {
            System.out.println("系统跳转到大气环境综合平台用例失败");
            log.info(ceshiyongli  + "大气环境综合平台跳转测试用例执行失败！");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();//点击空气质量站点下拉框
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[1]/label/span[1]/span")).click();
        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[1]/label/span[2]"));
        String value7 = webElement4.getText();
        if ("国控站点".equals(value7)) {
            System.out.println("输出value7:" + value7);

        } else {
            System.out.println("输出的值不正确");
        }

        Thread.sleep(1000);
        WebElement webElement5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
        if (webElement5 == null) {
            log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElement5.click();
            WebElement webElement6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElement7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElement6 != null || webElement7 != null) {
                log.info(ceshiyongli + guokong + "AQI" + "连云港筛选结果满足");
            } else {
                log.info(ceshiyongli + guokong + "AQI" + "连云港筛选结果失败");
            }
        }

        Thread.sleep(1000);
        WebElement webElement8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
        if (webElement8 == null) {
            log.info(ceshiyongli + guokong + "AQI" + "连云区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElement8.click();
            WebElement webElement9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElement10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElement9 != null || webElement10 != null) {
                log.info(ceshiyongli + guokong + "AQI" + "连云区筛选结果满足");
            } else {
                log.info(ceshiyongli + guokong + "AQI" + "连云区筛选结果失败");
            }
        }

        Thread.sleep(1000);
        WebElement webElement11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
        if (webElement11 == null) {
            log.info(ceshiyongli + guokong + "AQI" + "新浦区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElement11.click();
            //WebElement   webElement12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElement13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElement13 != null) {
                log.info(ceshiyongli + guokong + "AQI" + "新浦区筛选结果满足");
            } else {
                log.info(ceshiyongli + guokong + "AQI" + "新浦区筛选结果失败");
            }
        }
            Thread.sleep(1000);
            WebElement webElement14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElement14 == null) {
                log.info(ceshiyongli + guokong + "AQI" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElement14.click();
                //    WebElement   webElement15 = ; //代码保留
                WebElement webElement16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElement16 != null) {
                    log.info(ceshiyongli + guokong + "AQI" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "AQI" + "海州区筛选结果失败");
                }
            }

                //
                Thread.sleep(1000);
                WebElement webElement17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElement17 == null) {
                    log.info(ceshiyongli + guokong + "AQI" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElement17.click();
                    //  WebElement webElement18 ="";
                    WebElement webElement19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElement19 != null) {
                        log.info(ceshiyongli + guokong + "AQI" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + guokong + "AQI" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElement20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElement20 == null) {
                    log.info(ceshiyongli + guokong + "AQI" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElement20.click();
                    WebElement webElement21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElement22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElement21 != null || webElement22 != null) {
                        log.info(ceshiyongli + guokong + "AQI" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + guokong + "AQI" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElement23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElement23 == null) {
                    log.info(ceshiyongli + guokong + "AQI" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElement23.click();
                    //  WebElement webElement24 =;//保留代码
                    WebElement webElement25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElement25 != null) {
                        log.info(ceshiyongli + guokong + "AQI" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + guokong + "AQI" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElement26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElement26 == null) {
                    log.info(ceshiyongli + guokong + "AQI" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElement26.click();
                    //  WebElement webElement27 =;//保留代码
                    WebElement webElement28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElement28 != null) {
                        log.info(ceshiyongli + guokong + "AQI" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + guokong + "AQI" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElement29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElement29 == null) {
                    log.info(ceshiyongli + guokong + "AQI" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElement29.click();
                    //  WebElement webElement27 =;//保留代码
                    WebElement webElement30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElement30 != null) {
                        log.info(ceshiyongli + guokong + "AQI" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + guokong + "AQI" + "连云港经济技术开发区筛选结果失败");
                    }
                }
        Thread.sleep(1000);
        WebElement webElementPMII = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[2]/a"));
        if(webElementPMII==null){
            log.info(ceshiyongli + guokong + "PM2.5" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "PM2.5" + "点击页签成功");
            Thread.sleep(1000);
            webElementPMII.click();
            Thread.sleep(500);
            WebElement webElementPMII5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementPMII5 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII5.click();
                Thread.sleep(500);
                WebElement webElementPMII6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMII7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII6 != null || webElementPMII7 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMII8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementPMII8 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII8.click();
                WebElement webElementPMII9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMII10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII9 != null || webElementPMII10 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMII11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementPMII11 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII11.click();
                //WebElement   webElementPMII12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMII13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII13 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMII14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementPMII14 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII14.click();
                //    WebElement   webElementPMII15 = ; //代码保留
                WebElement webElementPMII16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII16 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementPMII17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementPMII17 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII17.click();
                //  WebElement webElementPMII18 ="";
                WebElement webElementPMII19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII19 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMII20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementPMII20 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII20.click();
                WebElement webElementPMII21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMII22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII21 != null || webElementPMII22 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementPMII23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementPMII23 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII23.click();
                //  WebElement webElementPMII24 =;//保留代码
                WebElement webElementPMII25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII25 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMII26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementPMII26 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII26.click();
                //  WebElement webElementPMII27 =;//保留代码
                WebElement webElementPMII28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII28 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMII29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementPMII29 == null) {
                log.info(ceshiyongli + guokong + "PM2.5" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMII29.click();
                //  WebElement webElementPMII27 =;//保留代码
                WebElement webElementPMII30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMII30 != null) {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM2.5" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementPMIO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[3]/a"));
        if(webElementPMIO==null){
            log.info(ceshiyongli + guokong + "PM10" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "PM10" + "点击页签成功");
            Thread.sleep(1000);
            webElementPMIO.click();
            Thread.sleep(500);
            WebElement webElementPMIO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementPMIO5 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO5.click();
                Thread.sleep(500);
                WebElement webElementPMIO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMIO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO6 != null || webElementPMIO7 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMIO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementPMIO8 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO8.click();
                WebElement webElementPMIO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMIO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO9 != null || webElementPMIO10 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMIO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementPMIO11 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO11.click();
                //WebElement   webElementPMIO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMIO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO13 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMIO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementPMIO14 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO14.click();
                //    WebElement   webElementPMIO15 = ; //代码保留
                WebElement webElementPMIO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO16 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementPMIO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementPMIO17 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO17.click();
                //  WebElement webElementPMIO18 ="";
                WebElement webElementPMIO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO19 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementPMIO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementPMIO20 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO20.click();
                WebElement webElementPMIO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementPMIO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO21 != null || webElementPMIO22 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementPMIO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementPMIO23 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO23.click();
                //  WebElement webElementPMIO24 =;//保留代码
                WebElement webElementPMIO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO25 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMIO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementPMIO26 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO26.click();
                //  WebElement webElementPMIO27 =;//保留代码
                WebElement webElementPMIO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO28 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementPMIO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementPMIO29 == null) {
                log.info(ceshiyongli + guokong + "PM10" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementPMIO29.click();
                //  WebElement webElementPMIO27 =;//保留代码
                WebElement webElementPMIO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementPMIO30 != null) {
                    log.info(ceshiyongli + guokong + "PM10" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "PM10" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[4]/a"));
        if(webElementSO2==null){
            log.info(ceshiyongli + guokong + "SO2" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "SO2" + "点击页签成功");
            Thread.sleep(1000);
            webElementSO2.click();
            Thread.sleep(500);
            WebElement webElementSO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSO25 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO25.click();
                Thread.sleep(1000);
                WebElement webElementSO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO26 != null || webElementSO27 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSO28 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO28.click();
                WebElement webElementSO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO29 != null || webElementSO210 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSO211 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO211.click();
                //WebElement   webElementSO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO213 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSO214 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO214.click();
                //    WebElement   webElementSO215 = ; //代码保留
                WebElement webElementSO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO216 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSO217 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO217.click();
                //  WebElement webElementSO218 ="";
                WebElement webElementSO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO219 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSO220 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO220.click();
                WebElement webElementSO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO221 != null || webElementSO222 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSO223 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO223.click();
                //  WebElement webElementSO224 =;//保留代码
                WebElement webElementSO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO225 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSO226 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO226.click();
                //  WebElement webElementSO227 =;//保留代码
                WebElement webElementSO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO228 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSO229 == null) {
                log.info(ceshiyongli + guokong + "SO2" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSO229.click();
                //  WebElement webElementSO227 =;//保留代码
                WebElement webElementSO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSO230 != null) {
                    log.info(ceshiyongli + guokong + "SO2" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "SO2" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementNO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[5]/a"));
        if(webElementNO2==null){
            log.info(ceshiyongli + guokong + "NO2" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "NO2" + "点击页签成功");
            Thread.sleep(1000);
            webElementNO2.click();
            Thread.sleep(500);
            WebElement webElementNO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementNO25 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO25.click();
                Thread.sleep(500);
                WebElement webElementNO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementNO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO26 != null || webElementNO27 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementNO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementNO28 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO28.click();
                WebElement webElementNO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementNO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO29 != null || webElementNO210 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementNO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementNO211 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO211.click();
                //WebElement   webElementNO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementNO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO213 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementNO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementNO214 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO214.click();
                //    WebElement   webElementNO215 = ; //代码保留
                WebElement webElementNO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO216 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementNO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementNO217 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO217.click();
                //  WebElement webElementNO218 ="";
                WebElement webElementNO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO219 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementNO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementNO220 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO220.click();
                WebElement webElementNO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementNO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO221 != null || webElementNO222 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementNO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementNO223 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO223.click();
                //  WebElement webElementNO224 =;//保留代码
                WebElement webElementNO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO225 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementNO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementNO226 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO226.click();
                //  WebElement webElementNO227 =;//保留代码
                WebElement webElementNO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO228 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementNO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementNO229 == null) {
                log.info(ceshiyongli + guokong + "NO2" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementNO229.click();
                //  WebElement webElementNO227 =;//保留代码
                WebElement webElementNO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementNO230 != null) {
                    log.info(ceshiyongli + guokong + "NO2" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "NO2" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementCO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[6]/a"));
        if(webElementCO==null){
            log.info(ceshiyongli + guokong + "CO" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "CO" + "点击页签成功");
            Thread.sleep(1000);
            webElementCO.click();
            Thread.sleep(500);
            WebElement webElementCO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementCO5 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO5.click();
                Thread.sleep(500);
                WebElement webElementCO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementCO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO6 != null || webElementCO7 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementCO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementCO8 == null) {
                log.info(ceshiyongli + guokong + "CO" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO8.click();
                WebElement webElementCO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementCO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO9 != null || webElementCO10 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementCO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementCO11 == null) {
                log.info(ceshiyongli + guokong + "CO" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO11.click();
                //WebElement   webElementCO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementCO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO13 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementCO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementCO14 == null) {
                log.info(ceshiyongli + guokong + "CO" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO14.click();
                //    WebElement   webElementCO15 = ; //代码保留
                WebElement webElementCO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO16 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementCO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementCO17 == null) {
                log.info(ceshiyongli + guokong + "CO" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO17.click();
                //  WebElement webElementCO18 ="";
                WebElement webElementCO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO19 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementCO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementCO20 == null) {
                log.info(ceshiyongli + guokong + "CO" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO20.click();
                WebElement webElementCO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementCO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO21 != null || webElementCO22 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementCO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementCO23 == null) {
                log.info(ceshiyongli + guokong + "CO" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO23.click();
                //  WebElement webElementCO24 =;//保留代码
                WebElement webElementCO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO25 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementCO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementCO26 == null) {
                log.info(ceshiyongli + guokong + "CO" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO26.click();
                //  WebElement webElementCO27 =;//保留代码
                WebElement webElementCO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO28 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementCO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementCO29 == null) {
                log.info(ceshiyongli + guokong + "CO" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementCO29.click();
                //  WebElement webElementCO27 =;//保留代码
                WebElement webElementCO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementCO30 != null) {
                    log.info(ceshiyongli + guokong + "CO" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "CO" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementO3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[7]/a"));
        if(webElementO3==null){
            log.info(ceshiyongli + guokong + "O3" + "点击页签失败");
        }else{
            log.info(ceshiyongli + guokong + "O3" + "点击页签成功");
            Thread.sleep(1000);
            webElementO3.click();
            Thread.sleep(500);
            WebElement webElementO35 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementO35 == null) {
                log.info(ceshiyongli + guokong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO35.click();
                Thread.sleep(500);
                WebElement webElementO36 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementO37 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO36 != null || webElementO37 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementO38 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementO38 == null) {
                log.info(ceshiyongli + guokong + "O3" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO38.click();
                WebElement webElementO39 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementO310 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO39 != null || webElementO310 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementO311 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementO311 == null) {
                log.info(ceshiyongli + guokong + "O3" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO311.click();
                //WebElement   webElementO312 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementO313 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO313 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementO314 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementO314 == null) {
                log.info(ceshiyongli + guokong + "O3" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO314.click();
                //    WebElement   webElementO315 = ; //代码保留
                WebElement webElementO316 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO316 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementO317 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementO317 == null) {
                log.info(ceshiyongli + guokong + "O3" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO317.click();
                //  WebElement webElementO318 ="";
                WebElement webElementO319 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO319 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementO320 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementO320 == null) {
                log.info(ceshiyongli + guokong + "O3" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO320.click();
                WebElement webElementO321 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementO322 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO321 != null || webElementO322 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementO323 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementO323 == null) {
                log.info(ceshiyongli + guokong + "O3" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO323.click();
                //  WebElement webElementO324 =;//保留代码
                WebElement webElementO325 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO325 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementO326 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementO326 == null) {
                log.info(ceshiyongli + guokong + "O3" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO326.click();
                //  WebElement webElementO327 =;//保留代码
                WebElement webElementO328 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO328 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementO329 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementO329 == null) {
                log.info(ceshiyongli + guokong + "O3" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementO329.click();
                //  WebElement webElementO327 =;//保留代码
                WebElement webElementO330 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementO330 != null) {
                    log.info(ceshiyongli + guokong + "O3" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + guokong + "O3" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[2]/label/span[1]/span")).click();
        WebElement webElementSk4 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[2]/label/span[2]"));
        String value8= webElementSk4.getText();
        if ("省控站点".equals(value8)) {
            System.out.println("输出value8:" + value8);

        } else {
            System.out.println("输出的值不正确");
        }

        Thread.sleep(1000);
        WebElement webElementSk5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
        if (webElementSk5 == null) {
            log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk5.click();
            WebElement webElementSk6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElementSk7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk6 != null || webElementSk7 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "连云港筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "连云港筛选结果失败");
            }
        }

        Thread.sleep(1000);
        WebElement webElementSk8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
        if (webElementSk8 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "连云区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk8.click();
            WebElement webElementSk9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElementSk10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk9 != null || webElementSk10 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "连云区筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "连云区筛选结果失败");
            }
        }

        Thread.sleep(1000);
        WebElement webElementSk11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
        if (webElementSk11 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "新浦区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk11.click();
            //WebElement   webElementSk12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElementSk13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk13 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "新浦区筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "新浦区筛选结果失败");
            }
        }
        Thread.sleep(1000);
        WebElement webElementSk14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
        if (webElementSk14 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "海州区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk14.click();
            //    WebElement   webElementSk15 = ; //代码保留
            WebElement webElementSk16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk16 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "海州区筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "海州区筛选结果失败");
            }
        }

        //
        Thread.sleep(1000);
        WebElement webElementSk17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
        if (webElementSk17 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "赣榆区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk17.click();
            //  WebElement webElementSk18 ="";
            WebElement webElementSk19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk19 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "赣榆区筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "赣榆区筛选结果失败");
            }
        }

        Thread.sleep(1000);
        WebElement webElementSk20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
        if (webElementSk20 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "东海县区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk20.click();
            Thread.sleep(1000);
            WebElement webElementSk21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
            WebElement webElementSk22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk21 != null || webElementSk22 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "东海县筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "东海县筛选结果失败");
            }
        }


        Thread.sleep(1000);
        WebElement webElementSk23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
        if (webElementSk23 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "灌云县区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk23.click();
            //  WebElement webElementSk24 =;//保留代码
            WebElement webElementSk25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk25 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "灌云县筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "灌云县筛选结果失败");
            }
        }
        Thread.sleep(1000);
        WebElement webElementSk26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
        if (webElementSk26 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "灌云县区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk26.click();
            //  WebElement webElementSk27 =;//保留代码
            WebElement webElementSk28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk28 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "灌云县筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "灌云县筛选结果失败");
            }
        }
        Thread.sleep(1000);
        WebElement webElementSk29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
        if (webElementSk29 == null) {
            log.info(ceshiyongli + shengkong + "AQI" + "连云港经济技术开发区区县筛选按钮点击失败");
        } else {
            Thread.sleep(1000);
            webElementSk29.click();
            //  WebElement webElementSk27 =;//保留代码
            WebElement webElementSk30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
            if (webElementSk30 != null) {
                log.info(ceshiyongli + shengkong + "AQI" + "连云港经济技术开发区筛选结果满足");
            } else {
                log.info(ceshiyongli + shengkong + "AQI" + "连云港经济技术开发区筛选结果失败");
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkPMII = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[2]/a"));
        if(webElementSkPMII==null){
            log.info(ceshiyongli + shengkong + "PM2.5" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "PM2.5" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkPMII.click();
            Thread.sleep(500);
            WebElement webElementSkPMII5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkPMII5 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII5.click();
                Thread.sleep(500);
                WebElement webElementSkPMII6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMII7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII6 != null || webElementSkPMII7 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMII8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkPMII8 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII8.click();
                WebElement webElementSkPMII9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMII10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII9 != null || webElementSkPMII10 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMII11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkPMII11 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII11.click();
                //WebElement   webElementSkPMII12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMII13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII13 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMII14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkPMII14 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII14.click();
                //    WebElement   webElementSkPMII15 = ; //代码保留
                WebElement webElementSkPMII16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII16 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkPMII17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkPMII17 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII17.click();
                //  WebElement webElementSkPMII18 ="";
                WebElement webElementSkPMII19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII19 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMII20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkPMII20 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII20.click();
                Thread.sleep(1000);
                WebElement webElementSkPMII21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMII22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII21 != null || webElementSkPMII22 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkPMII23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkPMII23 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII23.click();
                //  WebElement webElementSkPMII24 =;//保留代码
                WebElement webElementSkPMII25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII25 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMII26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkPMII26 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII26.click();
                //  WebElement webElementSkPMII27 =;//保留代码
                WebElement webElementSkPMII28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII28 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMII29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkPMII29 == null) {
                log.info(ceshiyongli + shengkong + "PM2.5" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMII29.click();
                //  WebElement webElementSkPMII27 =;//保留代码
                WebElement webElementSkPMII30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMII30 != null) {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM2.5" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkPMIO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[3]/a"));
        if(webElementSkPMIO==null){
            log.info(ceshiyongli + shengkong + "PM10" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "PM10" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkPMIO.click();
            Thread.sleep(500);
            WebElement webElementSkPMIO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkPMIO5 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO5.click();
                Thread.sleep(500);
                WebElement webElementSkPMIO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMIO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO6 != null || webElementSkPMIO7 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMIO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkPMIO8 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO8.click();
                WebElement webElementSkPMIO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMIO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO9 != null || webElementSkPMIO10 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMIO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkPMIO11 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO11.click();
                //WebElement   webElementSkPMIO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMIO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO13 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMIO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkPMIO14 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO14.click();
                //    WebElement   webElementSkPMIO15 = ; //代码保留
                WebElement webElementSkPMIO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO16 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkPMIO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkPMIO17 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO17.click();
                //  WebElement webElementSkPMIO18 ="";
                WebElement webElementSkPMIO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO19 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkPMIO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkPMIO20 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO20.click();
                Thread.sleep(1000);
                WebElement webElementSkPMIO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkPMIO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO21 != null || webElementSkPMIO22 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkPMIO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkPMIO23 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO23.click();
                //  WebElement webElementSkPMIO24 =;//保留代码
                WebElement webElementSkPMIO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO25 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMIO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkPMIO26 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO26.click();
                //  WebElement webElementSkPMIO27 =;//保留代码
                WebElement webElementSkPMIO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO28 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkPMIO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkPMIO29 == null) {
                log.info(ceshiyongli + shengkong + "PM10" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkPMIO29.click();
                //  WebElement webElementSkPMIO27 =;//保留代码
                WebElement webElementSkPMIO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkPMIO30 != null) {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "PM10" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkSO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[4]/a"));
        if(webElementSkSO2==null){
            log.info(ceshiyongli + shengkong + "SO2" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "SO2" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkSO2.click();
            Thread.sleep(500);
            WebElement webElementSkSO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkSO25 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO25.click();
                Thread.sleep(500);
                WebElement webElementSkSO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkSO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO26 != null || webElementSkSO27 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkSO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkSO28 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO28.click();
                WebElement webElementSkSO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkSO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO29 != null || webElementSkSO210 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkSO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkSO211 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO211.click();
                //WebElement   webElementSkSO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkSO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO213 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkSO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkSO214 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO214.click();
                //    WebElement   webElementSkSO215 = ; //代码保留
                WebElement webElementSkSO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO216 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkSO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkSO217 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO217.click();
                //  WebElement webElementSkSO218 ="";
                WebElement webElementSkSO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO219 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkSO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkSO220 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO220.click();
                Thread.sleep(500);
                WebElement webElementSkSO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkSO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO221 != null || webElementSkSO222 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkSO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkSO223 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO223.click();
                //  WebElement webElementSkSO224 =;//保留代码
                WebElement webElementSkSO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO225 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkSO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkSO226 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO226.click();
                //  WebElement webElementSkSO227 =;//保留代码
                WebElement webElementSkSO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO228 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkSO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkSO229 == null) {
                log.info(ceshiyongli + shengkong + "SO2" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkSO229.click();
                //  WebElement webElementSkSO227 =;//保留代码
                WebElement webElementSkSO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkSO230 != null) {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "SO2" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkNO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[5]/a"));
        if(webElementSkNO2==null){
            log.info(ceshiyongli + shengkong + "NO2" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "NO2" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkNO2.click();
            Thread.sleep(500);
            WebElement webElementSkNO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkNO25 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO25.click();
                Thread.sleep(500);
                WebElement webElementSkNO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkNO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO26 != null || webElementSkNO27 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkNO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkNO28 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO28.click();
                WebElement webElementSkNO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkNO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO29 != null || webElementSkNO210 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkNO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkNO211 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO211.click();
                //WebElement   webElementSkNO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkNO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO213 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkNO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkNO214 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO214.click();
                //    WebElement   webElementSkNO215 = ; //代码保留
                WebElement webElementSkNO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO216 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkNO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkNO217 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO217.click();
                //  WebElement webElementSkNO218 ="";
                WebElement webElementSkNO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO219 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkNO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkNO220 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO220.click();
                Thread.sleep(500);
                WebElement webElementSkNO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkNO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO221 != null || webElementSkNO222 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkNO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkNO223 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO223.click();
                //  WebElement webElementSkNO224 =;//保留代码
                WebElement webElementSkNO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO225 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkNO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkNO226 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO226.click();
                //  WebElement webElementSkNO227 =;//保留代码
                WebElement webElementSkNO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO228 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkNO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkNO229 == null) {
                log.info(ceshiyongli + shengkong + "NO2" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkNO229.click();
                //  WebElement webElementSkNO227 =;//保留代码
                WebElement webElementSkNO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkNO230 != null) {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "NO2" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkCO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[6]/a"));
        if(webElementSkCO==null){
            log.info(ceshiyongli + shengkong + "CO" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "CO" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkCO.click();
            Thread.sleep(500);
            WebElement webElementSkCO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkCO5 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO5.click();
                Thread.sleep(500);
                WebElement webElementSkCO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkCO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO6 != null || webElementSkCO7 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkCO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkCO8 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO8.click();
                WebElement webElementSkCO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkCO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO9 != null || webElementSkCO10 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkCO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkCO11 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO11.click();
                //WebElement   webElementSkCO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkCO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO13 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkCO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkCO14 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO14.click();
                //    WebElement   webElementSkCO15 = ; //代码保留
                WebElement webElementSkCO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO16 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkCO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkCO17 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO17.click();
                //  WebElement webElementSkCO18 ="";
                WebElement webElementSkCO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO19 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkCO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkCO20 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO20.click();
                Thread.sleep(500);
                WebElement webElementSkCO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkCO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO21 != null || webElementSkCO22 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkCO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkCO23 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO23.click();
                //  WebElement webElementSkCO24 =;//保留代码
                WebElement webElementSkCO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO25 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkCO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkCO26 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO26.click();
                //  WebElement webElementSkCO27 =;//保留代码
                WebElement webElementSkCO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO28 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkCO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkCO29 == null) {
                log.info(ceshiyongli + shengkong + "CO" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkCO29.click();
                //  WebElement webElementSkCO27 =;//保留代码
                WebElement webElementSkCO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkCO30 != null) {
                    log.info(ceshiyongli + shengkong + "CO" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "CO" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }
        Thread.sleep(1000);
        WebElement webElementSkO3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[7]/a"));
        if(webElementSkO3==null){
            log.info(ceshiyongli + shengkong + "O3" + "点击页签失败");
        }else{
            log.info(ceshiyongli + shengkong + "O3" + "点击页签成功");
            Thread.sleep(1000);
            webElementSkO3.click();
            Thread.sleep(500);
            WebElement webElementSkO35 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementSkO35 == null) {
                log.info(ceshiyongli + shengkong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO35.click();
                Thread.sleep(500);
                WebElement webElementSkO36 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkO37 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO36 != null || webElementSkO37 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkO38 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementSkO38 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO38.click();
                WebElement webElementSkO39 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkO310 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO39 != null || webElementSkO310 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkO311 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementSkO311 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO311.click();
                //WebElement   webElementSkO312 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkO313 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO313 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkO314 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementSkO314 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO314.click();
                //    WebElement   webElementSkO315 = ; //代码保留
                WebElement webElementSkO316 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO316 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementSkO317 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementSkO317 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO317.click();
                //  WebElement webElementSkO318 ="";
                WebElement webElementSkO319 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO319 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementSkO320 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementSkO320 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO320.click();
                Thread.sleep(500);
                WebElement webElementSkO321 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementSkO322 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO321 != null || webElementSkO322 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementSkO323 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementSkO323 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO323.click();
                //  WebElement webElementSkO324 =;//保留代码
                WebElement webElementSkO325 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO325 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkO326 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementSkO326 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO326.click();
                //  WebElement webElementSkO327 =;//保留代码
                WebElement webElementSkO328 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO328 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementSkO329 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementSkO329 == null) {
                log.info(ceshiyongli + shengkong + "O3" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementSkO329.click();
                //  WebElement webElementSkO327 =;//保留代码
                WebElement webElementSkO330 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementSkO330 != null) {
                    log.info(ceshiyongli + shengkong + "O3" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shengkong + "O3" + "连云港经济技术开发区筛选结果失败");
                }
            }
        }


        }
    public static String getPath () {
        String configPath = "" + Config.class.getResource("/");
        configPath = configPath.replace("file:/", "").replace("/target/classes/", "").replace("/bin", "");
        return configPath;
    }
}
