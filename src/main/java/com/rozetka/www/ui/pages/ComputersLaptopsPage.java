package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;


public class ComputersLaptopsPage {

    private static final String LINK_GAMING = "/html/body/app-root/div/div[1]/rz-super-portal/div/main/section/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[4]/rz-list-tile/div/a[2]";

    @Step
    public ComputersLaptopsPage clickGaming() {
        $x(LINK_GAMING).click();
        return this;
    }
}
