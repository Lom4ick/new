package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.rozetka.www.ui.DriverManager.getDriver;

public class DeliveryPaymentPage {
    private static final String LINK_NOVA_POSHTA = "//span[contains(text(),'Курьер «Нова пошта»')]";


    @Step
    public WebElement verifyLinkNovaPoshta() {
        return getDriver().findElement(By.xpath(LINK_NOVA_POSHTA));
    }
}