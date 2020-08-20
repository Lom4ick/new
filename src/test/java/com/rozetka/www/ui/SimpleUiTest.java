package com.rozetka.www.ui;

import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleUiTest {

    @Feature("authorization")
    @Test
    public void authorizationWrongLogin() throws InterruptedException {
        // driver initialize
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        ProfilesIni profilesIni = new ProfilesIni();
        FirefoxProfile firefoxProfile = profilesIni.getProfile("default");
        firefoxProfile.setPreference("reader.parse-on-load.enabled",false);
        FirefoxOptions fo = new FirefoxOptions();
        fo.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        fo.setCapability(FirefoxDriver.PROFILE, firefoxProfile);

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //steps
        driver.get("https://rozetka.com.ua/");

        driver.findElement(By.xpath("//a[@class='header-user-link sprite-side whitelink xhr']")).click();
        driver.findElement(By.xpath("//div[@class='auth-f-i']/input[@type='text']")).sendKeys("kjsbdfjkbdsfjb@gmail.com");
        driver.findElement(By.xpath("//div[@class='auth-f-i']/input[@type='password']")).sendKeys("wrongPassword");
        driver.findElement(By.xpath("//button[@name='auth_submit']")).click();

        driver.findElement(By.xpath("//p[contains(text(),'Адрес kjsbdfjkbdsfjb@gmail.com недоступен для авторизации')]"));

        Thread.sleep(3000);

        //finalize
        driver.quit();
    }
}
