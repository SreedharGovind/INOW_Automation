package com.smartims.insurancepractice.insurancenow.testscenario01;

import com.smartims.insurancepractice.insurancenow.commonClasses.ConstantsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ResindCancellation_01 {
    void getResindCancellation(ChromeDriver driver) throws IOException, InterruptedException {
        Actions actions = new Actions(driver);
        driver.findElement(By.id(ConstantsClass.resindCancellationContextMenuHistoryActions)).click();
        WebElement select = driver.findElement(By.id(ConstantsClass.resindCancellationContextMenuHistoryActionsdropdown));
        actions.moveToElement(select).perform();
        driver.findElement(By.id(ConstantsClass.resindCancellationRescind)).click();
        driver.findElement(By.id(ConstantsClass.resindCancellationTransactionLongDescription)).sendKeys("Text");
        driver.findElement(By.id(ConstantsClass.resindCancellationStart)).click();
        driver.findElement(By.id(ConstantsClass.resindCancellationProcess)).click();
    }
}
