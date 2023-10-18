package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.testScenario01.Constants_03;
import com.smartims.insurancepractice.insurancenow.voClasses.CancellationNoticeVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class CancellationNotice_03 {
    public void getcancellationNotice(ChromeDriver driver) throws IOException, InterruptedException {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CancellationNoticeVO cno = new CancellationNoticeVO();
        cno.setCancellationNoticeNoticeDate(ExcelUtils_03.getCellValueByLabel("cancellationNoticeNoticeDate"));
        cno.setCancellationNoticeCancellationType(ExcelUtils_03.getCellValueByLabel("cancellationNoticeCancellationType"));
        cno.setCancellationNoticeAdditionalNoticeText(ExcelUtils_03.getCellValueByLabel("cancellationNoticeAdditionalNoticeText"));
        cno.setCancellationNoticeReason(ExcelUtils_03.getCellValueByLabel("cancellationNoticeReason"));
        cno.setCancellationNoticeStartTransaction(ExcelUtils_03.getCellValueByLabel("cancellationNoticeStartTransaction"));
        cno.setCancellationNoticeEffectiveDate(ExcelUtils_03.getCellValueByLabel("cancellationNoticeEffectiveDate"));
        cno.setCancellationNoticeDescription(ExcelUtils_03.getCellValueByLabel("cancellationNoticeDescription"));

//        WebElement policyTab = driver.findElement(By.xpath(Constants_03.policySearchTab));
//        actions.moveToElement(policyTab).perform();
//        policyTab.click();
//        driver.findElement(By.xpath(Constants_03.policyNumberTextField)).sendKeys("PA0000073-01");
//        WebElement searchButton = driver.findElement(By.xpath(Constants_03.searchButton));
//        actions.moveToElement(searchButton).perform();
//        searchButton.click();
        driver.findElement(By.xpath(Constants_03.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(Constants_03.startNewTransaction)));
        transaction.selectByValue("Cancellation Notice");
        driver.findElement(By.xpath(Constants_03.selectButton)).click();
        driver.findElement(By.xpath(Constants_03.cancellationNoticeDate)).sendKeys(cno.getCancellationNoticeNoticeDate(), Keys.TAB);
        driver.findElement(By.xpath(Constants_03.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(Constants_03.cancellationType)));
        cancellationType.selectByValue("Company");
        driver.findElement(By.id(Constants_03.cancellationReason)).click();
        Select cancellationReason= new Select(driver.findElement(By.id(Constants_03.cancellationReason)));
        cancellationReason.selectByValue("UnacceptableRisk");
        driver.findElement(By.id(Constants_03.cancellationReasonADD)).click();
        driver.findElement(By.xpath(Constants_03.additionalNoticeText)).sendKeys(cno.getCancellationNoticeAdditionalNoticeText(), Keys.TAB);
        driver.findElement(By.xpath(Constants_03.startButton)).click();
        driver.findElement(By.xpath(Constants_03.processButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ContextMenuHistoryActions_1_3")).click();
// driver.findElement(By.id("ContextMenuHistoryActions_1_3")).click();
        WebElement select = driver.findElement(By.id("ContextMenuHistoryActions_1_3"));
        actions.moveToElement(select).perform();
        driver.findElement(By.id("NoticeCancel_1_3")).click();
        driver.findElement(By.id("TransactionLongDescription")).sendKeys("Text");
        driver.findElement(By.id("Start")).click();
        driver.findElement(By.id("Process")).click();
    }
}





