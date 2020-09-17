package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class DeliveryPaymentPage {

    private static final String LINK_NOVA_POSHTA = "//span[contains(text(),'Курьер «Нова пошта»')]";
    private static final String STRESS_INFO = "//article[@class='stress-info sprite-side']";

    @Step
    public DeliveryPaymentPage verifyLinkNovaPoshta() {
        $x(LINK_NOVA_POSHTA).shouldBe(Condition.appears);
        return this;
    }

    @Step
    public DeliveryPaymentPage verifyStressInfo() {
        $x(STRESS_INFO).shouldHave(Condition.exactTextCaseSensitive("Внимание! Тщательно проверяйте заказ при получении!"));
        return this;
    }


}