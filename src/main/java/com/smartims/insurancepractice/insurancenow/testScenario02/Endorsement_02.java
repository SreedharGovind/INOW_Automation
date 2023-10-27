package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.EndorsementVO;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Endorsement_02 {
    void endorsement_02(ChromeDriver driver, Actions actions) throws IOException, InterruptedException, AWTException {

        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();
        NewBusinessVO nvo = new NewBusinessVO();
        EndorsementVO evo = new EndorsementVO();
        nvo.setNewBusinessPolicyNumber(ExcelUtils_PolicyNumber.getCellValueByLabel("NewBusinessPolicyNumber"));
        evo.setEndorsementEffectiveDate(ExcelUtils_02.getCellValueByLabel("endorsementEffectiveDate"));
        evo.setEndorsementEntityType(ExcelUtils_02.getCellValueByLabel("endorsementEntityType"));
        evo.setEndorsementIndividualSuffix(ExcelUtils_02.getCellValueByLabel("endorsementIndividualSuffix"));

        evo.setEndorsementIndividualFirstJoint(ExcelUtils_02.getCellValueByLabel("endorsementIndividualFirstJoint"));
        evo.setEndorsementIndividualLastJoint(ExcelUtils_02.getCellValueByLabel("endorsementIndividualLastJoint"));
        evo.setEndorsementIndividualBirthDateJoint(
                ExcelUtils_02.getCellValueByLabel("endorsementIndividualBirthDateJoint"));
        evo.setEndorsementDriver1FirstName(ExcelUtils_02.getCellValueByLabel("endorsementDriver1FirstName"));

        evo.setEndorsementDriver1FirstName(ExcelUtils_02.getCellValueByLabel("endorsementDriver1FirstName"));
        evo.setEndorsementDriver1BirthDate(ExcelUtils_02.getCellValueByLabel("endorsementDriver1BirthDate"));
        evo.setEndorsementVehicle1CollisionDeductible(
                ExcelUtils_02.getCellValueByLabel("endorsementVehicle1CollisionDeductible"));
        evo.setEndorsementVehicle1Use(ExcelUtils_02.getCellValueByLabel("endorsementVehicle1Use"));
        evo.setEndorsementAICode(ExcelUtils_02.getCellValueByLabel("endorsementAICode"));
        evo.setEndorsementAIInterestType(ExcelUtils_02.getCellValueByLabel("endorsementAIInterestType"));

        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys(nvo.getNewBusinessPolicyNumber());
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Endorsement");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.endorsementEffDate)).sendKeys(evo.getEndorsementEffectiveDate());
        driver.findElement(By.xpath(ConstantsClass.startButton)).sendKeys(Keys.ENTER, Keys.ENTER);
        Select entityType = new Select(driver.findElement(By.xpath(ConstantsClass.entityType)));
        entityType.selectByValue(evo.getEndorsementEntityType());
        driver.findElement(By.id(ConstantsClass.endorsementIndividualSuffix))
                .sendKeys(evo.getEndorsementIndividualSuffix());
        driver.findElement(By.id(ConstantsClass.jointInsuredFirstName))
                .sendKeys(evo.getEndorsementIndividualFirstJoint());
        driver.findElement(By.id(ConstantsClass.jointInsuredLastName))
                .sendKeys(evo.getEndorsementIndividualLastJoint());
        driver.findElement(By.id(ConstantsClass.jointInsuredBirthdate))
                .sendKeys(evo.getEndorsementIndividualBirthDateJoint());
        driver.findElement(By.id(ConstantsClass.wizardDriversSidebarButton)).click();
        driver.findElement(By.id(ConstantsClass.endorsementDriver1EditLinkButton)).click();
        boolean driver1FirstName = evo.getEndorsementDriver1FirstName().isBlank();
        if (driver1FirstName) {
        } else {
            driver.findElement(By.id(ConstantsClass.endorsementNonDriver1FirstName)).clear();
            driver.findElement(By.id(ConstantsClass.endorsementNonDriver1FirstName))
                    .sendKeys(evo.getEndorsementDriver1FirstName());
        }
        boolean driver1BirthDate = evo.getEndorsementDriver1BirthDate().isBlank();
        if (driver1BirthDate) {
        } else {
            driver.findElement(By.id(ConstantsClass.endorsementNonDriver1BirthDate)).clear();
            driver.findElement(By.id(ConstantsClass.endorsementNonDriver1BirthDate))
                    .sendKeys(evo.getEndorsementDriver1BirthDate());
        }
        driver.findElement(By.id(ConstantsClass.wizardVehicle)).click();
        driver.findElement(By.id(ConstantsClass.endorsementDriver1EditLinkButton)).click();
        boolean vehicle1Use = evo.getEndorsementVehicle1Use().isBlank();
        if (vehicle1Use) {
        } else {
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(evo.getEndorsementVehicle1Use());
        }
        boolean collisionDeductible = evo.getEndorsementVehicle1CollisionDeductible().isBlank();
        if (collisionDeductible) {
        } else {
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                    .sendKeys(evo.getEndorsementVehicle1CollisionDeductible());
        }
        boolean additionalInterest = evo.getEndorsementAICode().isBlank();
        if (additionalInterest) {
        } else {
            driver.findElement(By.id(ConstantsClass.wizardAdditionalInterests)).click();
            driver.findElement(By.id(ConstantsClass.addAdditionalInterest)).click();
            driver.findElement(By.id(ConstantsClass.endorsementAICode)).sendKeys(evo.getEndorsementAICode());
            driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode)).click();
            driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode))
                    .sendKeys(evo.getEndorsementAIInterestType(), Keys.ENTER);
            driver.findElement(By.id(ConstantsClass.privatePassengerAutoCheckbox)).click();
        }
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
        driver.findElement(By.id(ConstantsClass.saveButton)).click();
        driver.findElement(By.id(ConstantsClass.finishButton)).click();
        driver.findElement(By.xpath(ConstantsClass.completeEndorsementTransactionButton)).click();
        Robot robot = new Robot();
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_SHIFT); // press shift
        robot.keyPress(KeyEvent.VK_TAB); // Press tab key
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        seleniumToExcel.premium(driver, "Endorsement Premium");

    }
}

