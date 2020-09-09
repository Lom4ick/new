package com.rozetka.www.ui.pages;


import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class SamsungMonitorPage {
    private static final String BUY_BUTTON = "//button//span[.=' Купить ']";

    @Step
    public SamsungMonitorPage buySamsungMonitor() {
        $x(BUY_BUTTON).click();
        return this;
    }

}
