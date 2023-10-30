package com.smartims.insurancepractice.insurancenow.testscenario03;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

public class SeleniumToExcel_01 {
    private static int currentColumnIndex;
    private static final String counterFilePath = "counter.properties";

    private static void incrementColumnIndex() {
        currentColumnIndex++;
        saveCounterToFile();
    }

    public static int getCurrentColumnIndex() {
        return currentColumnIndex;
    }

    public static void setCurrentColumnIndex(int newIndex) {
        currentColumnIndex = newIndex;
        saveCounterToFile();
    }

    public static String getCounterFilePath() {
        return counterFilePath;
    }

    private static void saveCounterToFile() {
        Properties properties = new Properties();
        properties.setProperty("currentColumnIndex", String.valueOf(currentColumnIndex));

        try (OutputStream outputStream = new FileOutputStream(counterFilePath)) {
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeCurrentColumnIndex() {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(counterFilePath)) {
            properties.load(fileInputStream);
            String currentIndexValue = properties.getProperty("currentColumnIndex");
            if (currentIndexValue != null) {
                currentColumnIndex = Integer.parseInt(currentIndexValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    WebElement premiumValue(ChromeDriver driver, String transaction) {
        if (transaction.equals("NewBusinessPremium")) {
            return driver.findElement(By.xpath(
                    "/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        if (transaction.equals("PolicyNumber")) {
            return driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/section[1]/div[2]/div[3]/div/div/div/div[1]/div[2]"));
        }
        if (transaction.equals("EndorsementPremium")) {
            return driver.findElement(By.xpath(
                    "/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        if (transaction.equals("RewriteNewPremium")) {
            return driver.findElement(
                    By.xpath("/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        if (transaction.equals("RenewalStartPremium")) {
            return driver.findElement(
                    By.xpath("/html/body/main/form/div[1]/div/div[4]/div/div[3]/div[4]/div/div/div/table/tbody/tr[2]/td[7]"));
        }
        return null;


    }

    public void premium(ChromeDriver driver, String transaction) throws IOException {
        initializeCurrentColumnIndex(); // Initialize the currentColumnIndex from the properties file
        System.out.println("currentColumnIndex at the beginning: " + currentColumnIndex);

        FileInputStream fis = new FileInputStream(new File("INOW Automation Data Sheet.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);
        String SheetName = "PremiumValues";
        Sheet sheet = workbook.getSheet(SheetName);
        WebElement data = this.premiumValue(driver, transaction);
        String capturedData = data.getText();
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell != null && cell.getCellType() == CellType.STRING
                        && cell.getStringCellValue().equals(transaction)) {
                    int columnIndex = cell.getColumnIndex();
                    Cell dataCell = row.createCell(columnIndex + currentColumnIndex);
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

    // Add this method to increment the counter after all transactions finish execution
    public static void incrementCounterAfterAllTransactions() {
        incrementColumnIndex();
        System.out.println("currentColumnIndex after increment: " + currentColumnIndex);
    }
}
