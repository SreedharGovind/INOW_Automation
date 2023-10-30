package com.smartims.insurancepractice.insurancenow.testscenario01;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.EndorsementVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Endorsement_01 {
    void getEndorsement_03(ChromeDriver driver) throws IOException, InterruptedException, AWTException {
        Actions actions = new Actions(driver);
        EndorsementVO evo = new EndorsementVO();
        SeleniumToExcel_01 se = new SeleniumToExcel_01();
        evo.setEndorsementTransactionCd(ExcelUtils_01.getCellValueByLabel("endorsementTransactionCd"));
        evo.setEndorsementEffectiveDate(ExcelUtils_01.getCellValueByLabel("endorsementEffectiveDate"));
        evo.setEndorsementMailingAddressChange(ExcelUtils_01.getCellValueByLabel("endorsementMailingAddressChange"));
        evo.setEndorsementMailingAddress(ExcelUtils_01.getCellValueByLabel("endorsementMailingAddress"));
        evo.setEndorsementMailingAddressCity(ExcelUtils_01.getCellValueByLabel("endorsementMailingAddressCity"));
        evo.setEndorsementMailingAddressState(ExcelUtils_01.getCellValueByLabel("endorsementMailingAddressState"));
        evo.setEndorsementMailingAddressZip(ExcelUtils_01.getCellValueByLabel("endorsementMailingAddressZip"));

        evo.setEndorsementChangeContantDetails(ExcelUtils_01.getCellValueByLabel("endorsementChangeContantDetails"));
        evo.setEndorsementPrimaryPhoneName(ExcelUtils_01.getCellValueByLabel("endorsementPrimaryPhoneName"));
        evo.setEndorsementPrimaryPhoneNumber(ExcelUtils_01.getCellValueByLabel("endorsementPrimaryPhoneNumber"));
        evo.setEndorsementEmail(ExcelUtils_01.getCellValueByLabel("endorsementEmail"));
        evo.setEndorsementBestWaytoContact(ExcelUtils_01.getCellValueByLabel("endorsementBestWaytoContact"));
        evo.setEndorsementBestTimetoContact(ExcelUtils_01.getCellValueByLabel("endorsementBestTimetoContact"));
        evo.setAutomobilePolicyGeneralLimits(ExcelUtils_01.getCellValueByLabel("AutomobilePolicyGeneralLimits"));
        evo.setEndorsementBodilyInjuryPerPersonPerAccident(ExcelUtils_01.getCellValueByLabel("endorsementBodilyInjuryPerPersonPerAccident"));
        evo.setEndorsementPropertyDamage(ExcelUtils_01.getCellValueByLabel("endorsementPropertyDamage"));
        evo.setEndorsementMedicalPayments(ExcelUtils_01.getCellValueByLabel("endorsementMedicalPayments"));
        evo.setEndorsementDriver1FirstName(ExcelUtils_01.getCellValueByLabel("endorsementDriver1FirstName"));
        evo.setEndorsementDriver1LastName(ExcelUtils_01.getCellValueByLabel("endorsementDriver1LastName"));
        evo.setEndorsementDriver1RelationshipToInsured(ExcelUtils_01.getCellValueByLabel("endorsementDriver1RelationshipToInsured"));
        evo.setEndorsementDriver1DriverStatus(ExcelUtils_01.getCellValueByLabel("endorsementDriver1DriverStatus"));
        evo.setEndorsementDriver1BirthDate(ExcelUtils_01.getCellValueByLabel("endorsementDriver1BirthDate"));
        evo.setEndorsementDriver1Gender(ExcelUtils_01.getCellValueByLabel("endorsementDriver1Gender"));
        evo.setEndorsementDriver1MaritalStatus(ExcelUtils_01.getCellValueByLabel("endorsementDriver1MaritalStatus"));
        evo.setEndorsementDriver1AgeLicensed(ExcelUtils_01.getCellValueByLabel("endorsementDriver1AgeLicensed"));
        evo.setEndorsementDriver1DateLicensed(ExcelUtils_01.getCellValueByLabel("endorsementDriver1DateLicensed"));
        evo.setEndorsementDriver1LicenseState(ExcelUtils_01.getCellValueByLabel("endorsementDriver1LicenseState"));
        evo.setEndorsementDriver1LicenseNumber(ExcelUtils_01.getCellValueByLabel("endorsementDriver1LicenseNumber"));
        evo.setEndorsementDriver1DriversLicenseStatus(ExcelUtils_01.getCellValueByLabel("endorsementDriver1DriversLicenseStatus"));
        evo.setEndorsementDriver1SR22(ExcelUtils_01.getCellValueByLabel("endorsementDriver1SR22"));
        evo.setEndorsementDriver1OccupationStatus(ExcelUtils_01.getCellValueByLabel("endorsementDriver1OccupationStatus"));
        evo.setEndorsementDriver1Address(ExcelUtils_01.getCellValueByLabel("endorsementDriver1Address"));
        evo.setEndorsementDriver1City(ExcelUtils_01.getCellValueByLabel("endorsementDriver1City"));
        evo.setEndorsementDriver1State(ExcelUtils_01.getCellValueByLabel("endorsementDriver1State"));
        evo.setEndorsementDriver1Zip(ExcelUtils_01.getCellValueByLabel("endorsementDriver1Zip"));
        evo.setEndorsementVehicle1VIN(ExcelUtils_01.getCellValueByLabel("endorsementVehicle1VIN"));
        evo.setEndorsementVehicle1Use(ExcelUtils_01.getCellValueByLabel("endorsementVehicle1Use"));
        evo.setEndorsementVehicle1PurchasedOrLeased(ExcelUtils_01.getCellValueByLabel("endorsementVehicle1PurchasedOrLeased"));
        Thread.sleep(10000);
//        driver.findElement(By.id(ConstantsClass.endorsementToolbarSearchText)).sendKeys((policyNumber));
//        driver.findElement(By.id(ConstantsClass.endorsementToolbarSearch)).click();
        driver.findElement(By.xpath(ConstantsClass.endorsementTransaction)).click();
        driver.findElement(By.id(ConstantsClass.endorsementTransactionCd)).sendKeys(evo.getEndorsementTransactionCd());
        driver.findElement(By.id(ConstantsClass.endorsementSelect)).click();
        driver.findElement(By.id(ConstantsClass.endorsementTransactionEffectiveDt)).sendKeys(evo.getEndorsementEffectiveDate());
        driver.findElement(By.id(ConstantsClass.endorsementStart)).click();
        driver.findElement(By.id(ConstantsClass.endorsementStart)).click();

//        Changing the Address
        String endorsementMailingAddressChange
                = evo.getEndorsementMailingAddressChange();
        if (endorsementMailingAddressChange
                .equals("ChangeAddress")) {
            driver.findElement(By.id("InsuredMailingAddr.Addr1")).clear();
            driver.findElement(By.id("InsuredMailingAddr.City")).clear();
            driver.findElement(By.id("InsuredMailingAddr.PostalCode")).clear();
            driver.findElement(By.id("InsuredMailingAddr.Addr1")).sendKeys(evo.getEndorsementMailingAddress());
            driver.findElement(By.id("InsuredMailingAddr.City")).sendKeys(evo.getEndorsementMailingAddressCity());
            driver.findElement(By.id("InsuredMailingAddr.StateProvCd")).sendKeys(evo.getEndorsementMailingAddressState());
            driver.findElement(By.id("InsuredMailingAddr.PostalCode")).sendKeys(evo.getEndorsementMailingAddressZip());
            driver.findElement(By.id("CopyAddress")).click();
        } else if (endorsementMailingAddressChange
                .equals("SameAddress")) {
            System.out.println("Same Address");
        }
//        Changing Contant details
        String endorsementChangeContantDetails
                = evo.getEndorsementChangeContantDetails();
        if (endorsementChangeContantDetails.equals("ChangeContact")) {
            driver.findElement(By.id("InsuredPhonePrimary.PhoneName")).sendKeys(evo.getEndorsementPrimaryPhoneName());
            driver.findElement(By.id("InsuredPhonePrimary.PhoneNumber")).clear();
            driver.findElement(By.id("InsuredPhonePrimary.PhoneNumber")).sendKeys(evo.getEndorsementPrimaryPhoneNumber());
            driver.findElement(By.id("InsuredEmail.EmailAddr")).clear();
            driver.findElement(By.id("InsuredEmail.EmailAddr")).sendKeys(evo.getEndorsementEmail());
            driver.findElement(By.id("InsuredPersonal.BestWayToContact")).sendKeys(evo.getEndorsementBestWaytoContact());
            driver.findElement(By.id("InsuredPersonal.BestTimeToContact")).sendKeys(evo.getEndorsementBestTimetoContact());
        } else if (endorsementChangeContantDetails.equals("SameDetails")) {
            System.out.println("SameDetails");
        }
        //Changing Limits
        String AutomobilePolicyGeneralLimits= evo.getAutomobilePolicyGeneralLimits();

        if(AutomobilePolicyGeneralLimits.equals("Change")) {
            driver.findElement(By.id("Wizard_AutoGeneral")).click();
            driver.findElement(By.id("Line.BILimit")).sendKeys(evo.getEndorsementBodilyInjuryPerPersonPerAccident());
            driver.findElement(By.id("Line.PDLimit")).sendKeys(evo.getEndorsementPropertyDamage());
            driver.findElement(By.id("Line.MedPayLimit")).sendKeys(evo.getEndorsementMedicalPayments());
        }else if(AutomobilePolicyGeneralLimits.equals("NoChange")){
            System.out.println("NoChange");
        }
//       Adding Driver2 To the policy
        driver.findElement(By.id(ConstantsClass.endorsementNavigate_DriverParty)).click();
        driver.findElement(By.id(ConstantsClass.endorsementDriver1FirstName)).sendKeys(evo.getEndorsementDriver1FirstName());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1LastName)).sendKeys(evo.getEndorsementDriver1LastName());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1RelationshipToInsured)).sendKeys(evo.getEndorsementDriver1RelationshipToInsured());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1DriverStatus)).sendKeys(evo.getEndorsementDriver1DriverStatus());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1BirthDate)).sendKeys(evo.getEndorsementDriver1BirthDate());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1Gender)).sendKeys(evo.getEndorsementDriver1Gender());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1MaritalStatus)).sendKeys(evo.getEndorsementDriver1MaritalStatus());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1DateLicensed)).sendKeys(evo.getEndorsementDriver1DateLicensed());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseState)).sendKeys(evo.getEndorsementDriver1LicenseState());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1LicenseNumber)).sendKeys(evo.getEndorsementDriver1LicenseNumber());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1DriversLicenseStatus)).sendKeys(evo.getEndorsementDriver1DriversLicenseStatus());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1SR22)).sendKeys(evo.getEndorsementDriver1SR22());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1OccupationStatus)).sendKeys(evo.getEndorsementDriver1OccupationStatus());

        driver.findElement(By.id(ConstantsClass.endorsementDriver1Address)).sendKeys(evo.getEndorsementDriver1Address());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1City)).sendKeys(evo.getEndorsementDriver1City());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1State)).sendKeys(evo.getEndorsementDriver1State());
        driver.findElement(By.id(ConstantsClass.endorsementDriver1Zip)).sendKeys(evo.getEndorsementDriver1Zip());
        driver.findElement(By.id(ConstantsClass.endorsementaddrVerifyImg)).click();
        driver.findElement(By.id(ConstantsClass.endorsementSave)).click();

        driver.findElement(By.id(ConstantsClass.endorsementVehicle1Add)).click();
        driver.findElement(By.id(ConstantsClass.endorsementVehicle1VIN)).sendKeys(evo.getEndorsementVehicle1VIN());
        driver.findElement(By.id(ConstantsClass.endorsementValidateVIN)).click();
        Thread.sleep(10000);
        driver.findElement(By.id(ConstantsClass.endorsementVehicle1Use)).sendKeys(evo.getEndorsementVehicle1Use());
        driver.findElement(By.id(ConstantsClass.endorsementVehicle1PurchasedOrLeased)).sendKeys(evo.getEndorsementVehicle1PurchasedOrLeased());
        driver.findElement(By.id(ConstantsClass.endorsementCloseout)).click();
        driver.findElement(By.id(ConstantsClass.endorsementProcess)).click();
        Robot robot = new Robot();
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_SHIFT); //press shift
        robot.keyPress(KeyEvent.VK_TAB); // Press tab key
        robot.keyRelease(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyRelease(KeyEvent.VK_SHIFT); //press shift
        robot.keyRelease(KeyEvent.VK_TAB); // Press tab key
        se.premium(driver, "EndorsementPremium");
    }
}

