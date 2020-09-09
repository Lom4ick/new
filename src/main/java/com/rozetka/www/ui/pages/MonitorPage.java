package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MonitorPage {

    private static final String SAMSUNG_MONITOR = "//a[@class='goods-tile__picture']";

    @Step
    public MonitorPage clickItem() {
        $x(SAMSUNG_MONITOR).click();
        return this;
    }
}
