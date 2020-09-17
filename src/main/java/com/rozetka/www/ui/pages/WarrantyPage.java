package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.$x;

public class WarrantyPage {

    private static String EVEREST_SERVICE = "//a[@href='https://rozetka.com.ua/everest_pickup/']";

    public WarrantyPage verifyEverestService (){
        $x(EVEREST_SERVICE).should(Condition.exist);
        return this;
    }
}
