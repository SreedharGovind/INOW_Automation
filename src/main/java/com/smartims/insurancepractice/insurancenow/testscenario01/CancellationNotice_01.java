package com.smartims.insurancepractice.insurancenow.testscenario01;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.testScenario02.SeleniumToExcel_02;
import com.smartims.insurancepractice.insurancenow.voClasses.CancellationNoticeVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class CancellationNotice_01 {
    public void getcancellationNotice(ChromeDriver driver) throws IOException, InterruptedException {
        Actions actions = new Actions(driver);
        SeleniumToExcel_01 se = new SeleniumToExcel_01();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CancellationNoticeVO cno = new CancellationNoticeVO();
        cno.setCancellationNoticeNoticeDate(ExcelUtils_01.getCellValueByLabel("cancellationNoticeNoticeDate"));
        cno.setCancellationNoticeCancellationType(ExcelUtils_01.getCellValueByLabel("cancellationNoticeCancellationType"));
        cno.setCancellationNoticeAdditionalNoticeText(ExcelUtils_01.getCellValueByLabel("cancellationNoticeAdditionalNoticeText"));
        cno.setCancellationNoticeReason(ExcelUtils_01.getCellValueByLabel("cancellationNoticeReason"));
        cno.setCancellationNoticeStartTransaction(ExcelUtils_01.getCellValueByLabel("cancellationNoticeStartTransaction"));
        cno.setCancellationNoticeEffectiveDate(ExcelUtils_01.getCellValueByLabel("cancellationNoticeEffectiveDate"));
        cno.setCancellationNoticeDescription(ExcelUtils_01.getCellValueByLabel("cancellationNoticeDescription"));
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Cancellation Notice");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.cancellationNoticeDate)).sendKeys(cno.getCancellationNoticeNoticeDate(), Keys.TAB);
        driver.findElement(By.xpath(ConstantsClass.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(ConstantsClass.cancellationType)));
        cancellationType.selectByValue("Company");
        driver.findElement(By.id(ConstantsClass.cancellationReason)).click();
        Select cancellationReason= new Select(driver.findElement(By.id(ConstantsClass.cancellationReason)));
        cancellationReason.selectByValue("UnacceptableRisk");
        driver.findElement(By.id(ConstantsClass.cancellationReasonADD)).click();
        driver.findElement(By.xpath(ConstantsClass.additionalNoticeText)).sendKeys(cno.getCancellationNoticeAdditionalNoticeText(), Keys.TAB);
        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.xpath(ConstantsClass.processButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ContextMenuHistoryActions_1_3")).click();
// driver.findElement(By.id("ContextMenuHistoryActions_1_3")).click();
        WebElement select = driver.findElement(By.id("ContextMenuHistoryActions_1_3"));
        actions.moveToElement(select).perform();
        driver.findElement(By.id("NoticeCancel_1_3")).click();
        driver.findElement(By.id("TransactionLongDescription")).sendKeys("Text");
        driver.findElement(By.id("Start")).click();
        driver.findElement(By.id("Process")).click();
        se.premium(driver, "Cancellation Premium");
    }
}





