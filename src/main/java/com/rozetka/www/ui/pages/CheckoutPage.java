package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {

    private static final String NOVAPOSHTA_DELIVERY = "//span[contains(text(),' Самовывоз из Новой Почты ')]";
    private static final String NOVAPOSHTA_DELIVERY_CHECKBOX = "//span[contains(text(),' Самовывоз из Новой Почты ')]/../../../input[@type='radio']";
    private static final String CARD_PAYMENT = "//span[contains(text(),' Картой онлайн ')]";
    private static final String CARD_PAYMENT_CHECKBOX = "//span[contains(text(),' Картой онлайн ')]/../../../input[@type='radio']";

    @Step
    public CheckoutPage selectNovaPoshta() {
        $x(NOVAPOSHTA_DELIVERY).click();
        return this;
    }

    @Step
    public CheckoutPage selectCardPayment() {
        $x(CARD_PAYMENT).click();
        return this;
    }

    @Step
    public CheckoutPage isNovaPoshtaSelected() {
        Assert.assertTrue($x(NOVAPOSHTA_DELIVERY_CHECKBOX).isSelected(), "Expected DELIVERY checkbox was not selected\n");
        return this;
    }

    @Step
    public CheckoutPage isCardPaymentSelected() {
        Assert.assertTrue($x(CARD_PAYMENT_CHECKBOX).isSelected(), "Expected PAYMENT checkbox was not selected\n");
        return this;
    }
}
