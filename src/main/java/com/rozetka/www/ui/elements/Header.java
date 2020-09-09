package com.rozetka.www.ui.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private static final String CABINET = "//a[@class='header-topline__user-link link-dashed']";

    @Step
    public Header clickCabinet() {
        $x(CABINET).click();
        return this;
    }
}
