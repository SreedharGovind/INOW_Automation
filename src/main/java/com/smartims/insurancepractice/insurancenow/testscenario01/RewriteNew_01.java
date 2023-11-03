package com.smartims.insurancepractice.insurancenow.testscenario01;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.RewriteNewVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RewriteNew_01 {
    void getRewriteNew(ChromeDriver driver) throws IOException, InterruptedException, AWTException {
        Actions actions = new Actions(driver);
        RewriteNewVO rw = new RewriteNewVO();
        rw.setRewriteNewEffectiveDate(ExcelUtils_01.getCellValueByLabel("rewriteNewEffectiveDate"));
        rw.setRewriteNewPaymentType(ExcelUtils_01.getCellValueByLabel("rewriteNewPaymentType"));
        SeleniumToExcel_01 se = new SeleniumToExcel_01();
//        driver.findElement(By.id(ConstantsClass.rewriteNewToolbarSearchText)).sendKeys("PA0000051-01");
//        driver.findElement(By.id(ConstantsClass.rewriteNewToolbarSearch)).click();
        driver.findElement(By.xpath(ConstantsClass.rewriteNewTransaction)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewTransactionCd)).sendKeys("Rewrite-New");
        driver.findElement(By.id(ConstantsClass.rewriteNewSelect)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewTransactionEffectiveDt)).sendKeys("01/02/2024");
//        driver.findElement(By.id("TransactionShortDescription")).sendKeys("Rewrite - New Business");
//        driver.findElement(By.id(ConstantsClass.rewriteNewTransactionLongDescription)).sendKeys("Rewrite");
        driver.findElement(By.id(ConstantsClass.rewriteNewStart)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewStart)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewUnderwriting)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewSave)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewReview)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewWizard_ReviewBasicPolicyPayPlanCd_1)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewCloseout)).click();
        driver.findElement(By.id(ConstantsClass.rewriteNewTransactionInfoPaymentTypeCd)).sendKeys("None");
        driver.findElement(By.id(ConstantsClass.rewriteNewProcess)).click();
        Robot robot = new Robot();
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_SHIFT); //press shift
        robot.keyPress(KeyEvent.VK_TAB); // Press tab key
        Robot robot1 = new Robot();
        Thread.sleep(20000);
        robot1.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot1.keyPress(KeyEvent.VK_SHIFT); //press shift
        robot1.keyPress(KeyEvent.VK_TAB); // Press tab key
        robot1.keyRelease(KeyEvent.VK_CONTROL); // Press CTRL key
        robot1.keyRelease(KeyEvent.VK_SHIFT); //press shift
        robot1.keyRelease(KeyEvent.VK_TAB); // Press tab key
        se.premium(driver, "RewriteNew Premium_TS01");
    }
}
