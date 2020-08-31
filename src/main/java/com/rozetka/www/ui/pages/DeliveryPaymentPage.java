package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class DeliveryPaymentPage {
    private static final String LINK_NOVA_POSHTA = "//span[contains(text(),'Курьер «Нова пошта»')]";


    @Step
    public DeliveryPaymentPage verifyLinkNovaPoshta() {
        $x(LINK_NOVA_POSHTA).shouldBe(Condition.appears);
        return this;
    }
}