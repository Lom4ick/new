package com.rozetka.www.ui.pages;


import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SamsungMonitorPage {
    private static final String BUY_BUTTON = "/html/body/app-root/div/div[1]/app-rz-product/div/product-tab-main/div[1]/div[1]/div[2]/product-main-info/div[1]/div/app-product-buy-btn/app-buy-button/button/span";
    private static final String ADD_BUTTON = "/html/body/app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/ul/li/rz-cart-product/div/div[2]/rz-cart-counter/div/button[2]";
    private static final String QUANTITY = "//input[@class='cart-counter__input ng-pristine ng-valid ng-touched']";
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
    public SamsungMonitorPage verifyQuantity() {
        $x(QUANTITY).val("2");
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
