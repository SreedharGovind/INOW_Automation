package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.commonClasses.ExcelUtilsCredentials;
import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import com.smartims.insurancepractice.insurancenow.voClasses.ReinstatementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class Reinstatement_02 {
        void reinstatement_02(ChromeDriver driver, Actions actions) throws IOException {
        ReinstatementVO rvo = new ReinstatementVO();
        rvo.setReinstatementAdditionalNoticeText(
                ExcelUtils_02.getCellValueByLabel("reinstatementAdditionalNoticeText"));
        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000024-01");
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

    }
}
