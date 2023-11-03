package com.smartims.insurancepractice.insurancenow.testScenario_02_1;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import com.smartims.insurancepractice.insurancenow.voClasses.ReinstatementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Reinstatement_02_1 {
    void reinstatement_02(ChromeDriver driver, Actions actions) throws IOException {
        ReinstatementVO rvo = new ReinstatementVO();
        SeleniumToExcel_02_1 seleniumToExcel = new SeleniumToExcel_02_1();
        NewBusinessVO nvo = new NewBusinessVO();
//        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));
        rvo.setReinstatementAdditionalNoticeText(
                ExcelUtils_02_1.getCellValueByLabel("reinstatementAdditionalNoticeText"));

        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByVisibleText("Reinstatement");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.additionalNoticeText))
                .sendKeys(rvo.getReinstatementAdditionalNoticeText());
        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.xpath(ConstantsClass.processButton)).click();
        seleniumToExcel.premium(driver, "Reinstatement Premium_TS02");

    }
}
