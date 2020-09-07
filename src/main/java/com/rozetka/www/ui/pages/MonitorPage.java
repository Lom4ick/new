package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MonitorPage {

    private static final String SAMSUNG_MONITOR = "//img[@class='lazy_img_hover display-none']";

    @Step
    public MonitorPage clickSamsungMonitor() {
        $x(SAMSUNG_MONITOR).hover();
        $x(SAMSUNG_MONITOR).click();
        return this;
    }
}
