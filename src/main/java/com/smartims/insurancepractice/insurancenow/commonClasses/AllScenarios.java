package com.smartims.insurancepractice.insurancenow.commonClasses;

import com.smartims.insurancepractice.insurancenow.testScenario02.AllTransactions_02;
import com.smartims.insurancepractice.insurancenow.testscenario01.AllTransactions_01;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.io.IOException;
public class AllScenarios {
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {

        AllTransactions_01 a = new AllTransactions_01();
        a.allTransactions_01();

        AllTransactions_02 b = new AllTransactions_02();
        b.allTransactions_02();

    }
}