package com.smartims.insurancepractice.insurancenow.testScenario01;
import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
public class Cancellation_03 {
      public void getcancellation(ChromeDriver driver) throws IOException, InterruptedException {
            Actions actions = new Actions(driver);


                  WebElement policyTab = driver.findElement(By.xpath(ConstantsClass.policySearchTab));
                  actions.moveToElement(policyTab).perform();
                  policyTab.click();
                  driver.findElement(By.xpath(ConstantsClass.policyNumberTextField)).sendKeys("PA0000002-01");
                  WebElement searchButton = driver.findElement(By.xpath(ConstantsClass.searchButton));
                  actions.moveToElement(searchButton).perform();
                  searchButton.click();
                  driver.findElement(By.xpath(ConstantsClass.startTransactionButton)).click();
                  Select transaction = new Select(driver.findElement(By.xpath(ConstantsClass.startNewTransaction)));
                  transaction.selectByValue("Cancellation");
                  driver.findElement(By.xpath(ConstantsClass.selectButton)).click();
                  driver.findElement(By.xpath(ConstantsClass.cancellationNoticeDate)).sendKeys("09/23/2023");
                  driver.findElement(By.xpath(ConstantsClass.cancellationType)).click();
                  Select cancellationType = new Select(driver.findElement(By.xpath(ConstantsClass.cancellationType)));
                  cancellationType.selectByValue("Company");



            driver.findElement(By.xpath(ConstantsClass.additionalNoticeText)).sendKeys("Cancellation Notice Transaction");
                  driver.findElement(By.xpath(ConstantsClass.startButton)).click();
                  driver.findElement(By.xpath(ConstantsClass.processButton)).click();


            }}