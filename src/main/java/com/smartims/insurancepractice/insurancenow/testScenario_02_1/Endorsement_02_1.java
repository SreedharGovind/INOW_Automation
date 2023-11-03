package com.smartims.insurancepractice.insurancenow.testScenario_02_1;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.EndorsementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Endorsement_02_1 {
    void endorsement_02(ChromeDriver driver, Actions actions) throws IOException, InterruptedException, AWTException {
        EndorsementVO evo = new EndorsementVO();
        evo.setEndorsementEffectiveDate(ExcelUtils_02_1.getCellValueByLabel("endorsementEffectiveDate"));
        evo.setEndorsementDriver1FirstName(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1FirstName"));
        evo.setEndorsementDriver1LastName(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1LastName"));
        evo.setEndorsementDriver1BirthDate(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1BirthDate"));
        evo.setEndorsementDriver1RelationshipToInsured(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1RelationshipToInsured"));
        evo.setEndorsementDriver1DriverStatus(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1DriverStatus"));
        evo.setEndorsementDriver1Gender(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1Gender"));
        evo.setEndorsementDriver1MaritalStatus(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1MaritalStatus"));
        evo.setEndorsementDriver1DateLicensed(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1DateLicensed"));
        evo.setEndorsementDriver1LicenseState(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1LicenseState"));
        evo.setEndorsementDriver1LicenseNumber(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1LicenseNumber"));
        evo.setEndorsementDriver1DriversLicenseStatus(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1DriversLicenseStatus"));
        evo.setEndorsementDriver1SR22(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1SR22"));
        evo.setEndorsementDriver1OccupationStatus(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1OccupationStatus"));

        evo.setEndorsementDriver2FirstName(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2FirstName"));
        evo.setEndorsementDriver2LastName(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2LastName"));
        evo.setEndorsementDriver2BirthDate(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2BirthDate"));
        evo.setEndorsementDriver2RelationshipToInsured(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2RelationshipToInsured"));
        evo.setEndorsementDriver2DriverStatus(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2DriverStatus"));
        evo.setEndorsementDriver2Gender(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2Gender"));
        evo.setEndorsementDriver2MaritalStatus(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2MaritalStatus"));
        evo.setEndorsementDriver2DateLicensed(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2DateLicensed"));
        evo.setEndorsementDriver2LicenseState(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2LicenseState"));
        evo.setEndorsementDriver2LicenseNumber(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2LicenseNumber"));
        evo.setEndorsementDriver2DriversLicenseStatus(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2DriversLicenseStatus"));
        evo.setEndorsementDriver2SR22(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2SR22"));
        evo.setEndorsementDriver2OccupationStatus(
                ExcelUtils_02_1.getCellValueByLabel("endorsementDriver2OccupationStatus"));

        evo.setEndorsementDriver1Address(ExcelUtils_02_1.getCellValueByLabel("endorsementDriver1Address"));

        evo.setEndorsementVehicle1VIN(ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1VIN"));
        evo.setEndorsementVehicle1Use(ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1Use"));
        evo.setEndorsementVehicle1PurchasedOrLeased(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1PurchasedOrLeased"));
        evo.setEndorsementVehicle1OtherThanCollisionDeductible(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1OtherThanCollisionDeductible"));
        evo.setEndorsementVehicle1CollisionDeductible(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1CollisionDeductible"));
        evo.setEndorsementVehicle1RentalReimbursement(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1RentalReimbursement"));
        evo.setEndorsementVehicle1TowingAndLabor(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1TowingAndLabor"));
        evo.setEndorsementVehicle1SpecialEquipment(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle1SpecialEquipment"));

        evo.setEndorsementVehicle2VIN(ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2VIN"));
        evo.setEndorsementVehicle2Use(ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2Use"));
        evo.setEndorsementVehicle2PurchasedOrLeased(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2PurchasedOrLeased"));
        evo.setEndorsementVehicle2OtherThanCollisionDeductible(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2OtherThanCollisionDeductible"));
        evo.setEndorsementVehicle2CollisionDeductible(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2CollisionDeductible"));
        evo.setEndorsementVehicle2RentalReimbursement(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2RentalReimbursement"));
        evo.setEndorsementVehicle2TowingAndLabor(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2TowingAndLabor"));
        evo.setEndorsementVehicle2SpecialEquipment(
                ExcelUtils_02_1.getCellValueByLabel("endorsementVehicle2SpecialEquipment"));

        evo.setEndorsementAICode(ExcelUtils_02_1.getCellValueByLabel("endorsementAICode"));
        evo.setEndorsementAIInterestType(ExcelUtils_02_1.getCellValueByLabel("endorsementAIInterestType"));
        evo.setDriver1Delete(ExcelUtils_02_1.getCellValueByLabel("driver1Delete"));
        evo.setDriver2Delete(ExcelUtils_02_1.getCellValueByLabel("driver2Delete"));
        evo.setDriver3Delete(ExcelUtils_02_1.getCellValueByLabel("driver3Delete"));
        evo.setVehicle1Delete(ExcelUtils_02_1.getCellValueByLabel("vehicle1Delete"));
        evo.setVehicle2Delete(ExcelUtils_02_1.getCellValueByLabel("vehicle2Delete"));
        evo.setVehicle3Delete(ExcelUtils_02_1.getCellValueByLabel("vehicle3Delete"));

        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();
        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000072-01");
        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
        Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
        transaction.selectByValue("Endorsement");
        driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
        driver.findElement(By.xpath(ConstantsClass.endorsementEffDate)).sendKeys(evo.getEndorsementEffectiveDate());
        driver.findElement(By.xpath(ConstantsClass.startButton)).sendKeys(Keys.ENTER, Keys.ENTER);
        driver.findElement(By.id(ConstantsClass.wizardDriversSidebarButton)).click();

        boolean driver1licenseNumber = evo.getEndorsementDriver1LicenseNumber().isBlank();
        if (driver1licenseNumber) {
        } else {
            driver.findElement(By.id(ConstantsClass.sideBarAddDriverNavigateDriverParty)).click();
            driver.findElement(By.id(ConstantsClass.endorsementDriver1FirstName))
                    .sendKeys(evo.getEndorsementDriver1FirstName());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LastName))
                    .sendKeys(evo.getEndorsementDriver1LastName());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1RelationshipToInsured))
                    .sendKeys(evo.getEndorsementDriver1RelationshipToInsured());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DriverStatus))
                    .sendKeys(evo.getEndorsementDriver1DriverStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1BirthDate))
                    .sendKeys(evo.getEndorsementDriver1BirthDate());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1Gender))
                    .sendKeys(evo.getEndorsementDriver1Gender());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1MaritalStatus))
                    .sendKeys(evo.getEndorsementDriver1MaritalStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DateLicensed))
                    .sendKeys(evo.getEndorsementDriver1DateLicensed());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseState))
                    .sendKeys(evo.getEndorsementDriver1LicenseState());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseNumber))
                    .sendKeys(evo.getEndorsementDriver1LicenseNumber());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DriversLicenseStatus))
                    .sendKeys(evo.getEndorsementDriver1DriversLicenseStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1SR22)).sendKeys(evo.getEndorsementDriver1SR22());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1OccupationStatus))
                    .sendKeys(evo.getEndorsementDriver1OccupationStatus());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }
        boolean driver2licenseNumber = evo.getEndorsementDriver2LicenseNumber().isBlank();
        if (driver2licenseNumber) {
        } else {
            driver.findElement(By.id(ConstantsClass.sideBarAddDriverNavigateDriverParty)).click();
            driver.findElement(By.id(ConstantsClass.endorsementDriver1FirstName))
                    .sendKeys(evo.getEndorsementDriver1FirstName());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LastName))
                    .sendKeys(evo.getEndorsementDriver1LastName());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1RelationshipToInsured))
                    .sendKeys(evo.getEndorsementDriver1RelationshipToInsured());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DriverStatus))
                    .sendKeys(evo.getEndorsementDriver1DriverStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1BirthDate))
                    .sendKeys(evo.getEndorsementDriver1BirthDate());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1Gender))
                    .sendKeys(evo.getEndorsementDriver1Gender());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1MaritalStatus))
                    .sendKeys(evo.getEndorsementDriver1MaritalStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DateLicensed))
                    .sendKeys(evo.getEndorsementDriver1DateLicensed());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseState))
                    .sendKeys(evo.getEndorsementDriver1LicenseState());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseNumber))
                    .sendKeys(evo.getEndorsementDriver1LicenseNumber());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1DriversLicenseStatus))
                    .sendKeys(evo.getEndorsementDriver1DriversLicenseStatus());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1SR22)).sendKeys(evo.getEndorsementDriver1SR22());
            driver.findElement(By.id(ConstantsClass.endorsementDriver1OccupationStatus))
                    .sendKeys(evo.getEndorsementDriver1OccupationStatus());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }

        boolean driver1Delete = evo.getDriver1Delete().isBlank();
        if (driver1Delete != true) {
            String driver1 = evo.getDriver1Delete();
            if (driver1 != null && driver1.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardDriversSidebarButton)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink1)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
        }
        boolean driver2Delete = evo.getDriver2Delete().isBlank();
        if (driver2Delete != true) {
            String driver2 = evo.getDriver2Delete();
            if (driver2 != null && driver2.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardDriversSidebarButton)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink2)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
        }
        boolean driver3Delete = evo.getDriver3Delete().isBlank();
        if (driver3Delete != true) {
            String driver3 = evo.getDriver3Delete();
            if (driver3 != null && driver3.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardDriversSidebarButton)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink3)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
        }

        boolean vehicle1VIN = evo.getEndorsementVehicle1VIN().isBlank();
        if (vehicle1VIN) {
        } else {
            driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(evo.getEndorsementVehicle1VIN());
            driver.findElement(By.id(ConstantsClass.validateVin)).click();
            Thread.sleep(7000);
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(evo.getEndorsementVehicle1Use());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased))
                    .sendKeys(evo.getEndorsementVehicle1PurchasedOrLeased());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible))
                    .sendKeys(evo.getEndorsementVehicle1OtherThanCollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                    .sendKeys(evo.getEndorsementVehicle1CollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement))
                    .sendKeys(evo.getEndorsementVehicle1RentalReimbursement());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor))
                    .sendKeys(evo.getEndorsementVehicle1TowingAndLabor());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment))
                    .sendKeys(evo.getEndorsementVehicle1SpecialEquipment());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }
        boolean vehicle2VIN = evo.getEndorsementVehicle2VIN().isBlank();
        if (vehicle2VIN) {
        } else {
            driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(evo.getEndorsementVehicle2VIN());
            driver.findElement(By.id(ConstantsClass.validateVin)).click();
            Thread.sleep(7000);
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(evo.getEndorsementVehicle2Use());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased))
                    .sendKeys(evo.getEndorsementVehicle2PurchasedOrLeased());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible))
                    .sendKeys(evo.getEndorsementVehicle2OtherThanCollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                    .sendKeys(evo.getEndorsementVehicle2CollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement))
                    .sendKeys(evo.getEndorsementVehicle2RentalReimbursement());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor))
                    .sendKeys(evo.getEndorsementVehicle2TowingAndLabor());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment))
                    .sendKeys(evo.getEndorsementVehicle2SpecialEquipment());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }

        boolean Vehicle1Delete = evo.getVehicle1Delete().isBlank();
        if (Vehicle1Delete != true) {
            String Vehicle1 = evo.getVehicle1Delete();
            if (Vehicle1 != null && Vehicle1.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardVehicle)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink1)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
        }
        boolean Vehicle2Delete = evo.getVehicle2Delete().isBlank();
        if (Vehicle2Delete != true) {
            String Vehicle2 = evo.getVehicle2Delete();
            if (Vehicle2 != null && Vehicle2.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardVehicle)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink2)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
        }
        boolean Vehicle3Delete = evo.getVehicle3Delete().isBlank();
        if (Vehicle3Delete != true) {
            String Vehicle3 = evo.getVehicle3Delete();
            if (Vehicle3 != null && Vehicle3.equalsIgnoreCase("Delete")) {
                driver.findElement(By.id(ConstantsClass.wizardVehicle)).click();
                driver.findElement(By.id(ConstantsClass.driver_vehicleDeleteLink3)).click();
                driver.findElement(By.xpath(ConstantsClass.confirmDeleteButton)).click();
            }
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

    }
}
