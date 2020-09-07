package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Or;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {

    private static final String NOVAPOSHTA_DELIVERY = "/html/body/app-root/div/div[1]/rz-checkout-main/section/rz-checkout-orders/div/form/div/main/rz-checkout-order/div/div[2]/rz-checkout-order-deliveries/fieldset/ul/li[3]/rz-checkout-order-delivery-pickups/rz-checkout-order-delivery/div/div/label";
    private static final String CARD_PAYMENT = "/html/body/app-root/div/div[1]/rz-checkout-main/section/rz-checkout-orders/div/form/div/main/rz-checkout-order/div/div[2]/fieldset[2]/rz-checkout-order-payments/ul/li[3]/rz-checkout-order-payment/div/div/label/span/span";

    @Step
    public OrderPage checkNovaPoshta() {
        $x(NOVAPOSHTA_DELIVERY).click();
        return this;
    }

    @Step
    public OrderPage checkCardPayment() {
        $x(CARD_PAYMENT).click();
        return this;
    }

    @Step
    public OrderPage verifyCheckBoxes() {
        $x(NOVAPOSHTA_DELIVERY).isSelected();
        $x(CARD_PAYMENT).isSelected();
        return this;
    }

}
