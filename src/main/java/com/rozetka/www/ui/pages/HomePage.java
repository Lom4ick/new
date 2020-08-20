package com.rozetka.www.ui.pages;

import com.rozetka.www.ui.ReadFileData;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.rozetka.www.ui.DriverManager.getDriver;

public class HomePage {
    private static final String CABINET = "//a[@class='header-topline__user-link link-dashed']";
    private static final String LOGIN_INPUT = "//input[@id='auth_email']";
    private static final String PASSWORD_INPUT = "//input[@id='auth_pass']";
    private static final String ENTER_BUTTON = "//button[@class='button button_size_large button_color_green auth-modal__submit']";
    private static final String DELIVERY_PAYMENT = "//li[@class='main-links__item']/a[@href='https://rozetka.com.ua/payments-and-deliveries/']";
    private static final String COMPUTERS_LAPTOPS = "/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[1]/fat-menu/div/ul/li[1]/a";

    private static final String LOGIN_ERROR_MESSAGE = "//p[@class='error-message error-message_type_tooltip error-message_type_text error-message_color_red']";

    private ReadFileData data = new ReadFileData();

    @Step
    public HomePage getHomePage() {
        getDriver().get(data.getHomePageUrl());
        return this;
    }

    @Step
    public HomePage clickCabinet() {
        getDriver().findElement(By.xpath(CABINET)).click();
        return this;
    }

    @Step
    public HomePage setLogin(String login) {
        getDriver().findElement(By.xpath(LOGIN_INPUT)).sendKeys(login);
        return this;
    }

    @Step
    public HomePage setPassword(String password) {
        getDriver().findElement(By.xpath(PASSWORD_INPUT)).sendKeys(password);
        return this;
    }

    @Step
    public HomePage clickEnterButton() {
        getDriver().findElement(By.xpath(ENTER_BUTTON)).click();
        return this;
    }


    @Step
    public WebElement verifyLoginErrorMessage() {
        return getDriver().findElement(By.xpath(LOGIN_ERROR_MESSAGE));
    }

    @Step
    public HomePage clickDeliveryPayment() {
        getDriver().findElement(By.xpath(DELIVERY_PAYMENT)).click();
        return this;
    }

    @Step
    public HomePage clickComputersLaptops() {
        getDriver().findElement(By.xpath(COMPUTERS_LAPTOPS)).click();
        return this;
    }
}

