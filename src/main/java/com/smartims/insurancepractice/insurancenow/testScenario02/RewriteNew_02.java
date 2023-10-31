package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import com.smartims.insurancepractice.insurancenow.voClasses.RewriteNewVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RewriteNew_02 {
    void rewriteNew_02(ChromeDriver driver, Actions actions) throws IOException, InterruptedException, AWTException {
        RewriteNewVO rnvo = new RewriteNewVO();
        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();
        NewBusinessVO nvo = new NewBusinessVO();
        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));
        rnvo.setRewriteNewPaymentType(ExcelUtils_02.getCellValueByLabel("rewriteNewPaymentType"));
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
        Robot robot = new Robot();
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_SHIFT); // press shift
        robot.keyPress(KeyEvent.VK_TAB); // Press tab key
        Thread.sleep(20000);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_SHIFT); // press shift
        robot.keyPress(KeyEvent.VK_TAB); // Press tab key
        Thread.sleep(20000);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        seleniumToExcel.premium(driver, "RewriteNew Premium");

    }
}
