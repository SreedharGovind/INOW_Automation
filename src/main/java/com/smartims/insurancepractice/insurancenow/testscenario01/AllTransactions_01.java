package com.smartims.insurancepractice.insurancenow.testscenario01;


import com.smartims.insurancepractice.insurancenow.commonClasses.CommonClass;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllTransactions_01 {
    public static void main(String[] args) throws Exception {
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
    }
}
