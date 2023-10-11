package com.smartims.insurancepractice.insurancenow.commonClasses;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtilsCredentials {
    public static String getCellValueByLabel(String label) throws IOException {
        String excelFilePath ="INOW Automation Data Sheet.xlsx";
        FileInputStream file = new FileInputStream(new File(excelFilePath));
        String sheetName = "Credentials";
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet(sheetName);
        try {
            for (Row row : sheet) {
                for (Cell cell : row) {
                    if (cell.getStringCellValue().equals(label)) {
                        String value = row.getCell(cell.getColumnIndex() + 1).getStringCellValue();
                        workbook.close();
                        return value;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            workbook.close();
            return null;
        }
        return null;
    }
}
