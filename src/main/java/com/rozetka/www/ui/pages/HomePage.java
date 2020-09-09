package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static final String COMPUTERS_LAPTOPS = "//a[@href='https://rozetka.com.ua/computers-notebooks/c80253/']";
    private static final String CATALOG = "//span[@class='menu-toggler__text']";
    private static final String DELIVERY_PAYMENT = "//li[@class='main-links__item']/a[@href='https://rozetka.com.ua/payments-and-deliveries/']";

    @Step
    public HomePage clickCatalog() {
        $x(CATALOG).click();
        return this;
    }


    @Step
    public HomePage clickComputersLaptops() {
        $x(COMPUTERS_LAPTOPS).click();
        return this;
    }

    @Step
    public HomePage clickDeliveryPayment() {
        $x(DELIVERY_PAYMENT).shouldBe(Condition.appears);
        return this;
    }
}

