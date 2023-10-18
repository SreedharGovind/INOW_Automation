package com.smartims.insurancepractice.insurancenow.testScenario01;


import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import com.smartims.insurancepractice.insurancenow.voClasses.BatchJobVO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BatchJob_06 {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void batchJob(ChromeDriver driver) throws InterruptedException {

        BatchJobVO bjo = new BatchJobVO();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab).perform();
        policyTab.click();

        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000012-01");

        WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton).perform();
        searchButton.click();
        driver.findElement(By.id("Tab_Tasks")).click();
        WebElement dataElement = driver.findElement(By.id("Task_WorkDt_3"));
        // Read the data from the element
        String data = dataElement.getText(); // Corrected to use the 'data' variable
        // Close the WebDriver
        System.out.println(data);
        setData(data); // Corrected to use the 'data' variable
        WebElement batchJobMenu = driver.findElement(By.id(Constants_03.adminMenu));
        actions.moveToElement(batchJobMenu).perform();
        driver.findElement(By.id("Menu_Admin_ChangeDate")).click();
//        WebElement changeDateMenu = driver.findElement(By.id("Menu_Admin_ChangeDate"));
//        actions.moveToElement(changeDateMenu).perform();
        driver.findElement(By.id(Constants_03.newdate)).sendKeys(getData());
        driver.findElement(By.id("ChangeDate")).click();
        driver.findElement(By.id(Constants_03.newBookDate)).sendKeys(getData());
driver.findElement(By.id("ChangeBookDate")).click();
Thread.sleep(1000);
        WebElement BatchJob = driver.findElement(By.id(Constants_03.menuOperations));
        actions.moveToElement(BatchJob).perform();
        driver.findElement(By.id(Constants_03.menuOperationsBatchJobs)).click();
        driver.findElement(By.id(Constants_03.dailyManual)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(Constants_03.questionRunDt)).sendKeys(getData());
        driver.findElement(By.id(Constants_03.question_InceptionDt)).sendKeys(getData());
        driver.findElement(By.id(Constants_03.skipAll)).click();
        driver.findElement(By.id(Constants_03.skip_ActionARCycle)).click();
        driver.findElement(By.id(Constants_03.skip_ActionTaskSystem)).click();
        driver.findElement(By.id(Constants_03.startJobAction)).click();
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[4]/div/div[1]/div[2]/span[2]/a")).click();

        WebElement policyTab2 = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
        actions.moveToElement(policyTab2).perform();
        policyTab.click();

        driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000012-01");

        WebElement searchButton2 = driver.findElement(By.xpath(ConstantsClass.searchButton));
        actions.moveToElement(searchButton2).perform();
        searchButton.click();

    }

//




    }
