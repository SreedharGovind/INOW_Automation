package com.smartims.insurancepractice.insurancenow.testscenario03;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeleniumToExcel_03 {
    static int currentColumnIndex = 0;

    WebElement premiumValue(ChromeDriver driver, String transaction) {

        if (transaction.equals("NewBusinessPremium")) {
            return driver.findElement(By.xpath(
                    "/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        if (transaction.equals("PolicyNumber")) {
            return    driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/section[1]/div[2]/div[3]/div/div/div/div[1]/div[2]"));
        }

        if (transaction.equals("EndorsementPremium")) {
            return driver.findElement(By.xpath(
                    "/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }

        if (transaction.equals("RewriteNewPremium")) {
            return driver.findElement(
                    By.xpath("/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        return null;
    }

    public void premium(ChromeDriver driver, String transaction) throws IOException {

        FileInputStream fis = new FileInputStream(new File("INOW Automation Data Sheet.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);
        String SheetName="PremiumValues";
        Sheet sheet = workbook.getSheet(SheetName);

        WebElement data = this.premiumValue(driver, transaction);
        String capturedData = data.getText();
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell != null && cell.getCellType() == CellType.STRING
                        && cell.getStringCellValue().equals(transaction)) {
                    int columnIndex = cell.getColumnIndex();
                    Cell dataCell = row.createCell(columnIndex + 2);
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
