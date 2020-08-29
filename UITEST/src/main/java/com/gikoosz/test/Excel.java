package com.gikoosz.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.*;

public class Excel {
    public static void main(String[] args) throws IOException {
        readExcel();
    }
    public static List<List<String>> readExcel() throws IOException {

        FileInputStream wendang = new FileInputStream("F://UITEST//Config//test.xls");
        List<List<String>> result = new ArrayList<List<String>>();
        HSSFWorkbook excelWj = new HSSFWorkbook(wendang);
        HSSFSheet sheet=excelWj.getSheetAt(0);
        for(int rowNum=0;rowNum<=sheet.getLastRowNum();rowNum++){
            HSSFRow hssfRow = sheet.getRow(rowNum);
            int minCell=hssfRow.getFirstCellNum();
            int maxCell=hssfRow.getLastCellNum();
            System.out.println("最大单元格是什么"+maxCell);
            List<String> cellList = new ArrayList<String>();
            for(int cellZB=minCell;cellZB<maxCell;cellZB++){
                HSSFCell cell = hssfRow.getCell(cellZB);
                if(cell==null){
                    System.out.println("单元格没有值");
                    continue;
                }
                else
                {
                    System.out.println("我是第"+rowNum+"行"+"我是第"+cellZB+"列"+"我的值是"+cell.toString());
                }
                cellList.add(cell.toString());
            }
            result.add(cellList);
        }
      return result;

    }
}
