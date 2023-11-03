package com.smartims.insurancepractice.insurancenow.testScenario_02_1;

import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.*;
import java.util.Properties;

public class AllTransactions_02_1 {
//    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
     public void allTransactions_02() throws IOException, InterruptedException, AWTException {
        ChromeDriver driver = CommonClass.getchromedriver();
        Actions actions = new Actions(driver);

        // Create new Account
        NewBusiness_02_1 newBusiness = new NewBusiness_02_1();
        newBusiness.newBusiness_02(driver, actions);

        Endorsement_02_1 endorsement = new Endorsement_02_1();
        endorsement.endorsement_02(driver, actions);

        Cancellation_02_1 cancellation = new Cancellation_02_1();
        cancellation.cancellation_02(driver, actions);

        Reinstatement_02_1 reinstatement = new Reinstatement_02_1();
        reinstatement.reinstatement_02(driver, actions);

        RewriteNew_02_1 rewrite = new RewriteNew_02_1();
        rewrite.rewriteNew_02(driver, actions);

        RenewalStart_02_1 renewal = new RenewalStart_02_1();
        renewal.renewalStart_02(driver, actions);

        // Increment the counter after all transactions finish execution
        SeleniumToExcel_02_1.incrementCounterAfterAllTransactions();
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
