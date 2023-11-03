package com.smartims.insurancepractice.insurancenow.testscenario01;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.*;
import java.util.Properties;


public class AllTransactions_01 {

    public void allTransactions_01() throws IOException, InterruptedException, AWTException {
        ChromeDriver driver = CommonClass.getchromedriver();

        NewBusiness_01 nb = new NewBusiness_01();
        nb.getNewBussines(driver);

        Endorsement_01 ed = new Endorsement_01();
        ed.getEndorsement_03(driver);

        CancellationNotice_01 cn = new CancellationNotice_01();
        cn.getcancellationNotice(driver);

        RewriteNew_01 rn = new RewriteNew_01();
        rn.getRewriteNew(driver);

        RenewalStart_01 rs = new RenewalStart_01();
        rs.getRenewalStart(driver);

        SeleniumToExcel_01.incrementCounterAfterAllTransactions();
    }

    private static void incrementCounter() {
        // Ensure the counter.properties file exists or create it if it doesn't
        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream("counter.properties1")) {
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

        try (OutputStream outputStream = new FileOutputStream("counter.properties1")) {
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
