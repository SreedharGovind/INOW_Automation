package com.smartims.insurancepractice.insurancenow.testScenario01;


import com.smartims.insurancepractice.insurancenow.voClasses.BatchJobVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class BatchJob_06 {

    public void batchJob(ChromeDriver driver) throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BatchJobVO bjo = new BatchJobVO();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement BatchJob = driver.findElement(By.id(Constants_03.operations));
        actions.moveToElement(BatchJob).perform();
        WebElement BatchJob1 = driver.findElement(By.id("Menu_Admin_ChangeDate"));
        actions.moveToElement(BatchJob1).perform();
        driver.findElement(By.id(Constants_03.batchJob)).sendKeys("10/02/2022");
        driver.findElement(By.id("ChangeDate")).click();

        driver.findElement(By.id(Constants_03.dailyManual)).sendKeys("10/02/2022");
        driver.findElement(By.id("ChangeBookDate")).click();

        driver.findElement(By.name("Return")).click();


    }


}
