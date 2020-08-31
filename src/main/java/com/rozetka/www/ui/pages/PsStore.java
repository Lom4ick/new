package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PsStore {

    private static final String LINK_KIDSCONSOLE = "/html/body/app-root/div/div[1]/rz-super-portal/div/main/section/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]";

    @Step
    public PsStore verifyKidsConsoles() {
        $x(LINK_KIDSCONSOLE).shouldBe(Condition.appears);
        return this;
    }
}
