package com.rozetka.www.ui.elements;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CartPopUp {

    private static final String ADD_BUTTON = "//button[@aria-label='Добавить ещё один товар']";
    private static final String PRICE = "//p[@class='cart-product__price']";
    private static final String MAKE_ORDER = "//a[@class='button button_size_large button_color_green cart-receipt__submit']";
    private static final String CHOOSE_BUTTON = "//button[@class='button button--white button--small cart-actions__toggle']";
    private static final String DELETE_BUTTON = "//*[@id=\"shoppingCartActions\"]/li[1]/button";
    private static final String EMPTY_CART = "//h4[@class='cart-dummy__heading']";

    @Step
    public CartPopUp addItem() {
        $x(ADD_BUTTON).click();
        return this;
    }

    @Step
    public CartPopUp verifyPrice(String expectedQuantity) {
        $x(PRICE).shouldHave(text(expectedQuantity));
        return this;
    }

    @Step
    public CartPopUp makeOrder() {
        $x(MAKE_ORDER).click();
        return this;
    }

    @Step
    public CartPopUp chooseOption() {
        $x(CHOOSE_BUTTON).click();
        return this;
    }

    @Step
    public CartPopUp deleteItem() {
        $x(DELETE_BUTTON).click();
        return this;
    }

    @Step
    public CartPopUp checkEmptyCart() {
        $x(EMPTY_CART).shouldBe(Condition.exist);
        return this;
    }
}
