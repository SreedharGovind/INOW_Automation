package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import com.smartims.insurancepractice.insurancenow.voClasses.ReinstatementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Reinstatement_02 {
    void reinstatement_02(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
        ReinstatementVO rvo = new ReinstatementVO();
        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();
        NewBusinessVO nvo = new NewBusinessVO();
        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));
        rvo.setReinstatementAdditionalNoticeText(
                ExcelUtils_02.getCellValueByLabel("reinstatementAdditionalNoticeText"));
        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys(nvo.getNewBusinessPolicyNumber());
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByVisibleText("Reinstatement");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.additionalNoticeText))
                .sendKeys(rvo.getReinstatementAdditionalNoticeText());
        driver.findElement(By.xpath(ConstantsClass.startButton)).click();
        driver.findElement(By.xpath(ConstantsClass.processButton)).click();
        Thread.sleep(3000);
        seleniumToExcel.premium(driver, "Reinstatement Premium");

    }
}
