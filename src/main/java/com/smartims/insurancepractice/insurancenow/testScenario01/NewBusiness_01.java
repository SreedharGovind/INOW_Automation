package com.smartims.insurancepractice.insurancenow.testScenario01;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.NewBusinessVO;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class NewBusiness_01 {
    public void getNewBussines(ChromeDriver driver) throws IOException, InterruptedException {
        NewBusinessVO nbvo = new NewBusinessVO();
        nbvo.setNewBusinessEffectiveDate(ExcelUtils_01.getCellValueByLabel("newBusinessEffectiveDate"));
        nbvo.setNewBusinessState(ExcelUtils_01.getCellValueByLabel("newBusinessState"));
        nbvo.setNewBusinessProgramType(ExcelUtils_01.getCellValueByLabel("newBusinessProgramType"));
        nbvo.setNewBusinessProduct(ExcelUtils_01.getCellValueByLabel("newBusinessProduct"));
        nbvo.setNewBusinessTerm(ExcelUtils_01.getCellValueByLabel("newBusinessTerm"));
        nbvo.setNewBusinessProducerCode(ExcelUtils_01.getCellValueByLabel("newBusinessProducerCode"));
        nbvo.setNewBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days(ExcelUtils_01.getCellValueByLabel("newBusinessDoesTheInsuredHavePriorInsuranceCoverageWithNoLapseOrALapseOfLessThan30Days"));
        nbvo.setNewBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months(ExcelUtils_01.getCellValueByLabel("newBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months"));
        nbvo.setNewBusinessEntityType(ExcelUtils_01.getCellValueByLabel("newBusinessEntityType"));
        nbvo.setNewBusinessIndividualFirst(ExcelUtils_01.getCellValueByLabel("newBusinessIndividualFirst"));
        nbvo.setNewBusinessIndividualMiddle(ExcelUtils_01.getCellValueByLabel("newBusinessIndividualMiddle"));
        nbvo.setNewBusinessIndividualLast(ExcelUtils_01.getCellValueByLabel("newBusinessIndividualLast"));
        nbvo.setNewBusinessIndividualBirthDate(ExcelUtils_01.getCellValueByLabel("newBusinessIndividualBirthDate"));
        nbvo.setNewBusinessMailingAddress(ExcelUtils_01.getCellValueByLabel("newBusinessMailingAddress"));
        nbvo.setNewBusinessMailingAddressCity(ExcelUtils_01.getCellValueByLabel("newBusinessMailingAddressCity"));
        nbvo.setNewBusinessMailingAddressZip(ExcelUtils_01.getCellValueByLabel("newBusinessMailingAddressZip"));
        nbvo.setNewBusinessMailingAddressState(ExcelUtils_01.getCellValueByLabel("newBusinessMailingAddressState"));
        nbvo.setNewBusinessMailingAddressVerifyAddress(ExcelUtils_01.getCellValueByLabel("newBusinessMailingAddressVerifyAddress"));
        nbvo.setNewBusinessEmail(ExcelUtils_01.getCellValueByLabel("newBusinessEmail"));
        nbvo.setNewBusinessBestWaytoContact(ExcelUtils_01.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBestTimetoContact(ExcelUtils_01.getCellValueByLabel("newBusinessBestWaytoContact"));
        nbvo.setNewBusinessBodilyInjuryPerPersonPerAccident(ExcelUtils_01.getCellValueByLabel("newBusinessBodilyInjuryPerPersonPerAccident"));
        nbvo.setNewBusinessPropertyDamage(ExcelUtils_01.getCellValueByLabel("newBusinessPropertyDamage"));
        nbvo.setNewBusinessMedicalPayments(ExcelUtils_01.getCellValueByLabel("newBusinessMedicalPayments"));
        nbvo.setNewBusinessPersonalInjuryProtection(ExcelUtils_01.getCellValueByLabel("newBusinessPersonalInjuryProtection"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristBodilyInjury(ExcelUtils_01.getCellValueByLabel("newBusinessUninsuredUnderinsuredMotoristBodilyInjury"));
        nbvo.setNewBusinessUninsuredUnderinsuredMotoristPropertyDamage("newBusinessUninsuredUnderinsuredMotoristPropertyDamage");
        nbvo.setNewBusinessHomeownersDiscount(ExcelUtils_01.getCellValueByLabel("newBusinessHomeownersDiscount"));
        nbvo.setNewBusinessDriver1FirstName(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1FirstName"));
        nbvo.setNewBusinessDriver1LastName(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1LastName"));
        nbvo.setNewBusinessDriver1RelationshipToInsured(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1RelationshipToInsured"));
        nbvo.setNewBusinessDriver1DriverStatus(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1DriverStatus"));
        nbvo.setNewBusinessDriver1BirthDate(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1BirthDate"));
        nbvo.setNewBusinessDriver1Gender(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1Gender"));
        nbvo.setNewBusinessDriver1MaritalStatus(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1MaritalStatus"));
        nbvo.setNewBusinessDriver1DateLicensed(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1DateLicensed"));
        nbvo.setNewBusinessDriver1LicenseNumber(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1LicenseNumber"));
        nbvo.setNewBusinessDriver1LicenseState(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1LicenseState"));
        nbvo.setNewBusinessDriver1DriversLicenseStatus(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1DriversLicenseStatus"));
        nbvo.setNewBusinessDriver1SR22(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1SR22"));
        nbvo.setNewBusinessDriver1Occupation(ExcelUtils_01.getCellValueByLabel("newBusinessDriver1OccupationStatus"));
        nbvo.setNewBusinessVehicle1VIN(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1VIN"));
        nbvo.setNewBusinessVehicle1Use(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1Use"));
        nbvo.setNewBusinessVehicle1PurchasedOrLeased(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1PurchasedOrLeased"));
        nbvo.setNewBusinessVehicle1OtherThanCollisionDeductible(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1OtherThanCollisionDeductible"));
        nbvo.setNewBusinessVehicle1CollisionDeductible(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1CollisionDeductible"));
        nbvo.setNewBusinessVehicle1RentalReimbursement(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1RentalReimbursement"));
        nbvo.setNewBusinessVehicle1TowingAndLabor(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1TowingAndLabor"));
        nbvo.setNewBusinessVehicle1SpecialEquipment(ExcelUtils_01.getCellValueByLabel("newBusinessVehicle1SpecialEquipment"));
        nbvo.setNewBusinessUWQuestions(ExcelUtils_01.getCellValueByLabel("newBusinessUWQuestions"));
        nbvo.setNewBusinessPaymentType(ExcelUtils_01.getCellValueByLabel("newBusinessPaymentType"));
        //Quote Creation
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
        driver.findElement(By.name(ConstantsClass.basicPolicyUninsuredMorethanThirtyDays)).sendKeys(nbvo.getNewBusinessHastheinsuredoperatedanuninsuredmotorvehicleformorethan30daysinthepast12months());
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
//      Automobile Policy General Screen
        driver.findElement(By.name(ConstantsClass.newBusinessBodilyInjuryLimit)).sendKeys(nbvo.getNewBusinessBodilyInjuryPerPersonPerAccident());
        driver.findElement(By.name(ConstantsClass.newBusinessPropertyDamageLimit)).sendKeys(nbvo.getNewBusinessPropertyDamage());
        driver.findElement(By.name(ConstantsClass.newBusinessMedicalPaymentLimit)).sendKeys(nbvo.getNewBusinessMedicalPayments());
        driver.findElement(By.name(ConstantsClass.newBusinessPersonalInjuryProtectionLimit)).sendKeys(nbvo.getNewBusinessPersonalInjuryProtection());
        driver.findElement(By.name(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristBodilyInjury)).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristBodilyInjury());
        driver.findElement(By.name(ConstantsClass.newBusinessUninsured_UnderInsuredMotoristPropertyDamage)).sendKeys(nbvo.getNewBusinessUninsuredUnderinsuredMotoristPropertyDamage());
        driver.findElement(By.name(ConstantsClass.newBusinessHomeOwnersDiscount)).sendKeys(nbvo.getNewBusinessHomeownersDiscount());
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
        driver.findElement(By.id(ConstantsClass.newBusinessWizardUnderwriting)).click();
//     Underwritting reasons
        driver.findElement(By.id(ConstantsClass.questionProperLicense)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionPossibleDriver)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverConviction)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionHouseholdResident)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExcludedSpouse)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionBusinessVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionExistingDamage)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDifferentAddress)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionSpecialEquipment)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionOtherVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionTitledVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverViolation)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionDriverCondition)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionVehicleModification)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.id(ConstantsClass.questionLiveryVehicle)).sendKeys(nbvo.getNewBusinessUWQuestions());
        driver.findElement(By.xpath(ConstantsClass.closeOut)).click();
//        Payment close out screen
        driver.findElement(By.id(ConstantsClass.paymentTypeCode)).sendKeys(nbvo.getNewBusinessPaymentType());
//        Issue the Bussiness
        driver.findElement(By.xpath(ConstantsClass.process)).click();
    }


}
