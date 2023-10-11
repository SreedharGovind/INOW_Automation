package com.smartims.insurancepractice.insurancenow.testScenario01;


import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils_01 {

    public static String getCellValueByLabel(String label) throws IOException {
        // Create a new Excel workbook and sheet

        String filepath = "INOW Automation Data Sheet.xlsx";

        FileInputStream file = new FileInputStream(new File(filepath));
        String sheetName = "TS_01";

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

