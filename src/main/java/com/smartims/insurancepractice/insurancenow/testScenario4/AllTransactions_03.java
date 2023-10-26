package com.smartims.insurancepractice.insurancenow.testScenario4;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllTransactions_03 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = CommonClass.getchromedriver();

        NewBusiness_03 nb = new NewBusiness_03();
        nb.getNewBussines(driver);

        Endorsement_03 ed = new Endorsement_03();
        ed.getEndorsement_03(driver);

        CancellationNotice_03 cn = new CancellationNotice_03();
        cn.getcancellationNotice(driver);

        RewriteNew_03 rn = new RewriteNew_03();
        rn.getRewriteNew(driver);

        BatchJob_06 b = new BatchJob_06();
        b.batchJob(driver);


    }


}
