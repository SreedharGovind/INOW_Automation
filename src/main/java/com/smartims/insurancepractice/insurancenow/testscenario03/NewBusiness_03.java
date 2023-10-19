package com.smartims.insurancepractice.insurancenow.testscenario03;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NewBusiness_03 {
    public void getNewBussines(ChromeDriver driver) throws IOException, InterruptedException, AWTException {
        NewBusinessVO nbvo = new NewBusinessVO();
        SeleniumToExcel_03 se = new SeleniumToExcel_03();
        nbvo.setNewBusinessEffectiveDate(ExcelUtils_03.getCellValueByLabel("newBusinessEffectiveDate"));
        nbvo.setNewBusinessState(ExcelUtils_03.getCellValueByLabel("newBusinessState"));
        nbvo.setNewBusinessProgramType(ExcelUtils_03.getCellValueByLabel("newBusinessProgramType"));
        nbvo.setNewBusinessProduct(ExcelUtils_03.getCellValueByLabel("newBusinessProduct"));
        nbvo.setNewBusinessTerm(ExcelUtils_03.getCellValueByLabel("newBusinessTerm"));
        nbvo.setNewBusinessProducerCode(ExcelUtils_03.getCellValueByLabel("newBusinessProducerCode"));
        nbvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(ExcelUtils_03.getCellValueByLabel("newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nbvo.setNewBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months(ExcelUtils_03.getCellValueByLabel("newBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months"));
        nbvo.setNewBusinessEntityType(ExcelUtils_03.getCellValueByLabel("newBusinessEntityType"));
        nbvo.setNewBusinessIndividualFirst(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualFirst"));
        nbvo.setNewBusinessIndividualMiddle(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualMiddle"));
        nbvo.setNewBusinessIndividualLast(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualLast"));
        nbvo.setNewBusinessIndividualBirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nbvo.setNewBusinessMailingAddress(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddress"));
        nbvo.setNewBusinessMailingAddressCity(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressCity"));
        nbvo.setNewBusinessMailingAddressZip(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressZip"));
        nbvo.setNewBusinessMailingAddressState(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressState"));
        nbvo.setNewBusinessMailingAddressVerifyAddress(ExcelUtils_03.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nbvo.setNewBusinessEmail(ExcelUtils_03.getCellValueByLabel("newBusinessEmail"));
        nbvo.setNewBusinessBestWaytoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBestTimetoContact(ExcelUtils_03.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBodilyInjuryPerPersonPerAccident(
                ExcelUtils_03.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nbvo.setNewBusinessPropertyDamage(ExcelUtils_03.getCellValueByLabel("newBusinessPropertyDamage"));
        nbvo.setNewBusinessMedicalPayments(ExcelUtils_03.getCellValueByLabel("newBusinessMedicalPayments"));
        nbvo.setNewBusinessPersonalInjuryProtection(
                ExcelUtils_03.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nbvo.setNewBusinessUninsuredMotoristBodilyInjury(
                ExcelUtils_03.getCellValueByLabel("newBusinessUninsuredMotoristBodilyInjury"));
        nbvo.setNewBusinessUnderinsuredMotoristBodilyInjury(
                ExcelUtils_03.getCellValueByLabel("newBusinessUnderinsuredMotoristBodilyInjury"));
        nbvo.setNewBusinessHomeownersDiscount(ExcelUtils_03.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nbvo.setNewBusinessDriver1FirstName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1FirstName"));
        nbvo.setNewBusinessDriver1LastName(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LastName"));
        nbvo.setNewBusinessDriver1RelationshipToInsured(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nbvo.setNewBusinessDriver1DriverStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nbvo.setNewBusinessDriver1BirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nbvo.setNewBusinessDriver1Gender(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1Gender"));
        nbvo.setNewBusinessDriver1MaritalStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nbvo.setNewBusinessDriver1DateLicensed(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nbvo.setNewBusinessDriver1LicenseNumber(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nbvo.setNewBusinessDriver1LicenseState(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nbvo.setNewBusinessDriver1DriversLicenseStatus(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nbvo.setNewBusinessDriver1SR22(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1SR22"));
        nbvo.setNewBusinessDriver1Occupation(ExcelUtils_03.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nbvo.setNewBusinessVehicle1VIN(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1VIN"));
        nbvo.setNewBusinessVehicle1Use(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1Use"));
        nbvo.setNewBusinessVehicle1PurchasedOrLeased(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nbvo.setNewBusinessVehicle1OtherThanCollisionDeductible(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nbvo.setNewBusinessVehicle1CollisionDeductible(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nbvo.setNewBusinessVehicle1RentalReimbursement(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nbvo.setNewBusinessVehicle1TowingAndLabor(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nbvo.setNewBusinessVehicle1SpecialEquipment(ExcelUtils_03.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nbvo.setNewBusinessUWQuestions(ExcelUtils_03.getCellValueByLabel("newBusinessUWQuestions"));
        nbvo.setNewBusinessPaymentType(ExcelUtils_03.getCellValueByLabel("newBusinessPaymentType"));
        nbvo.setNewBusinessNonDriver1FirstName(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1FirstName"));
        nbvo.setNewBusinessNonDriver1MiddleName(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1MiddleName"));
        nbvo.setNewBusinessNonDriver1LastName(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1LastName"));
        nbvo.setNewBusinessNonDriver1RelationshipToInsured(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1RelationshipToInsured"));
        nbvo.setNewBusinessNonDriver1NonDriverType(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1NonDriverType"));
        nbvo.setNewBusinessNonDriver1Gender(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1Gender"));
        nbvo.setNewBusinessNonDriver1BirthDate(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1BirthDate"));
        nbvo.setNewBusinessNonDriver1MaritalStatus(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1MaritalStatus"));
        nbvo.setNewBusinessNonDriver1NonRatedReason(ExcelUtils_03.getCellValueByLabel("newBusinessNonDriver1NonRatedReason"));
        nbvo.setNewBusinessAICode(ExcelUtils_03.getCellValueByLabel("newBusinessAICode"));
        nbvo.setNewBusinessAIInterestType(ExcelUtils_03.getCellValueByLabel("newBusinessAIInterestType"));

        //New Business Creation
        driver.findElement(By.xpath(ConstantsClass.newQuoteButton)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessStateCode)).sendKeys(nbvo.getNewBusinessState());
        driver.findElement(By.name(ConstantsClass.newBusinessEffectiveDate)).sendKeys(nbvo.getNewBusinessEffectiveDate());
        driver.findElement(By.id(ConstantsClass.newBusinessProgramType)).sendKeys(nbvo.getNewBusinessProgramType());
        driver.findElement(By.id(ConstantsClass.quickActionNewQuote)).click();
        driver.findElement(By.id(ConstantsClass.continueButton)).click();
        Thread.sleep(100);
        driver.findElement(By.id("BasicPolicy.RenewalTermCd")).sendKeys(nbvo.getNewBusinessTerm());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerCode)).sendKeys(nbvo.getNewBusinessProducerCode());
        driver.findElement(By.id(ConstantsClass.newBusinessProducerLookup)).click();
        driver.findElement(By.name(ConstantsClass.basicPolicyNolapse)).sendKeys(nbvo.getNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days());
        // driver.findElement(By.name(ConstantsClass.basicPolicyUninsuredMorethanThirtyDays)).sendKeys(nbvo.getNewBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months());
//      Insured information
        driver.findElement(By.name(ConstantsClass.newBusinessEntityType)).sendKeys(nbvo.getNewBusinessEntityType());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredFirstName)).sendKeys(nbvo.getNewBusinessIndividualFirst());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredLastName)).sendKeys(nbvo.getNewBusinessIndividualLast());
        driver.findElement(By.id(ConstantsClass.resetCommercialName)).click();
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBirthDate)).sendKeys(nbvo.getNewBusinessIndividualBirthDate());
//      Mailing address
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddress)).sendKeys(nbvo.getNewBusinessMailingAddress());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressCity)).sendKeys(nbvo.getNewBusinessMailingAddressCity());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressPostalCode)).sendKeys(nbvo.getNewBusinessMailingAddressZip());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredMailingAddressState)).sendKeys(nbvo.getNewBusinessMailingAddressState());
        driver.findElement(By.id(ConstantsClass.newBusinessInsuredMailingAddressVerify)).click();
//      Contact
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredEmailAddress)).sendKeys(nbvo.getNewBusinessEmail());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBestWayToContact)).sendKeys(nbvo.getNewBusinessBestWaytoContact());
        driver.findElement(By.name(ConstantsClass.newBusinessInsuredPersonalBestTimeToContact)).sendKeys(nbvo.getNewBusinessBestTimetoContact());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//      Selecting the new customer
        driver.findElement(By.name("QuoteCustomerClearingRef")).click();
//        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessNewQuoteCustomer)).click();
        Select bodilyInjury = new Select(driver.findElement(By.id(ConstantsClass.newBusinessBodilyInjuryLimit)));
        bodilyInjury.selectByVisibleText(nbvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        Select propertyDamage = new Select(driver.findElement(By.id(ConstantsClass.newBusinessPropertyDamageLimit)));
        propertyDamage.selectByVisibleText(nbvo.getNewBusinessPropertyDamage());
        Select medicalPayment = new Select(driver.findElement(By.id(ConstantsClass.newBusinessMedicalPaymentLimit)));
        medicalPayment.selectByVisibleText(nbvo.getNewBusinessMedicalPayments());
        driver.findElement(By.id(ConstantsClass.newBusinessUnInsuredMotoristBodilyInjury))
                .sendKeys(nbvo.getNewBusinessUninsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessUnderInsuredMotoristBodilyInjury))
                .sendKeys(nbvo.getNewBusinessUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.id(ConstantsClass.newBusinessHomeOwnersDiscount))
                .sendKeys(nbvo.getNewBusinessHomeownersDiscount());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
//        Adding Driver 0r driver details
        driver.findElement(By.id(ConstantsClass.newBusinessAddDriver)).click();
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1FirstName)).sendKeys(nbvo.getNewBusinessDriver1FirstName());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Surname)).sendKeys(nbvo.getNewBusinessDriver1LastName());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1RelationshipToInsured)).sendKeys(nbvo.getNewBusinessDriver1RelationshipToInsured());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Status)).sendKeys(nbvo.getNewBusinessDriver1DriverStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1BirthDate)).sendKeys(nbvo.getNewBusinessDriver1BirthDate());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1Gender)).sendKeys(nbvo.getNewBusinessDriver1Gender());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1MaritalStatus)).sendKeys(nbvo.getNewBusinessDriver1MaritalStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1LicenseDate)).sendKeys(nbvo.getNewBusinessDriver1DateLicensed());
        driver.findElement(By.id(ConstantsClass.newBusinessDriver1LicenseNumber)).sendKeys(nbvo.getNewBusinessDriver1LicenseNumber());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1LicenseStatus)).sendKeys(nbvo.getNewBusinessDriver1DriversLicenseStatus());
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1SR22)).sendKeys(nbvo.getNewBusinessDriver1SR22());
//        employee details
        driver.findElement(By.name(ConstantsClass.newBusinessDriver1OccupationStatus)).sendKeys(nbvo.getNewBusinessDriver1Occupation());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.addNonDriver)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1FirstName)).sendKeys(nbvo.getNewBusinessNonDriver1FirstName());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1MiddleName)).sendKeys(nbvo.getNewBusinessNonDriver1MiddleName());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1LastName)).sendKeys(nbvo.getNewBusinessNonDriver1LastName());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1RelationshipToInsured)).sendKeys(nbvo.getNewBusinessNonDriver1RelationshipToInsured());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1NonDriverType)).sendKeys(nbvo.getNewBusinessNonDriver1NonDriverType());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1Gender)).sendKeys(nbvo.getNewBusinessNonDriver1Gender());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1BirthDate)).sendKeys(nbvo.getNewBusinessNonDriver1BirthDate());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1NonRatedReason)).sendKeys(nbvo.getNewBusinessNonDriver1NonRatedReason());
        driver.findElement(By.id(ConstantsClass.newBusinessNonDriver1MaritalStatus)).sendKeys(nbvo.getNewBusinessNonDriver1MaritalStatus());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.navigateAddRiskPrivatePassengerAuto)).click();
