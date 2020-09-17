package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class CreditPage {

    private static String BANKS_PARTNERS = "//div/h2[contains(text(),'Банки - партнери')]";

    public CreditPage verifyBanksPartners (){
        $x(BANKS_PARTNERS).should(Condition.exist);
        return this;
    }
}
