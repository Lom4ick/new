package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;


public class CategoryPage {

    private static final String CATEGORY = "//div/a[@class='tile-cats__picture'][contains(@title,'%s')]";

    @Step
    public CategoryPage clickCategory(String category) {
        $x(String.format(CATEGORY, category)).click();
        return this;
    }

    @Step
    public CategoryPage verifyCategory(String category) {
        $x(String.format(CATEGORY, category)).shouldBe(Condition.appears);
        return this;
    }
}
