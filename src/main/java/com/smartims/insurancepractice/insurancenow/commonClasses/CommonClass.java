package com.smartims.insurancepractice.insurancenow.commonClasses;

import com.smartims.insurancepractice.insurancenow.voClasses.CredentialsVO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;


public class CommonClass {

    public static ChromeDriver getchromedriver() throws IOException {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(ConstantsClass.localHostUrl);
        CredentialsVO cvo = new CredentialsVO();
        cvo.setUserName(ExcelUtilsCredentials.getCellValueByLabel("userName"));
        cvo.setPassword(ExcelUtilsCredentials.getCellValueByLabel("password"));
        driver.findElement(By.id(ConstantsClass.username)).sendKeys(cvo.getUserName());
        driver.findElement(By.id(ConstantsClass.password)).sendKeys(cvo.getPassword(), Keys.ENTER);
        return driver;
    }
}
