package com.rozetka.www.ui.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPopUp {

    private static final String COMPUTERS_LAPTOPS = "//a[@href='https://rozetka.com.ua/computers-notebooks/c80253/']";

    @Step
    public CatalogPopUp clickComputersLaptops() {
        $x(COMPUTERS_LAPTOPS).click();
        return this;
    }
}
