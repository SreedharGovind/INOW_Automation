package com.smartims.insurancepractice.insurancenow.testScenario02;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.*;
import java.util.Properties;

public class AllTransactions_02 {
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
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

        RenewalStart_02 renewal = new RenewalStart_02();
        renewal.renewalStart_02(driver, actions);

        // Increment the counter after all transactions finish execution
        SeleniumToExcel_02.incrementCounterAfterAllTransactions();
    }

    private static void incrementCounter() {
        // Ensure the counter.properties file exists or create it if it doesn't
        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream("counter.properties2")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get the current counter value, or use 1 if it doesn't exist
        int currentCounterValue = Integer.parseInt(properties.getProperty("counter", "1"));

        // Increment the counter
        currentCounterValue++;

        // Update the properties with the new counter value
        properties.setProperty("counter", String.valueOf(currentCounterValue));

        try (OutputStream outputStream = new FileOutputStream("counter.properties2")) {
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
