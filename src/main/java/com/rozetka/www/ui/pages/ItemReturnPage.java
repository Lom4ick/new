package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class ItemReturnPage {

    private static String LOGIN = "//input[@data-title='Эл. почта или телефон']";

    public ItemReturnPage verifyItemReturn (){
        $x(LOGIN).should(Condition.exist);
        return this;
    }
}
