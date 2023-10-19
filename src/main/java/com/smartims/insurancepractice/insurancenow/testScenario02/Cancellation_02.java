package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.CancellationVO;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Cancellation_02 {
    void cancellation_02(ChromeDriver driver, Actions actions) throws IOException {
        CancellationVO cancelVO = new CancellationVO();
        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();
        NewBusinessVO nvo = new NewBusinessVO();
        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));

        cancelVO.setCancellationNoticeDate(ExcelUtils_02.getCellValueByLabel("cancellationNoticeDate"));
        cancelVO.setCancellationCancellationType(ExcelUtils_02.getCellValueByLabel("cancellationCancellationType"));
        cancelVO.setCancellationReason(ExcelUtils_02.getCellValueByLabel("cancellationReason"));
        cancelVO.setCancellationEffectiveDate(ExcelUtils_02.getCellValueByLabel("cancellationEffectiveDate"));
        cancelVO.setCancellationType(ExcelUtils_02.getCellValueByLabel("cancellationType"));
        cancelVO.setCancellationAdditionalNoticeText(
                ExcelUtils_02.getCellValueByLabel("cancellationAdditionalNoticeText"));

        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys(nvo.getNewBusinessPolicyNumber());
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Cancellation");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.cancellationNoticeDate))
                .sendKeys(cancelVO.getCancellationNoticeDate());
        driver.findElement(By.xpath(ConstantsClass.cancellationType)).click();
        Select cancellationType = new Select(driver.findElement(By.xpath(ConstantsClass.cancellationType)));
        cancellationType.selectByVisibleText(cancelVO.getCancellationCancellationType());
        Select cancellationReason = new Select(driver.findElement(By.id(ConstantsClass.cancellationReason)));
        cancellationReason.selectByVisibleText(cancelVO.getCancellationReason());
        driver.findElement(By.id(ConstantsClass.cancellationReasonAdd)).click();
        driver.findElement(By.xpath(ConstantsClass.additionalNoticeText))
                .sendKeys(cancelVO.getCancellationAdditionalNoticeText());
        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.xpath(ConstantsClass.processButton)).click();
        seleniumToExcel.premium(driver, "Cancellation Premium");
    }
}
