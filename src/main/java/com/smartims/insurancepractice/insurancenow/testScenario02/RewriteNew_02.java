package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.RewriteNewVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class RewriteNew_02 {
    void rewriteNew_02(ChromeDriver driver, Actions actions) throws IOException {
        RewriteNewVO rnvo = new RewriteNewVO();
        rnvo.setRewriteNewPaymentType(ExcelUtils_02.getCellValueByLabel("rewriteNewPaymentType"));
        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000024-01");
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByVisibleText("Rewrite-New");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
        driver.findElement(By.id(ConstantsClass.saveButton)).click();
        driver.findElement(By.id(ConstantsClass.payplanTabWizardReview)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessPayPlans)).click();
        driver.findElement(By.id(ConstantsClass.finishButton)).click();
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(rnvo.getRewriteNewPaymentType());
        driver.findElement(By.xpath(ConstantsClass.process)).click();

    }
}
