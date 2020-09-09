package com.rozetka.www.ui.pages;


import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ItemPage {
    private static final String BUY_BUTTON = "//button//span[.=' Купить ']";

    @Step
    public ItemPage buyItem() {
        $x(BUY_BUTTON).click();
        return this;
    }
}
