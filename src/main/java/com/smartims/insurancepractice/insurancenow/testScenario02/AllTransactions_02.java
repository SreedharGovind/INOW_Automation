package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class AllTransactions_02 {
    public static void main(String[] args) throws IOException, InterruptedException, IOException {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        // Create new Account
        NewBusiness_02 newBusiness = new NewBusiness_02();
        newBusiness.newBusiness_02(driver, actions);

        Endorsement_02 endorsement = new Endorsement_02();
        endorsement.endorsement_02(driver, actions);

        Cancellation_02 cancellation = new Cancellation_02();
        cancellation.cancellation_02(driver, actions);

        Reinstatement_02 reinstatement = new Reinstatement_02();
        reinstatement.reinstatement_02(driver, actions);

        RewriteNew_02 rewrite = new RewriteNew_02();
        rewrite.rewriteNew_02(driver, actions);

//        RewriteNew_02 renewal = new RewriteNew_02();
//        renewal.rewriteNew_02(driver, actions);

    }
}
