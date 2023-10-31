package com.smartims.insurancepractice.insurancenow.testScenario02;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeleniumToExcel_02 {

    WebElement premiumValue(ChromeDriver driver, String transaction) {

        if (transaction == "NewBusinessPolicyNumber") {
            return driver.findElement(By.id("PolicySummary_PolicyNumber"));
        }
        if (transaction == "NewBusiness Premium") {
            return driver.findElement(By.id("PolicySummary_PremWithTaxesFeesAmt"));
        }
        if (transaction == "Endorsement Premium") {
            return driver.findElement(By.id("PolicySummary_PremWithTaxesFeesAmt"));
        }
        if (transaction == "Cancellation Premium") {
            return driver.findElement(By.id("PolicySummary_PremWithTaxesFeesAmt"));
        }
        if (transaction == "Reinstatement Premium") {
            return driver.findElement(By.id("PolicySummary_PremWithTaxesFeesAmt"));
        }
        if (transaction == "RewriteNew Premium") {
            return driver.findElement(By.id("PolicySummary_PremWithTaxesFeesAmt"));
        }
        return null;
    }

    public void premium(ChromeDriver driver, String transaction) throws IOException {

        FileInputStream fis = new FileInputStream(new File("INOW Automation Data Sheet.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("PolicyNumber&Premium");
        WebElement data = this.premiumValue(driver, transaction);
        String capturedData = data.getText();
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell != null && cell.getCellType() == CellType.STRING
                        && cell.getStringCellValue().equals(transaction)) {
                    int columnIndex = cell.getColumnIndex();
                    Cell dataCell = row.createCell(columnIndex + 1);
                    dataCell.setCellValue(capturedData);
                    System.out.println(capturedData);

                    break;
                }
            }
        }

        FileOutputStream fos = new FileOutputStream(new File("INOW Automation Data Sheet.xlsx"));
        workbook.write(fos);
        fos.close();

    }

}
