package com.smartims.insurancepractice.insurancenow.testscenario03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ResindCancellation_03 {
    void getResindCancellation(ChromeDriver driver) throws IOException, InterruptedException {
        Actions actions = new Actions(driver);
//        driver.findElement(By.id(ConstantClass_02.resindCancellationToolbarSearchText)).sendKeys("PA0000043-01");
//        driver.findElement(By.id(ConstantClass_02.resindCancellationToolbarSearch)).click();
        driver.findElement(By.id(ConstantClass_02.resindCancellationContextMenuHistoryActions)).click();
//        driver.findElement(By.id("ContextMenuHistoryActions_1_3")).click();
        WebElement select = driver.findElement(By.id(ConstantClass_02.resindCancellationContextMenuHistoryActionsdropdown));
        actions.moveToElement(select).perform();
        driver.findElement(By.id(ConstantClass_02.resindCancellationRescind)).click();
        driver.findElement(By.id(ConstantClass_02.resindCancellationTransactionLongDescription)).sendKeys("Text");
        driver.findElement(By.id(ConstantClass_02.resindCancellationStart)).click();
        driver.findElement(By.id(ConstantClass_02.resindCancellationProcess)).click();
    }
}
