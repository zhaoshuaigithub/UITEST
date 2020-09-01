package com.gikoosz.util;

import java.io.File;

public class WenjianBidui {
    //C:\Users\Administrator\Downloads
    public   static boolean wenjianBidui(String path,String name){
        Boolean fanhuizhi =false;
        File wenjian = new File(path);
        File[] files =   wenjian.listFiles();
        for(File file:files){
            if(file.isFile()){
               if(file.getName().contains(name)){
                   return true;
               }
            }
        }
        return fanhuizhi;
    }
}
