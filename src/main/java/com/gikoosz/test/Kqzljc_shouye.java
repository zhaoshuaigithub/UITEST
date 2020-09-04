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


public class Kqzljc_shouye {
        private WebDriver driver;
        public Kqzljc_shouye(WebDriver webDriver){
            this.driver=webDriver;
        }

       public void kqzljc_shouye() throws InterruptedException {
            JavascriptExecutor js;
            String userName = Config.getUrlProperty("userName"); //正确的用户名
            String passWord = Config.getUrlProperty("passWord"); //正确的密码
            String daqiTitle = Config.getUrlProperty("daqiTitle");
            final String ceshiyongli  = "【测试用例】";
            final String guokong="[国控站点]";
            final String shengkong="[省站点]";
            final String shikong="[市控站点]";
            final String gangkou="[港口空气站]";
            final String TVOCzd="[TVOC站点]";

            Logger log = LogManager.getLogger(Kqzljc_shouye.class);
            DOMConfigurator.configure(getPath() + "/Config/log4j.xml");
            js = (JavascriptExecutor) driver;

            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();
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
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[2]/label/span[1]/span")).click();
            WebElement webElementShik4 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[3]/label/span[2]"));
            String value9= webElementShik4.getText();
            if ("市控站点".equals(value9)) {
                System.out.println("输出value8:" + value8);

            } else {
                System.out.println("输出的值不正确");
            }

            Thread.sleep(1000);
            WebElement webElementShik5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementShik5 == null) {
                log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik5.click();
                WebElement webElementShik6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementShik7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik6 != null || webElementShik7 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementShik8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementShik8 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik8.click();
                WebElement webElementShik9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementShik10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik9 != null || webElementShik10 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementShik11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementShik11 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik11.click();
                //WebElement   webElementShik12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementShik13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik13 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementShik14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementShik14 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik14.click();
                //    WebElement   webElementShik15 = ; //代码保留
                WebElement webElementShik16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik16 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementShik17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementShik17 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik17.click();
                //  WebElement webElementShik18 ="";
                WebElement webElementShik19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik19 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementShik20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementShik20 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik20.click();
                Thread.sleep(1000);
                WebElement webElementShik21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementShik22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik21 != null || webElementShik22 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementShik23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementShik23 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik23.click();
                //  WebElement webElementShik24 =;//保留代码
                WebElement webElementShik25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik25 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementShik26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementShik26 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik26.click();
                //  WebElement webElementShik27 =;//保留代码
                WebElement webElementShik28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik28 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementShik29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementShik29 == null) {
                log.info(ceshiyongli + shikong + "AQI" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementShik29.click();
                //  WebElement webElementShik27 =;//保留代码
                WebElement webElementShik30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementShik30 != null) {
                    log.info(ceshiyongli + shikong + "AQI" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + shikong + "AQI" + "连云港经济技术开发区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikPMII = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[2]/a"));
            if(webElementShikPMII==null){
                log.info(ceshiyongli + shikong + "PM2.5" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "PM2.5" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikPMII.click();
                Thread.sleep(500);
                WebElement webElementShikPMII5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikPMII5 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII5.click();
                    Thread.sleep(500);
                    WebElement webElementShikPMII6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMII7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII6 != null || webElementShikPMII7 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMII8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikPMII8 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII8.click();
                    WebElement webElementShikPMII9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMII10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII9 != null || webElementShikPMII10 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMII11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikPMII11 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII11.click();
                    //WebElement   webElementShikPMII12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMII13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII13 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMII14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikPMII14 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII14.click();
                    //    WebElement   webElementShikPMII15 = ; //代码保留
                    WebElement webElementShikPMII16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII16 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikPMII17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikPMII17 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII17.click();
                    //  WebElement webElementShikPMII18 ="";
                    WebElement webElementShikPMII19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII19 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMII20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikPMII20 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII20.click();
                    Thread.sleep(1000);
                    WebElement webElementShikPMII21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMII22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII21 != null || webElementShikPMII22 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikPMII23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikPMII23 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII23.click();
                    //  WebElement webElementShikPMII24 =;//保留代码
                    WebElement webElementShikPMII25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII25 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMII26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikPMII26 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII26.click();
                    //  WebElement webElementShikPMII27 =;//保留代码
                    WebElement webElementShikPMII28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII28 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMII29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikPMII29 == null) {
                    log.info(ceshiyongli + shikong + "PM2.5" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMII29.click();
                    //  WebElement webElementShikPMII27 =;//保留代码
                    WebElement webElementShikPMII30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMII30 != null) {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM2.5" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikPMIO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[3]/a"));
            if(webElementShikPMIO==null){
                log.info(ceshiyongli + shikong + "PM10" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "PM10" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikPMIO.click();
                Thread.sleep(500);
                WebElement webElementShikPMIO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikPMIO5 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO5.click();
                    Thread.sleep(500);
                    WebElement webElementShikPMIO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMIO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO6 != null || webElementShikPMIO7 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMIO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikPMIO8 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO8.click();
                    WebElement webElementShikPMIO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMIO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO9 != null || webElementShikPMIO10 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMIO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikPMIO11 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO11.click();
                    //WebElement   webElementShikPMIO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMIO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO13 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMIO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikPMIO14 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO14.click();
                    //    WebElement   webElementShikPMIO15 = ; //代码保留
                    WebElement webElementShikPMIO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO16 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikPMIO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikPMIO17 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO17.click();
                    //  WebElement webElementShikPMIO18 ="";
                    WebElement webElementShikPMIO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO19 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikPMIO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikPMIO20 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO20.click();
                    Thread.sleep(1000);
                    WebElement webElementShikPMIO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikPMIO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO21 != null || webElementShikPMIO22 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikPMIO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikPMIO23 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO23.click();
                    //  WebElement webElementShikPMIO24 =;//保留代码
                    WebElement webElementShikPMIO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO25 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMIO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikPMIO26 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO26.click();
                    //  WebElement webElementShikPMIO27 =;//保留代码
                    WebElement webElementShikPMIO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO28 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikPMIO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikPMIO29 == null) {
                    log.info(ceshiyongli + shikong + "PM10" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikPMIO29.click();
                    //  WebElement webElementShikPMIO27 =;//保留代码
                    WebElement webElementShikPMIO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikPMIO30 != null) {
                        log.info(ceshiyongli + shikong + "PM10" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "PM10" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikSO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[4]/a"));
            if(webElementShikSO2==null){
                log.info(ceshiyongli + shikong + "SO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "SO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikSO2.click();
                Thread.sleep(500);
                WebElement webElementShikSO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikSO25 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO25.click();
                    Thread.sleep(500);
                    WebElement webElementShikSO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikSO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO26 != null || webElementShikSO27 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikSO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikSO28 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO28.click();
                    WebElement webElementShikSO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikSO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO29 != null || webElementShikSO210 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikSO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikSO211 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO211.click();
                    //WebElement   webElementShikSO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikSO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO213 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikSO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikSO214 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO214.click();
                    //    WebElement   webElementShikSO215 = ; //代码保留
                    WebElement webElementShikSO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO216 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikSO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikSO217 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO217.click();
                    //  WebElement webElementShikSO218 ="";
                    WebElement webElementShikSO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO219 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikSO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikSO220 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO220.click();
                    Thread.sleep(500);
                    WebElement webElementShikSO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikSO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO221 != null || webElementShikSO222 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikSO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikSO223 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO223.click();
                    //  WebElement webElementShikSO224 =;//保留代码
                    WebElement webElementShikSO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO225 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikSO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikSO226 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO226.click();
                    //  WebElement webElementShikSO227 =;//保留代码
                    WebElement webElementShikSO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO228 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikSO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikSO229 == null) {
                    log.info(ceshiyongli + shikong + "SO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikSO229.click();
                    //  WebElement webElementShikSO227 =;//保留代码
                    WebElement webElementShikSO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikSO230 != null) {
                        log.info(ceshiyongli + shikong + "SO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "SO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikNO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[5]/a"));
            if(webElementShikNO2==null){
                log.info(ceshiyongli + shikong + "NO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "NO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikNO2.click();
                Thread.sleep(500);
                WebElement webElementShikNO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikNO25 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO25.click();
                    Thread.sleep(500);
                    WebElement webElementShikNO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikNO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO26 != null || webElementShikNO27 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikNO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikNO28 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO28.click();
                    WebElement webElementShikNO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikNO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO29 != null || webElementShikNO210 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikNO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikNO211 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO211.click();
                    //WebElement   webElementShikNO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikNO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO213 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikNO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikNO214 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO214.click();
                    //    WebElement   webElementShikNO215 = ; //代码保留
                    WebElement webElementShikNO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO216 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikNO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikNO217 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO217.click();
                    //  WebElement webElementShikNO218 ="";
                    WebElement webElementShikNO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO219 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikNO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikNO220 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO220.click();
                    Thread.sleep(500);
                    WebElement webElementShikNO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikNO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO221 != null || webElementShikNO222 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikNO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikNO223 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO223.click();
                    //  WebElement webElementShikNO224 =;//保留代码
                    WebElement webElementShikNO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO225 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikNO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikNO226 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO226.click();
                    //  WebElement webElementShikNO227 =;//保留代码
                    WebElement webElementShikNO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO228 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikNO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikNO229 == null) {
                    log.info(ceshiyongli + shikong + "NO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikNO229.click();
                    //  WebElement webElementShikNO227 =;//保留代码
                    WebElement webElementShikNO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikNO230 != null) {
                        log.info(ceshiyongli + shikong + "NO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "NO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikCO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[6]/a"));
            if(webElementShikCO==null){
                log.info(ceshiyongli + shikong + "CO" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "CO" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikCO.click();
                Thread.sleep(500);
                WebElement webElementShikCO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikCO5 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO5.click();
                    Thread.sleep(500);
                    WebElement webElementShikCO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikCO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO6 != null || webElementShikCO7 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikCO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikCO8 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO8.click();
                    WebElement webElementShikCO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikCO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO9 != null || webElementShikCO10 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikCO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikCO11 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO11.click();
                    //WebElement   webElementShikCO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikCO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO13 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikCO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikCO14 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO14.click();
                    //    WebElement   webElementShikCO15 = ; //代码保留
                    WebElement webElementShikCO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO16 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikCO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikCO17 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO17.click();
                    //  WebElement webElementShikCO18 ="";
                    WebElement webElementShikCO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO19 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikCO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikCO20 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO20.click();
                    Thread.sleep(500);
                    WebElement webElementShikCO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikCO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO21 != null || webElementShikCO22 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikCO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikCO23 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO23.click();
                    //  WebElement webElementShikCO24 =;//保留代码
                    WebElement webElementShikCO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO25 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikCO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikCO26 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO26.click();
                    //  WebElement webElementShikCO27 =;//保留代码
                    WebElement webElementShikCO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO28 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikCO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikCO29 == null) {
                    log.info(ceshiyongli + shikong + "CO" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikCO29.click();
                    //  WebElement webElementShikCO27 =;//保留代码
                    WebElement webElementShikCO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikCO30 != null) {
                        log.info(ceshiyongli + shikong + "CO" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "CO" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementShikO3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[7]/a"));
            if(webElementShikO3==null){
                log.info(ceshiyongli + shikong + "O3" + "点击页签失败");
            }else{
                log.info(ceshiyongli + shikong + "O3" + "点击页签成功");
                Thread.sleep(1000);
                webElementShikO3.click();
                Thread.sleep(500);
                WebElement webElementShikO35 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementShikO35 == null) {
                    log.info(ceshiyongli + shikong + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO35.click();
                    Thread.sleep(500);
                    WebElement webElementShikO36 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikO37 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO36 != null || webElementShikO37 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikO38 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementShikO38 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO38.click();
                    WebElement webElementShikO39 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikO310 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO39 != null || webElementShikO310 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikO311 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementShikO311 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO311.click();
                    //WebElement   webElementShikO312 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikO313 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO313 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikO314 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementShikO314 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO314.click();
                    //    WebElement   webElementShikO315 = ; //代码保留
                    WebElement webElementShikO316 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO316 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementShikO317 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementShikO317 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO317.click();
                    //  WebElement webElementShikO318 ="";
                    WebElement webElementShikO319 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO319 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementShikO320 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementShikO320 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO320.click();
                    Thread.sleep(500);
                    WebElement webElementShikO321 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementShikO322 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO321 != null || webElementShikO322 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementShikO323 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementShikO323 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO323.click();
                    //  WebElement webElementShikO324 =;//保留代码
                    WebElement webElementShikO325 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO325 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikO326 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementShikO326 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO326.click();
                    //  WebElement webElementShikO327 =;//保留代码
                    WebElement webElementShikO328 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO328 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementShikO329 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementShikO329 == null) {
                    log.info(ceshiyongli + shikong + "O3" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementShikO329.click();
                    //  WebElement webElementShikO327 =;//保留代码
                    WebElement webElementShikO330 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementShikO330 != null) {
                        log.info(ceshiyongli + shikong + "O3" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + shikong + "O3" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[2]/label/span[1]/span")).click();
            WebElement webElementGk4 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[4]/label/span[2]"));
            String value10= webElementGk4.getText();
            if ("港口空气站".equals(value10)) {
                System.out.println("输出value8:" + value8);

            } else {
                System.out.println("输出的值不正确");
            }

            Thread.sleep(1000);
            WebElement webElementGk5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementGk5 == null) {
                log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk5.click();
                WebElement webElementGk6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementGk7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk6 != null || webElementGk7 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementGk8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementGk8 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk8.click();
                WebElement webElementGk9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementGk10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk9 != null || webElementGk10 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementGk11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementGk11 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk11.click();
                //WebElement   webElementGk12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementGk13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk13 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementGk14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementGk14 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk14.click();
                //    WebElement   webElementGk15 = ; //代码保留
                WebElement webElementGk16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk16 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementGk17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementGk17 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk17.click();
                //  WebElement webElementGk18 ="";
                WebElement webElementGk19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk19 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementGk20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementGk20 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk20.click();
                Thread.sleep(1000);
                WebElement webElementGk21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementGk22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk21 != null || webElementGk22 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementGk23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementGk23 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk23.click();
                //  WebElement webElementGk24 =;//保留代码
                WebElement webElementGk25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk25 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementGk26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementGk26 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk26.click();
                //  WebElement webElementGk27 =;//保留代码
                WebElement webElementGk28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk28 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementGk29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementGk29 == null) {
                log.info(ceshiyongli + gangkou + "AQI" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementGk29.click();
                //  WebElement webElementGk27 =;//保留代码
                WebElement webElementGk30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementGk30 != null) {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + gangkou + "AQI" + "连云港经济技术开发区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkPMII = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[2]/a"));
            if(webElementGkPMII==null){
                log.info(ceshiyongli + gangkou + "PM2.5" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "PM2.5" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkPMII.click();
                Thread.sleep(500);
                WebElement webElementGkPMII5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkPMII5 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII5.click();
                    Thread.sleep(500);
                    WebElement webElementGkPMII6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMII7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII6 != null || webElementGkPMII7 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMII8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkPMII8 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII8.click();
                    WebElement webElementGkPMII9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMII10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII9 != null || webElementGkPMII10 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMII11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkPMII11 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII11.click();
                    //WebElement   webElementGkPMII12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMII13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII13 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMII14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkPMII14 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII14.click();
                    //    WebElement   webElementGkPMII15 = ; //代码保留
                    WebElement webElementGkPMII16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII16 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkPMII17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkPMII17 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII17.click();
                    //  WebElement webElementGkPMII18 ="";
                    WebElement webElementGkPMII19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII19 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMII20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkPMII20 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII20.click();
                    Thread.sleep(1000);
                    WebElement webElementGkPMII21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMII22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII21 != null || webElementGkPMII22 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkPMII23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkPMII23 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII23.click();
                    //  WebElement webElementGkPMII24 =;//保留代码
                    WebElement webElementGkPMII25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII25 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMII26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkPMII26 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII26.click();
                    //  WebElement webElementGkPMII27 =;//保留代码
                    WebElement webElementGkPMII28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII28 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMII29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkPMII29 == null) {
                    log.info(ceshiyongli + gangkou + "PM2.5" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMII29.click();
                    //  WebElement webElementGkPMII27 =;//保留代码
                    WebElement webElementGkPMII30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMII30 != null) {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM2.5" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkPMIO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[3]/a"));
            if(webElementGkPMIO==null){
                log.info(ceshiyongli + gangkou + "PM10" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "PM10" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkPMIO.click();
                Thread.sleep(500);
                WebElement webElementGkPMIO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkPMIO5 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO5.click();
                    Thread.sleep(500);
                    WebElement webElementGkPMIO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMIO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO6 != null || webElementGkPMIO7 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMIO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkPMIO8 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO8.click();
                    WebElement webElementGkPMIO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMIO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO9 != null || webElementGkPMIO10 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMIO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkPMIO11 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO11.click();
                    //WebElement   webElementGkPMIO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMIO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO13 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMIO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkPMIO14 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO14.click();
                    //    WebElement   webElementGkPMIO15 = ; //代码保留
                    WebElement webElementGkPMIO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO16 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkPMIO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkPMIO17 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO17.click();
                    //  WebElement webElementGkPMIO18 ="";
                    WebElement webElementGkPMIO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO19 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkPMIO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkPMIO20 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO20.click();
                    Thread.sleep(1000);
                    WebElement webElementGkPMIO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkPMIO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO21 != null || webElementGkPMIO22 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkPMIO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkPMIO23 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO23.click();
                    //  WebElement webElementGkPMIO24 =;//保留代码
                    WebElement webElementGkPMIO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO25 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMIO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkPMIO26 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO26.click();
                    //  WebElement webElementGkPMIO27 =;//保留代码
                    WebElement webElementGkPMIO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO28 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkPMIO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkPMIO29 == null) {
                    log.info(ceshiyongli + gangkou + "PM10" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkPMIO29.click();
                    //  WebElement webElementGkPMIO27 =;//保留代码
                    WebElement webElementGkPMIO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkPMIO30 != null) {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "PM10" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkSO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[4]/a"));
            if(webElementGkSO2==null){
                log.info(ceshiyongli + gangkou + "SO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "SO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkSO2.click();
                Thread.sleep(500);
                WebElement webElementGkSO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkSO25 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO25.click();
                    Thread.sleep(500);
                    WebElement webElementGkSO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkSO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO26 != null || webElementGkSO27 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkSO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkSO28 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO28.click();
                    WebElement webElementGkSO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkSO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO29 != null || webElementGkSO210 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkSO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkSO211 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO211.click();
                    //WebElement   webElementGkSO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkSO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO213 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkSO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkSO214 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO214.click();
                    //    WebElement   webElementGkSO215 = ; //代码保留
                    WebElement webElementGkSO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO216 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkSO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkSO217 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO217.click();
                    //  WebElement webElementGkSO218 ="";
                    WebElement webElementGkSO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO219 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkSO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkSO220 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO220.click();
                    Thread.sleep(500);
                    WebElement webElementGkSO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkSO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO221 != null || webElementGkSO222 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkSO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkSO223 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO223.click();
                    //  WebElement webElementGkSO224 =;//保留代码
                    WebElement webElementGkSO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO225 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkSO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkSO226 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO226.click();
                    //  WebElement webElementGkSO227 =;//保留代码
                    WebElement webElementGkSO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO228 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkSO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkSO229 == null) {
                    log.info(ceshiyongli + gangkou + "SO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkSO229.click();
                    //  WebElement webElementGkSO227 =;//保留代码
                    WebElement webElementGkSO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkSO230 != null) {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "SO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkNO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[5]/a"));
            if(webElementGkNO2==null){
                log.info(ceshiyongli + gangkou + "NO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "NO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkNO2.click();
                Thread.sleep(500);
                WebElement webElementGkNO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkNO25 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO25.click();
                    Thread.sleep(500);
                    WebElement webElementGkNO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkNO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO26 != null || webElementGkNO27 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkNO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkNO28 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO28.click();
                    WebElement webElementGkNO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkNO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO29 != null || webElementGkNO210 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkNO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkNO211 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO211.click();
                    //WebElement   webElementGkNO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkNO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO213 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkNO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkNO214 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO214.click();
                    //    WebElement   webElementGkNO215 = ; //代码保留
                    WebElement webElementGkNO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO216 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkNO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkNO217 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO217.click();
                    //  WebElement webElementGkNO218 ="";
                    WebElement webElementGkNO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO219 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkNO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkNO220 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO220.click();
                    Thread.sleep(500);
                    WebElement webElementGkNO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkNO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO221 != null || webElementGkNO222 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkNO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkNO223 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO223.click();
                    //  WebElement webElementGkNO224 =;//保留代码
                    WebElement webElementGkNO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO225 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkNO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkNO226 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO226.click();
                    //  WebElement webElementGkNO227 =;//保留代码
                    WebElement webElementGkNO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO228 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkNO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkNO229 == null) {
                    log.info(ceshiyongli + gangkou + "NO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkNO229.click();
                    //  WebElement webElementGkNO227 =;//保留代码
                    WebElement webElementGkNO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkNO230 != null) {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "NO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkCO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[6]/a"));
            if(webElementGkCO==null){
                log.info(ceshiyongli + gangkou + "CO" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "CO" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkCO.click();
                Thread.sleep(500);
                WebElement webElementGkCO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkCO5 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO5.click();
                    Thread.sleep(500);
                    WebElement webElementGkCO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkCO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO6 != null || webElementGkCO7 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkCO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkCO8 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO8.click();
                    WebElement webElementGkCO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkCO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO9 != null || webElementGkCO10 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkCO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkCO11 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO11.click();
                    //WebElement   webElementGkCO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkCO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO13 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkCO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkCO14 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO14.click();
                    //    WebElement   webElementGkCO15 = ; //代码保留
                    WebElement webElementGkCO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO16 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkCO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkCO17 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO17.click();
                    //  WebElement webElementGkCO18 ="";
                    WebElement webElementGkCO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO19 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkCO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkCO20 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO20.click();
                    Thread.sleep(500);
                    WebElement webElementGkCO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkCO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO21 != null || webElementGkCO22 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkCO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkCO23 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO23.click();
                    //  WebElement webElementGkCO24 =;//保留代码
                    WebElement webElementGkCO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO25 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkCO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkCO26 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO26.click();
                    //  WebElement webElementGkCO27 =;//保留代码
                    WebElement webElementGkCO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO28 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkCO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkCO29 == null) {
                    log.info(ceshiyongli + gangkou + "CO" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkCO29.click();
                    //  WebElement webElementGkCO27 =;//保留代码
                    WebElement webElementGkCO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkCO30 != null) {
                        log.info(ceshiyongli + gangkou + "CO" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "CO" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementGkO3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[7]/a"));
            if(webElementGkO3==null){
                log.info(ceshiyongli + gangkou + "O3" + "点击页签失败");
            }else{
                log.info(ceshiyongli + gangkou + "O3" + "点击页签成功");
                Thread.sleep(1000);
                webElementGkO3.click();
                Thread.sleep(500);
                WebElement webElementGkO35 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementGkO35 == null) {
                    log.info(ceshiyongli + gangkou + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO35.click();
                    Thread.sleep(500);
                    WebElement webElementGkO36 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkO37 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO36 != null || webElementGkO37 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkO38 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementGkO38 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO38.click();
                    WebElement webElementGkO39 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkO310 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO39 != null || webElementGkO310 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkO311 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementGkO311 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO311.click();
                    //WebElement   webElementGkO312 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkO313 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO313 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkO314 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementGkO314 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO314.click();
                    //    WebElement   webElementGkO315 = ; //代码保留
                    WebElement webElementGkO316 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO316 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementGkO317 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementGkO317 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO317.click();
                    //  WebElement webElementGkO318 ="";
                    WebElement webElementGkO319 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO319 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementGkO320 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementGkO320 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO320.click();
                    Thread.sleep(500);
                    WebElement webElementGkO321 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementGkO322 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO321 != null || webElementGkO322 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementGkO323 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementGkO323 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO323.click();
                    //  WebElement webElementGkO324 =;//保留代码
                    WebElement webElementGkO325 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO325 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkO326 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementGkO326 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO326.click();
                    //  WebElement webElementGkO327 =;//保留代码
                    WebElement webElementGkO328 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO328 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementGkO329 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementGkO329 == null) {
                    log.info(ceshiyongli + gangkou + "O3" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementGkO329.click();
                    //  WebElement webElementGkO327 =;//保留代码
                    WebElement webElementGkO330 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementGkO330 != null) {
                        log.info(ceshiyongli + gangkou + "O3" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + gangkou + "O3" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[1]/div")).click();
            driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[2]/label/span[1]/span")).click();
            WebElement webElementTVOC4 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[6]/ul/li/div/div[2]/div[5]/label/span[2]"));
            String value11= webElementTVOC4.getText();
            if ("TVOC站".equals(value11)) {
                System.out.println("输出value8:" + value8);

            } else {
                System.out.println("输出的值不正确");
            }

            Thread.sleep(1000);
            WebElement webElementTVOC5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
            if (webElementTVOC5 == null) {
                log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC5.click();
                WebElement webElementTVOC6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementTVOC7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC6 != null || webElementTVOC7 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云港筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云港筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementTVOC8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
            if (webElementTVOC8 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "连云区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC8.click();
                WebElement webElementTVOC9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementTVOC10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC9 != null || webElementTVOC10 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云区筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementTVOC11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
            if (webElementTVOC11 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "新浦区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC11.click();
                //WebElement   webElementTVOC12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementTVOC13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC13 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "新浦区筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "新浦区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOC14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
            if (webElementTVOC14 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "海州区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC14.click();
                //    WebElement   webElementTVOC15 = ; //代码保留
                WebElement webElementTVOC16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC16 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "海州区筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "海州区筛选结果失败");
                }
            }

            //
            Thread.sleep(1000);
            WebElement webElementTVOC17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
            if (webElementTVOC17 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "赣榆区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC17.click();
                //  WebElement webElementTVOC18 ="";
                WebElement webElementTVOC19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC19 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "赣榆区筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "赣榆区筛选结果失败");
                }
            }

            Thread.sleep(1000);
            WebElement webElementTVOC20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
            if (webElementTVOC20 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "东海县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC20.click();
                Thread.sleep(1000);
                WebElement webElementTVOC21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                WebElement webElementTVOC22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC21 != null || webElementTVOC22 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "东海县筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "东海县筛选结果失败");
                }
            }


            Thread.sleep(1000);
            WebElement webElementTVOC23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
            if (webElementTVOC23 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC23.click();
                //  WebElement webElementTVOC24 =;//保留代码
                WebElement webElementTVOC25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC25 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOC26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
            if (webElementTVOC26 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC26.click();
                //  WebElement webElementTVOC27 =;//保留代码
                WebElement webElementTVOC28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC28 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "灌云县筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOC29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
            if (webElementTVOC29 == null) {
                log.info(ceshiyongli + TVOCzd + "AQI" + "连云港经济技术开发区区县筛选按钮点击失败");
            } else {
                Thread.sleep(1000);
                webElementTVOC29.click();
                //  WebElement webElementTVOC27 =;//保留代码
                WebElement webElementTVOC30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                if (webElementTVOC30 != null) {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云港经济技术开发区筛选结果满足");
                } else {
                    log.info(ceshiyongli + TVOCzd + "AQI" + "连云港经济技术开发区筛选结果失败");
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCPMII = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[2]/a"));
            if(webElementTVOCPMII==null){
                log.info(ceshiyongli + TVOCzd + "PM2.5" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "PM2.5" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCPMII.click();
                Thread.sleep(500);
                WebElement webElementTVOCPMII5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCPMII5 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII5.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCPMII6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMII7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII6 != null || webElementTVOCPMII7 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMII8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCPMII8 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII8.click();
                    WebElement webElementTVOCPMII9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMII10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII9 != null || webElementTVOCPMII10 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMII11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCPMII11 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII11.click();
                    //WebElement   webElementTVOCPMII12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMII13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII13 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMII14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCPMII14 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII14.click();
                    //    WebElement   webElementTVOCPMII15 = ; //代码保留
                    WebElement webElementTVOCPMII16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII16 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCPMII17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCPMII17 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII17.click();
                    //  WebElement webElementTVOCPMII18 ="";
                    WebElement webElementTVOCPMII19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII19 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMII20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCPMII20 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII20.click();
                    Thread.sleep(1000);
                    WebElement webElementTVOCPMII21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMII22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII21 != null || webElementTVOCPMII22 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCPMII23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCPMII23 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII23.click();
                    //  WebElement webElementTVOCPMII24 =;//保留代码
                    WebElement webElementTVOCPMII25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII25 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMII26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCPMII26 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII26.click();
                    //  WebElement webElementTVOCPMII27 =;//保留代码
                    WebElement webElementTVOCPMII28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII28 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMII29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCPMII29 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMII29.click();
                    //  WebElement webElementTVOCPMII27 =;//保留代码
                    WebElement webElementTVOCPMII30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMII30 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM2.5" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCPMIO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[3]/a"));
            if(webElementTVOCPMIO==null){
                log.info(ceshiyongli + TVOCzd + "PM10" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "PM10" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCPMIO.click();
                Thread.sleep(500);
                WebElement webElementTVOCPMIO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCPMIO5 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO5.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCPMIO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMIO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO6 != null || webElementTVOCPMIO7 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMIO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCPMIO8 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO8.click();
                    WebElement webElementTVOCPMIO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMIO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO9 != null || webElementTVOCPMIO10 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMIO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCPMIO11 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO11.click();
                    //WebElement   webElementTVOCPMIO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMIO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO13 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMIO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCPMIO14 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO14.click();
                    //    WebElement   webElementTVOCPMIO15 = ; //代码保留
                    WebElement webElementTVOCPMIO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO16 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCPMIO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCPMIO17 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO17.click();
                    //  WebElement webElementTVOCPMIO18 ="";
                    WebElement webElementTVOCPMIO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO19 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCPMIO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCPMIO20 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO20.click();
                    Thread.sleep(1000);
                    WebElement webElementTVOCPMIO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCPMIO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO21 != null || webElementTVOCPMIO22 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCPMIO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCPMIO23 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO23.click();
                    //  WebElement webElementTVOCPMIO24 =;//保留代码
                    WebElement webElementTVOCPMIO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO25 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMIO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCPMIO26 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO26.click();
                    //  WebElement webElementTVOCPMIO27 =;//保留代码
                    WebElement webElementTVOCPMIO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO28 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCPMIO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCPMIO29 == null) {
                    log.info(ceshiyongli + TVOCzd + "PM10" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCPMIO29.click();
                    //  WebElement webElementTVOCPMIO27 =;//保留代码
                    WebElement webElementTVOCPMIO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCPMIO30 != null) {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "PM10" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCSO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[4]/a"));
            if(webElementTVOCSO2==null){
                log.info(ceshiyongli + TVOCzd + "SO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "SO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCSO2.click();
                Thread.sleep(500);
                WebElement webElementTVOCSO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCSO25 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO25.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCSO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCSO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO26 != null || webElementTVOCSO27 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCSO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCSO28 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO28.click();
                    WebElement webElementTVOCSO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCSO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO29 != null || webElementTVOCSO210 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCSO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCSO211 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO211.click();
                    //WebElement   webElementTVOCSO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCSO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO213 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCSO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCSO214 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO214.click();
                    //    WebElement   webElementTVOCSO215 = ; //代码保留
                    WebElement webElementTVOCSO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO216 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCSO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCSO217 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO217.click();
                    //  WebElement webElementTVOCSO218 ="";
                    WebElement webElementTVOCSO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO219 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCSO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCSO220 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO220.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCSO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCSO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO221 != null || webElementTVOCSO222 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCSO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCSO223 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO223.click();
                    //  WebElement webElementTVOCSO224 =;//保留代码
                    WebElement webElementTVOCSO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO225 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCSO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCSO226 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO226.click();
                    //  WebElement webElementTVOCSO227 =;//保留代码
                    WebElement webElementTVOCSO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO228 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCSO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCSO229 == null) {
                    log.info(ceshiyongli + TVOCzd + "SO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCSO229.click();
                    //  WebElement webElementTVOCSO227 =;//保留代码
                    WebElement webElementTVOCSO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCSO230 != null) {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "SO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCNO2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[5]/a"));
            if(webElementTVOCNO2==null){
                log.info(ceshiyongli + TVOCzd + "NO2" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "NO2" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCNO2.click();
                Thread.sleep(500);
                WebElement webElementTVOCNO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCNO25 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO25.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCNO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCNO27 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO26 != null || webElementTVOCNO27 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCNO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCNO28 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO28.click();
                    WebElement webElementTVOCNO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCNO210 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO29 != null || webElementTVOCNO210 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCNO211 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCNO211 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO211.click();
                    //WebElement   webElementTVOCNO212 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCNO213 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO213 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCNO214 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCNO214 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO214.click();
                    //    WebElement   webElementTVOCNO215 = ; //代码保留
                    WebElement webElementTVOCNO216 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO216 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCNO217 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCNO217 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO217.click();
                    //  WebElement webElementTVOCNO218 ="";
                    WebElement webElementTVOCNO219 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO219 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCNO220 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCNO220 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO220.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCNO221 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCNO222 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO221 != null || webElementTVOCNO222 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCNO223 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCNO223 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO223.click();
                    //  WebElement webElementTVOCNO224 =;//保留代码
                    WebElement webElementTVOCNO225 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO225 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCNO226 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCNO226 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO226.click();
                    //  WebElement webElementTVOCNO227 =;//保留代码
                    WebElement webElementTVOCNO228 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO228 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCNO229 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCNO229 == null) {
                    log.info(ceshiyongli + TVOCzd + "NO2" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCNO229.click();
                    //  WebElement webElementTVOCNO227 =;//保留代码
                    WebElement webElementTVOCNO230 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCNO230 != null) {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "NO2" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCCO = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[6]/a"));
            if(webElementTVOCCO==null){
                log.info(ceshiyongli + TVOCzd + "CO" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "CO" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCCO.click();
                Thread.sleep(500);
                WebElement webElementTVOCCO5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCCO5 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO5.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCCO6 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCCO7 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO6 != null || webElementTVOCCO7 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCCO8 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCCO8 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO8.click();
                    WebElement webElementTVOCCO9 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCCO10 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO9 != null || webElementTVOCCO10 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCCO11 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCCO11 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO11.click();
                    //WebElement   webElementTVOCCO12 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCCO13 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO13 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCCO14 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCCO14 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO14.click();
                    //    WebElement   webElementTVOCCO15 = ; //代码保留
                    WebElement webElementTVOCCO16 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO16 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCCO17 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCCO17 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO17.click();
                    //  WebElement webElementTVOCCO18 ="";
                    WebElement webElementTVOCCO19 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO19 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCCO20 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCCO20 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO20.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCCO21 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCCO22 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO21 != null || webElementTVOCCO22 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCCO23 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCCO23 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO23.click();
                    //  WebElement webElementTVOCCO24 =;//保留代码
                    WebElement webElementTVOCCO25 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO25 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCCO26 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCCO26 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO26.click();
                    //  WebElement webElementTVOCCO27 =;//保留代码
                    WebElement webElementTVOCCO28 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO28 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCCO29 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCCO29 == null) {
                    log.info(ceshiyongli + TVOCzd + "CO" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCCO29.click();
                    //  WebElement webElementTVOCCO27 =;//保留代码
                    WebElement webElementTVOCCO30 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCCO30 != null) {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "CO" + "连云港经济技术开发区筛选结果失败");
                    }
                }
            }
            Thread.sleep(1000);
            WebElement webElementTVOCO3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/ul/li[7]/a"));
            if(webElementTVOCO3==null){
                log.info(ceshiyongli + TVOCzd + "O3" + "点击页签失败");
            }else{
                log.info(ceshiyongli + TVOCzd + "O3" + "点击页签成功");
                Thread.sleep(1000);
                webElementTVOCO3.click();
                Thread.sleep(500);
                WebElement webElementTVOCO35 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[1]"));
                if (webElementTVOCO35 == null) {
                    log.info(ceshiyongli + TVOCzd + "连云港区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO35.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCO36 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCO37 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO36 != null || webElementTVOCO37 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云港筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云港筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCO38 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[2]"));
                if (webElementTVOCO38 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "连云区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO38.click();
                    WebElement webElementTVOCO39 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCO310 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO39 != null || webElementTVOCO310 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCO311 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[3]"));
                if (webElementTVOCO311 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "新浦区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO311.click();
                    //WebElement   webElementTVOCO312 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCO313 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO313 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "新浦区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "新浦区筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCO314 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[4]"));
                if (webElementTVOCO314 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "海州区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO314.click();
                    //    WebElement   webElementTVOCO315 = ; //代码保留
                    WebElement webElementTVOCO316 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO316 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "海州区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "海州区筛选结果失败");
                    }
                }

                //
                Thread.sleep(1000);
                WebElement webElementTVOCO317 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[5]"));
                if (webElementTVOCO317 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "赣榆区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO317.click();
                    //  WebElement webElementTVOCO318 ="";
                    WebElement webElementTVOCO319 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO319 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "赣榆区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "赣榆区筛选结果失败");
                    }
                }

                Thread.sleep(1000);
                WebElement webElementTVOCO320 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[6]"));
                if (webElementTVOCO320 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "东海县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO320.click();
                    Thread.sleep(500);
                    WebElement webElementTVOCO321 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div"));
                    WebElement webElementTVOCO322 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO321 != null || webElementTVOCO322 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "东海县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "东海县筛选结果失败");
                    }
                }


                Thread.sleep(1000);
                WebElement webElementTVOCO323 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[7]"));
                if (webElementTVOCO323 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO323.click();
                    //  WebElement webElementTVOCO324 =;//保留代码
                    WebElement webElementTVOCO325 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO325 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCO326 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[8]"));
                if (webElementTVOCO326 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "灌云县区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO326.click();
                    //  WebElement webElementTVOCO327 =;//保留代码
                    WebElement webElementTVOCO328 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO328 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "灌云县筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "灌云县筛选结果失败");
                    }
                }
                Thread.sleep(1000);
                WebElement webElementTVOCO329 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[2]/div/span[9]"));
                if (webElementTVOCO329 == null) {
                    log.info(ceshiyongli + TVOCzd + "O3" + "连云港经济技术开发区区县筛选按钮点击失败");
                } else {
                    Thread.sleep(1000);
                    webElementTVOCO329.click();
                    //  WebElement webElementTVOCO327 =;//保留代码
                    WebElement webElementTVOCO330 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/aside/div/div[3]/div/div[1]/div[2]/div[1]"));
                    if (webElementTVOCO330 != null) {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云港经济技术开发区筛选结果满足");
                    } else {
                        log.info(ceshiyongli + TVOCzd + "O3" + "连云港经济技术开发区筛选结果失败");
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
