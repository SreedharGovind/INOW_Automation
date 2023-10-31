package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import com.smartims.insurancepractice.insurancenow.voClasses.RenewalStartVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class RenewalStart_02 {
    void renewalStart_02(ChromeDriver driver, Actions actions) throws IOException {
        RenewalStartVO rsvo = new RenewalStartVO();
        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();
        NewBusinessVO nvo = new NewBusinessVO();
        rsvo.setRenewalStartAdditionalDeclarationText(ExcelUtils_02.getCellValueByLabel("renewalStartAdditionalDeclarationText"));
        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByVisibleText("Renewal Start");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartTransactionLongDescription)).sendKeys(rsvo.getRenewalStartAdditionalDeclarationText());
        driver.findElement(By.id(ConstantsClass.renewalStart)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartFinesh)).click();
        driver.findElement(By.id(ConstantsClass.renewalStartProcess)).click();
        seleniumToExcel.premium(driver, "RenewalStart Premium");
    }
}
