package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.RenewalStartVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;

public class RenewalStart_03 {
    public void getRenewalStart(ChromeDriver driver) throws IOException, InterruptedException, AWTException {
        RenewalStartVO rsvo = new RenewalStartVO();
        SeleniumToExcel_03 se = new SeleniumToExcel_03();
//        rsvo.setRenewalPolicyNumber(ExcelUtils_05.getCellValueByLabel("renewalPolicyNumber"));
//        rsvo.setRenewalStartDescription(ExcelUtils_05.getCellValueByLabel("renewalStartDescription"));

//        driver.findElement(By.id(ConstantsClass.renewalPolicyNumber)).sendKeys("PA0000013-01");
//        driver.findElement(By.id(ConstantsClass.renewalToolbarSearch)).click();
        driver.findElement(By.id(ConstantsClass.renewalTransaction)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartTransaction)).sendKeys("Renewal Start");
        driver.findElement(By.id(ConstantsClass.renewalStartSelect)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartTransactionLongDescription)).sendKeys("RenewalStart");
        driver.findElement(By.id(ConstantsClass.renewalStart)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartFinesh)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartProcess)).click();
        se.premium(driver, "RenewalStartPremium");

    }
}
