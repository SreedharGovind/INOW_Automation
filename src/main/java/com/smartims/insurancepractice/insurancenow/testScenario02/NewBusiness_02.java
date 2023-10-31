package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
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

public class NewBusiness_02 {
    void newBusiness_02(ChromeDriver driver, Actions actions) throws IOException, InterruptedException, AWTException {
        NewBusinessVO nvo = new NewBusinessVO();
        SeleniumToExcel_02 seleniumToExcel = new SeleniumToExcel_02();

        nvo.setNewBusinessEffectiveDate(ExcelUtils_02.getCellValueByLabel("newBusinessEffectiveDate"));
        nvo.setNewBusinessState(ExcelUtils_02.getCellValueByLabel("newBusinessState"));
        nvo.setNewBusinessProgramType(ExcelUtils_02.getCellValueByLabel("newBusinessProgramType"));
        nvo.setNewBusinessProduct(ExcelUtils_02.getCellValueByLabel("newBusinessProduct"));
        nvo.setNewBusinessTerm(ExcelUtils_02.getCellValueByLabel("newBusinessTerm"));
        nvo.setNewBusinessProducerCode(ExcelUtils_02.getCellValueByLabel("newBusinessProducerCode"));
        nvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOraLapse21DaysOrLess(
                ExcelUtils_02.getCellValueByLabel(""));
        nvo.setNewBusinessEntityType(ExcelUtils_02.getCellValueByLabel("newBusinessEntityType"));
        nvo.setNewBusinessIndividualFirst(ExcelUtils_02.getCellValueByLabel("newBusinessIndividualFirst"));
        nvo.setNewBusinessIndividualLast(ExcelUtils_02.getCellValueByLabel("newBusinessIndividualLast"));
        nvo.setNewBusinessIndividualBirthDate(ExcelUtils_02.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nvo.setNewBusinessMailingAddress(ExcelUtils_02.getCellValueByLabel("newBusinessMailingAddress"));
        nvo.setNewBusinessMailingAddressCity(ExcelUtils_02.getCellValueByLabel("newBusinessMailingAddressCity"));
        nvo.setNewBusinessMailingAddressZip(ExcelUtils_02.getCellValueByLabel("newBusinessMailingAddressZip"));
        nvo.setNewBusinessMailingAddressState(ExcelUtils_02.getCellValueByLabel("newBusinessMailingAddressState"));
        nvo.setNewBusinessMailingAddressVerifyAddress(
                ExcelUtils_02.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nvo.setNewBusinessEmail(ExcelUtils_02.getCellValueByLabel("newBusinessEmail"));
        nvo.setNewBusinessBestWaytoContact(ExcelUtils_02.getCellValueByLabel("newBusinessBestWaytoContact"));
        nvo.setNewBusinessBestTimetoContact(ExcelUtils_02.getCellValueByLabel("newBusinessBestTimetoContact"));
        nvo.setNewBusinessBodilyInjuryPerPersonPerAccident(
                ExcelUtils_02.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nvo.setNewBusinessPropertyDamage(ExcelUtils_02.getCellValueByLabel("newBusinessPropertyDamage"));
        nvo.setNewBusinessMedicalPayments(ExcelUtils_02.getCellValueByLabel("newBusinessMedicalPayments"));
        nvo.setNewBusinessPersonalInjuryProtection(
                ExcelUtils_02.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nvo.setNewBusinessUninsuredMotoristBodilyInjury(
                ExcelUtils_02.getCellValueByLabel("newBusinessUninsuredMotoristBodilyInjury"));
        nvo.setNewBusinessUnderinsuredMotoristBodilyInjury(
                ExcelUtils_02.getCellValueByLabel("newBusinessUnderinsuredMotoristBodilyInjury"));
        nvo.setNewBusinessHomeownersDiscount(ExcelUtils_02.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nvo.setNewBusinessDriver1FirstName(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1FirstName"));
        nvo.setNewBusinessDriver1LastName(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1LastName"));
        nvo.setNewBusinessDriver1RelationshipToInsured(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nvo.setNewBusinessDriver1DriverStatus(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nvo.setNewBusinessDriver1BirthDate(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nvo.setNewBusinessDriver1Gender(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1Gender"));
        nvo.setNewBusinessDriver1MaritalStatus(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nvo.setNewBusinessDriver1DateLicensed(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nvo.setNewBusinessDriver1LicenseNumber(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nvo.setNewBusinessDriver1LicenseState(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nvo.setNewBusinessDriver1DriversLicenseStatus(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nvo.setNewBusinessDriver1SR22(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1SR22"));
        nvo.setNewBusinessDriver1OccupationStatus(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nvo.setNewBusinessDriver1Occupation(ExcelUtils_02.getCellValueByLabel("newBusinessDriver1Occupation"));

        nvo.setNewBusinessDriver2FirstName(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2FirstName"));
        nvo.setNewBusinessDriver2LastName(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2LastName"));
        nvo.setNewBusinessDriver2RelationshipToInsured(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver2RelationshipToInsured"));
        nvo.setNewBusinessDriver2DriverStatus(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2DriverStatus"));
        nvo.setNewBusinessDriver2BirthDate(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2BirthDate"));
        nvo.setNewBusinessDriver2Gender(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2Gender"));
        nvo.setNewBusinessDriver2MaritalStatus(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2MaritalStatus"));
        nvo.setNewBusinessDriver2DateLicensed(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2DateLicensed"));
        nvo.setNewBusinessDriver2LicenseNumber(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2LicenseNumber"));
        nvo.setNewBusinessDriver2LicenseState(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2LicenseState"));
        nvo.setNewBusinessDriver2DriversLicenseStatus(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver2DriversLicenseStatus"));
        nvo.setNewBusinessDriver2SR22(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2SR22"));
        nvo.setNewBusinessDriver2OccupationStatus(
                ExcelUtils_02.getCellValueByLabel("newBusinessDriver2OccupationStatus"));
        nvo.setNewBusinessDriver2Occupation(ExcelUtils_02.getCellValueByLabel("newBusinessDriver2Occupation"));

        nvo.setNewBusinessNonDriver1FirstName(ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1FirstName"));
        nvo.setNewBusinessNonDriver1LastName(ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1LastName"));
        nvo.setNewBusinessNonDriver1RelationshipToInsured(
                ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1RelationshipToInsured"));
        nvo.setNewBusinessNonDriver1NonDriverType(
                ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1NonDriverType"));
        nvo.setNewBusinessNonDriver1Gender(ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1Gender"));
        nvo.setNewBusinessNonDriver1BirthDate(ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1BirthDate"));
        nvo.setNewBusinessNonDriver1MaritalStatus(
                ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1MaritalStatus"));
        nvo.setNewBusinessNonDriver1NonRatedReason(
                ExcelUtils_02.getCellValueByLabel("newBusinessNonDriver1NonRatedReason"));

        nvo.setNewBusinessVehicle1VIN(ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1VIN"));
        nvo.setNewBusinessVehicle1Use(ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1Use"));
        nvo.setNewBusinessVehicle1PurchasedOrLeased(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nvo.setNewBusinessVehicle1OtherThanCollisionDeductible(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nvo.setNewBusinessVehicle1CollisionDeductible(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nvo.setNewBusinessVehicle1RentalReimbursement(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nvo.setNewBusinessVehicle1TowingAndLabor(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nvo.setNewBusinessVehicle1SpecialEquipment(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));

        nvo.setNewBusinessVehicle2VIN(ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2VIN"));
        nvo.setNewBusinessVehicle2Use(ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2Use"));
        nvo.setNewBusinessVehicle2PurchasedOrLeased(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2PurchasedOrLeased"));
        nvo.setNewBusinessVehicle2OtherThanCollisionDeductible(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2OtherThanCollisionDeductible"));
        nvo.setNewBusinessVehicle2CollisionDeductible(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2CollisionDeductible"));
        nvo.setNewBusinessVehicle2RentalReimbursement(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2RentalReimbursement"));
        nvo.setNewBusinessVehicle2TowingAndLabor(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2TowingAndLabor"));
        nvo.setNewBusinessVehicle2SpecialEquipment(
                ExcelUtils_02.getCellValueByLabel("newBusinessVehicle2SpecialEquipment"));
        nvo.setNewBusinessAICode(ExcelUtils_02.getCellValueByLabel("newBusinessAICode"));
        nvo.setNewBusinessAIInterestType(ExcelUtils_02.getCellValueByLabel("newBusinessAIInterestType"));
        nvo.setNewBusinessUWQuestions(ExcelUtils_02.getCellValueByLabel("newBusinessUWQuestions"));
        nvo.setNewBusinessPaymentType(ExcelUtils_02.getCellValueByLabel("newBusinessPayment Type"));

        driver.findElement(By.xpath(ConstantsClass.newQuoteButton)).click();
        Select statecode = new Select(driver.findElement(By.id(ConstantsClass.newBusinessStateCode)));
        statecode.selectByVisibleText(nvo.getNewBusinessState());
        driver.findElement(By.id(ConstantsClass.newBusinessEffectiveDate)).sendKeys(nvo.getNewBusinessEffectiveDate());
        Select programType = new Select(driver.findElement(By.id(ConstantsClass.newBusinessProgramType)));
        programType.selectByVisibleText(nvo.getNewBusinessProgramType());
        driver.findElement(By.id(ConstantsClass.quickActionNewQuote)).click();
        driver.findElement(By.id(ConstantsClass.continueButton)).click();
        WebElement producerNumber = driver.findElement(By.id(ConstantsClass.newBusinessProducerCode));
        actions.moveToElement(producerNumber).perform();
        producerNumber.sendKeys(nvo.getNewBusinessProducerCode());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerLookup)).click();
        driver.findElement(By.id(ConstantsClass.basicPolicyNolapse))
                .sendKeys(nvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOraLapse21DaysOrLess());
        driver.findElement(By.id(ConstantsClass.newBusinessEntityType)).sendKeys(nvo.getNewBusinessEntityType());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredFirstName))
                .sendKeys(nvo.getNewBusinessIndividualFirst());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredLastName))
                .sendKeys(nvo.getNewBusinessIndividualLast());
        driver.findElement(By.id(ConstantsClass.resetCommercialName)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBirthDate))
                .sendKeys(nvo.getNewBusinessIndividualBirthDate());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddress))
                .sendKeys(nvo.getNewBusinessMailingAddress());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressCity))
                .sendKeys(nvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressPostalCode))
                .sendKeys(nvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressState))
                .sendKeys(nvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressVerify)).click();
        Thread.sleep(5000);
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredEmailAddress)).sendKeys(nvo.getNewBusinessEmail());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestWayToContact))
                .sendKeys(nvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredPersonalBestTimeToContact))
                .sendKeys(nvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessNewQuoteCustomer)).click();
        Select bodilyInjury = new Select(driver.findElement(By.id(ConstantsClass.newBusinessBodilyInjuryLimit)));
        bodilyInjury.selectByVisibleText(nvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        Select propertyDamage = new Select(driver.findElement(By.id(ConstantsClass.newBusinessPropertyDamageLimit)));
        propertyDamage.selectByVisibleText(nvo.getNewBusinessPropertyDamage());
        Select medicalPayment = new Select(driver.findElement(By.id(ConstantsClass.newBusinessMedicalPaymentLimit)));
        medicalPayment.selectByVisibleText(nvo.getNewBusinessMedicalPayments());
        driver.findElement(By.id(ConstantsClass.newBusinessUnInsuredMotoristBodilyInjury))
                .sendKeys(nvo.getNewBusinessUninsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessUnderInsuredMotoristBodilyInjury))
                .sendKeys(nvo.getNewBusinessUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessHomeOwnersDiscount))
                .sendKeys(nvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();

        boolean newDriver1Value = nvo.getNewBusinessDriver1LicenseNumber().isBlank();
        if (newDriver1Value) {
        } else {
            driver.findElement(By.id(ConstantsClass.newBusinessAddDriver)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1RelationshipToInsured))
                    .sendKeys(nvo.getNewBusinessDriver1RelationshipToInsured());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Status))
                    .sendKeys(nvo.getNewBusinessDriver1DriverStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1BirthDate))
                    .sendKeys(nvo.getNewBusinessDriver1BirthDate());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Gender))
                    .sendKeys(nvo.getNewBusinessDriver1Gender());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1MaritalStatus))
                    .sendKeys(nvo.getNewBusinessDriver1MaritalStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseDate))
                    .sendKeys(nvo.getNewBusinessDriver1DateLicensed());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber))
                    .sendKeys(nvo.getNewBusinessDriver1LicenseNumber());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseStatus))
                    .sendKeys(nvo.getNewBusinessDriver1DriversLicenseStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nvo.getNewBusinessDriver1SR22(),
                    Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1OccupationStatus))
                    .sendKeys(nvo.getNewBusinessDriver1OccupationStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1OccupationCategory))
                    .sendKeys(nvo.getNewBusinessDriver1Occupation());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }
        boolean newDriver2Value = nvo.getNewBusinessDriver2LicenseNumber().isBlank();
        if (newDriver2Value) {
        } else {
            driver.findElement(By.id(ConstantsClass.sideBarAddDriverNavigateDriverParty)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1FirstName))
                    .sendKeys(nvo.getNewBusinessDriver2FirstName());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Lastname))
                    .sendKeys(nvo.getNewBusinessDriver2LastName());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1RelationshipToInsured))
                    .sendKeys(nvo.getNewBusinessDriver2RelationshipToInsured());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Status))
                    .sendKeys(nvo.getNewBusinessDriver2DriverStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1BirthDate))
                    .sendKeys(nvo.getNewBusinessDriver2BirthDate());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Gender))
                    .sendKeys(nvo.getNewBusinessDriver2Gender());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1MaritalStatus))
                    .sendKeys(nvo.getNewBusinessDriver2MaritalStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseDate))
                    .sendKeys(nvo.getNewBusinessDriver2DateLicensed());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber))
                    .sendKeys(nvo.getNewBusinessDriver2LicenseNumber());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseStatus))
                    .sendKeys(nvo.getNewBusinessDriver2DriversLicenseStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nvo.getNewBusinessDriver2SR22(),
                    Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1OccupationStatus))
                    .sendKeys(nvo.getNewBusinessDriver2OccupationStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1OccupationCategory))
                    .sendKeys(nvo.getNewBusinessDriver2Occupation());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();

        boolean newNonDriver1Value = nvo.getNewBusinessNonDriver1FirstName().isBlank();
        if (newNonDriver1Value) {
        } else {
            driver.findElement(By.id(ConstantsClass.navigateNonDriverParty)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1FirstName))
                    .sendKeys(nvo.getNewBusinessNonDriver1FirstName());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Lastname))
                    .sendKeys(nvo.getNewBusinessNonDriver1LastName());
            Select relationToInsured = new Select(
                    driver.findElement(By.id(ConstantsClass.newBusinessDriver1RelationshipToInsured)));
            relationToInsured.selectByVisibleText(nvo.getNewBusinessNonDriver1RelationshipToInsured());
            driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1NonDriverType))
                    .sendKeys(nvo.getNewBusinessNonDriver1NonDriverType());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1Gender))
                    .sendKeys(nvo.getNewBusinessNonDriver1Gender());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1BirthDate))
                    .sendKeys(nvo.getNewBusinessNonDriver1BirthDate());
            driver.findElement(By.id(ConstantsClass.newBusinessDriver1MaritalStatus))
                    .sendKeys(nvo.getNewBusinessNonDriver1MaritalStatus());
            driver.findElement(By.id(ConstantsClass.newBusinessNonRatedReason))
                    .sendKeys(nvo.getNewBusinessNonDriver1NonRatedReason());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }

        boolean vehicle1 = nvo.getNewBusinessVehicle1VIN().isBlank();
        if (vehicle1) {
        } else {
            driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nvo.getNewBusinessVehicle1VIN());
            driver.findElement(By.id(ConstantsClass.validateVin)).click();
            Thread.sleep(7000);
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nvo.getNewBusinessVehicle1Use());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased))
                    .sendKeys(nvo.getNewBusinessVehicle1PurchasedOrLeased());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible))
                    .sendKeys(nvo.getNewBusinessVehicle1OtherThanCollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                    .sendKeys(nvo.getNewBusinessVehicle1CollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement))
                    .sendKeys(nvo.getNewBusinessVehicle1RentalReimbursement());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor))
                    .sendKeys(nvo.getNewBusinessVehicle1TowingAndLabor());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment))
                    .sendKeys(nvo.getNewBusinessVehicle1SpecialEquipment());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
        }
        boolean vehicle2 = nvo.getNewBusinessVehicle2VIN().isBlank();
        if (vehicle2) {
        } else {
            driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nvo.getNewBusinessVehicle2VIN());
            driver.findElement(By.id(ConstantsClass.validateVin)).click();
            Thread.sleep(7000);
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nvo.getNewBusinessVehicle2Use());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1PurchasedOrLeased))
                    .sendKeys(nvo.getNewBusinessVehicle2PurchasedOrLeased());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible))
                    .sendKeys(nvo.getNewBusinessVehicle2OtherThanCollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1CollisionDeductible))
                    .sendKeys(nvo.getNewBusinessVehicle2CollisionDeductible());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1RentalReimbursement))
                    .sendKeys(nvo.getNewBusinessVehicle2RentalReimbursement());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1TowingAndLabor))
                    .sendKeys(nvo.getNewBusinessVehicle2TowingAndLabor());
            driver.findElement(By.id(ConstantsClass.newBusinessVehicle1SpecialEquipment))
                    .sendKeys(nvo.getNewBusinessVehicle2SpecialEquipment());
            driver.findElement(By.id(ConstantsClass.saveButton)).click();
            driver.findElement(By.xpath(ConstantsClass.newBusinessCreateApplicationButton)).click();
        }
        boolean additionalInterest = nvo.getNewBusinessAICode().isBlank();
        if (additionalInterest) {
        } else {
            driver.findElement(By.id(ConstantsClass.wizardAdditionalInterests)).click();
            driver.findElement(By.id(ConstantsClass.addAdditionalInterest)).click();
            driver.findElement(By.id(ConstantsClass.endorsementAICode)).sendKeys(nvo.getNewBusinessAICode());
            driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode)).click();
            driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode))
                    .sendKeys(nvo.getNewBusinessAIInterestType(), Keys.ENTER);
            driver.findElement(By.id(ConstantsClass.privatePassengerAutoCheckbox)).click();
        }
        driver.findElement(By.id(ConstantsClass.wizardPayplansButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessPayPlans)).click();
        driver.findElement(By.id(ConstantsClass.saveButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
        driver.findElement(By.id(ConstantsClass.questionOutsideWI)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionProperLicense)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionPossibleDriver)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverConviction)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionHouseholdResident)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExcludedSpouse)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionBusinessVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExistingDamage)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDifferentAddress)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionSpecialEquipment)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionOtherVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionTitledSolelyVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverViolation)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverCondition)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionVehicleModification)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicleCov)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionAddLiveryVehicle)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionAddLiveryDeliveryCov))
                .sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRenters)).sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRentersLossDesc))
                .sendKeys(nvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRentersCrimeDesc))
                .sendKeys(nvo.getNewBusinessUWQuestions());

        driver.findElement(By.xpath(ConstantsClass.closeOut)).click();
        System.out.println(nvo.getNewBusinessPaymentType());
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(nvo.getNewBusinessPaymentType());
        driver.findElement(By.xpath(ConstantsClass.process)).click();
        Robot robot = new Robot();
        Thread.sleep(30000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);// Press Tab key
        robot.keyRelease(KeyEvent.VK_CONTROL); // Press CTRL key
        seleniumToExcel.premium(driver, "NewBusinessPolicyNumber");
        seleniumToExcel.premium(driver, "NewBusiness Premium");

    }
}
