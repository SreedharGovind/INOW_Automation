package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.voClasses.RewriteNewVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RewriteNew_03 {
    void getRewriteNew(ChromeDriver driver) throws IOException, InterruptedException, AWTException {
        Actions actions = new Actions(driver);
        RewriteNewVO rw = new RewriteNewVO();
        rw.setRewriteNewEffectiveDate(ExcelUtils_03.getCellValueByLabel("rewriteNewEffectiveDate"));
        rw.setRewriteNewPaymentType(ExcelUtils_03.getCellValueByLabel("rewriteNewPaymentType"));
        SeleniumToExcel_03 se = new SeleniumToExcel_03();
//        driver.findElement(By.id(ConstantClass_02.rewriteNewToolbarSearchText)).sendKeys("PA0000051-01");
//        driver.findElement(By.id(ConstantClass_02.rewriteNewToolbarSearch)).click();
        driver.findElement(By.xpath(ConstantClass_02.rewriteNewTransaction)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewTransactionCd)).sendKeys("Rewrite-New");
        driver.findElement(By.id(ConstantClass_02.rewriteNewSelect)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewTransactionEffectiveDt)).sendKeys("01/02/2024");
//        driver.findElement(By.id("TransactionShortDescription")).sendKeys("Rewrite - New Business");
//        driver.findElement(By.id(ConstantClass_02.rewriteNewTransactionLongDescription)).sendKeys("Rewrite");
        driver.findElement(By.id(ConstantClass_02.rewriteNewStart)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewStart)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewUnderwriting)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewSave)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewReview)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewWizard_ReviewBasicPolicyPayPlanCd_1)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewCloseout)).click();
        driver.findElement(By.id(ConstantClass_02.rewriteNewTransactionInfoPaymentTypeCd)).sendKeys("None");
        driver.findElement(By.id(ConstantClass_02.rewriteNewProcess)).click();
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
        se.premium(driver, "RewriteNewPremium");


    }
}
