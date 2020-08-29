package com.gikoosz.util;
//import com.gikoosz.util.SeleniumApi;
//import java.io.File;
//import java.net.URI;
//import java.net.URL;
//import java.util.Properties;
//
//public class Config {
//    public static Properties properties =null;
//    private static URL cfgFileUrl=null;
//   // private static  final  ESB_CLIENT_PROP="selenium.properties";
//    static {
//        init();
//    }
//    public  Config(){
//
//    }
//    public  static  void init(){
//        try{
//            load();
//        }catch (Exception var1){}
//
//    }
//    public static  void refresh(){
//        init();
//    }
//    public static  void load(){
//        try {
//            cfgFileUrl = null;
//            String e = SeleniumApi.getPath().replace("/bin","")+"Config/"+"selenium.properties";
//            System.out.println("路径："+e.toString());
//            if(e!=null && !"".equals(e)){
//                File cfgFile= new File(e);
//                if(cfgFile.exists()){
//                    cfgFileUrl = cfgFile.toURL();
//                }
//            }
//            if(cfgFileUrl==null){
//                cfgFileUrl=Config.class.getResource("/selenium.properties");
//            }
//            properties = new Properties();
//            if(cfgFileUrl!=null){
//                properties.load(cfgFileUrl.openStream());
//            }
//
//        }catch (Exception var2){
//            var2.printStackTrace();
//        }
//    }
//    public static  String getUrlProperties(String key){
//        String property=properties.getProperty(key);
//        return property;
//    }
//    private static  void setUrlProperties(String propertyName,String value){
//        properties.setProperty(propertyName,value);
//    }
//}
import java.io.File;
import java.net.URL;
import java.util.Properties;

public class Config {
    public static Properties properties = null;
    private static URL cfgFileUrl = null;
    private static final String ESB_CLIENT_PROP = "selenium.properties";

    static {
        init();
    }

    public Config() {
    }

    public static void init() {
        try {
            load();
        } catch (Exception var1) {
        }

    }

    public static void refresh() {
        init();
    }

    private static void load() {
        try {
            cfgFileUrl = null;
            String e = SeleniumApi.getPath().replace("/bin", "") + "/Config/" + "selenium.properties";
            if (e != null && !"".equals(e)) {
                File cfgFile = new File(e);
                if (cfgFile.exists()) {
                    cfgFileUrl = cfgFile.toURL();
                }
            }

            if (cfgFileUrl == null) {
                cfgFileUrl = Config.class.getResource("/selenium.properties");
            }

            properties = new Properties();
            if (cfgFileUrl != null) {
                properties.load(cfgFileUrl.openStream());
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public static String getUrlProperty(String key) {
        String property = properties.getProperty(key);
        return property;
    }

    public static void setUrlProperty(String propertyName, String value) {
        properties.setProperty(propertyName, value);
    }
}