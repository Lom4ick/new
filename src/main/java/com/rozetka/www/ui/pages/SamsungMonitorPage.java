package com.rozetka.www.ui.pages;


import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class SamsungMonitorPage {
    private static final String BUY_BUTTON = "//button//span[.=' Купить ']";
    private static final String ADD_BUTTON = "//button[@aria-label='Добавить ещё один товар']";
    private static final String PRICE = "//p[@class='cart-product__price']";
    private static final String MAKE_ORDER = "//a[@class='button button_size_large button_color_green cart-receipt__submit']";
    private static final String DELETE_BUTTON = "//*[@id=\"shoppingCartActions\"]/li[1]/button";
    private static final String EMPTY_CART = "//h4[@class='cart-dummy__heading']";


    @Step
    public SamsungMonitorPage buySamsungMonitor() {
        $x(BUY_BUTTON).click();
        return this;
    }

    @Step
    public SamsungMonitorPage addSamsungMonitor() {
        $x(ADD_BUTTON).click();
        return this;
    }

    @Step
    public SamsungMonitorPage verifyPrice(String expectedQuantity) {
        $x(PRICE).shouldHave(text(expectedQuantity));
        return this;
    }

    @Step
    public SamsungMonitorPage makeOrder() {
        $x(MAKE_ORDER).click();
        return this;
    }

    @Step
    public SamsungMonitorPage deleteMonitor() {
        $x(DELETE_BUTTON).click();
        return this;
    }

    @Step
    public SamsungMonitorPage checkEmptyCart() {
        $x(EMPTY_CART).shouldBe(Condition.exist);
        return this;
    }
}
