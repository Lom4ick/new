package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ItemsPage {

    private static final String ITEM = "//img[@class='lazy_img_hover display-none'][contains(@title,'%s')]";

    @Step
    public ItemsPage clickFirstItem(String item) {
        $x(ITEM).hover();
        $x(String.format(ITEM, item)).click();
        return this;
    }
}
