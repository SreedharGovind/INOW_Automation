package com.smartims.insurancepractice.insurancenow.testScenario01;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllTransactions_01 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();

//        BatchJob_06 b = new BatchJob_06();
//        b.batchJob(driver);

        NewBusiness_01 nb = new NewBusiness_01();
        nb.getNewBussines(driver);
        Thread.sleep(10000);

        ChromeDriver driver1 = CommonClass.getchromedriver();

        CancellationNotice_05 cn = new CancellationNotice_05();
        cn.getcancellationNotice(driver1);

        CancellationNotice_05 cn1 = new CancellationNotice_05();
        cn1.getcancellationNotice(driver1);

        ChromeDriver driver2 = CommonClass.getchromedriver();

        Reinstatement_01 rb = new Reinstatement_01();
        rb.getReinstatement(driver2);



    }


}
