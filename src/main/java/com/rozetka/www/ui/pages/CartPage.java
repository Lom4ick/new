package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {

    private static final String ADD_BUTTON = "//button[@aria-label='Добавить ещё один товар']";
    private static final String PRICE = "//p[@class='cart-product__price']";
    private static final String MAKE_ORDER = "//a[@class='button button_size_large button_color_green cart-receipt__submit']";
    private static final String CHOOSE_BUTTON = "//button[@class='button button--white button--small cart-actions__toggle']";
    private static final String DELETE_BUTTON = "//*[@id=\"shoppingCartActions\"]/li[1]/button";
    private static final String EMPTY_CART = "//h4[@class='cart-dummy__heading']";

    @Step
    public CartPage addSamsungMonitor() {
        $x(ADD_BUTTON).click();
        return this;
    }

    @Step
    public CartPage verifyPrice(String expectedQuantity) {
        $x(PRICE).shouldHave(text(expectedQuantity));
        return this;
    }

    @Step
    public CartPage makeOrder() {
        $x(MAKE_ORDER).click();
        return this;
    }

    @Step
    public CartPage chooseOption() {
        $x(CHOOSE_BUTTON).click();
        return this;
    }

    @Step
    public CartPage deleteMonitor() {
        $x(DELETE_BUTTON).click();
        return this;
    }

    @Step
    public CartPage checkEmptyCart() {
        $x(EMPTY_CART).shouldBe(Condition.exist);
        return this;
    }
}