//         Adding vechile
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1VIN)).sendKeys(nbvo.getNewBusinessVehicle1VIN());
        driver.findElement(By.id(ConstantsClass.validateVin)).click();
        Thread.sleep(10000);
        // In use
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1Use)).sendKeys(nbvo.getNewBusinessVehicle1Use());
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1PurchasedOrLeased)).sendKeys(nbvo.getNewBusinessVehicle1PurchasedOrLeased());
        //Coverages
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1OtherThanCollisionDeductible)).sendKeys(nbvo.getNewBusinessVehicle1OtherThanCollisionDeductible());
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1CollisionDeductible)).sendKeys(nbvo.getNewBusinessVehicle1CollisionDeductible());
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1RentalReimbursement)).sendKeys(nbvo.getNewBusinessVehicle1RentalReimbursement());
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1TowingAndLabor)).sendKeys(nbvo.getNewBusinessVehicle1TowingAndLabor());
        driver.findElement(By.name(ConstantsClass.newBusinessVehicle1SpecialEquipment)).sendKeys(nbvo.getNewBusinessVehicle1SpecialEquipment());
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        //Billing
        driver.findElement(By.id(ConstantsClass.nextPageBottom)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessPayPlans)).click();
        driver.findElement(By.id(ConstantsClass.bindButton)).click();
        driver.findElement(By.id(ConstantsClass.wizardAdditionalInterests)).click();
        driver.findElement(By.id(ConstantsClass.addAdditionalInterest)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessAICode)).sendKeys(nbvo.getNewBusinessAICode());
        driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode)).click();
        driver.findElement(By.id(ConstantsClass.additionalInterestTypeCode))
                .sendKeys(nbvo.getNewBusinessAIInterestType(), Keys.ENTER);
        driver.findElement(By.id(ConstantsClass.privatePassengerAutoCheckbox)).click();
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
//     Underwritting reasons
        driver.findElement(By.id(ConstantsClass.questionOutsideWI)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionProperLicense)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionPossibleDriver)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverConviction)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionOtherVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionHouseholdResident)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExcludedSpouse)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionBusinessVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExistingDamage)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDifferentAddress)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionSpecialEquipment)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionTitledSolelyVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverViolation)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverCondition)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionVehicleModification)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicleCov)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionAddLiveryVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionAddLiveryDeliveryCov)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRenters)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRentersLossDesc)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionContentsPlusRentersCrimeDesc)).sendKeys(nbvo.getNewBusinessUWQuestions());
        // driver.findElement(By.id(ConstantsClass.questionTitledVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.xpath(ConstantsClass.closeOut)).click();
//        Payment close out screen
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(nbvo.getNewBusinessPaymentType());
//        Issue the Bussiness
        driver.findElement(By.xpath(ConstantsClass.process)).click();
        Robot robot = new Robot();
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_CONTROL); // Press CTRL key
        robot.keyPress(KeyEvent.VK_TAB); // Press Tab key
        se.premium(driver, "PolicyNumber");
        se.premium(driver, "NewBusinessPremium");

    }
}
