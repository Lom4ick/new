package com.rozetka.www.ui;

import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class SimpleUiTest extends BaseUiTest{
    private HomePage homePage = new HomePage();
    private DeliveryPaymentPage deliveryPaymentPage = new DeliveryPaymentPage();
    private ComputersLaptopsPage computersLaptopsPage = new ComputersLaptopsPage();
    private GamingPage gamingPage = new GamingPage();
    private PsStore psStore = new PsStore();

    @Feature("authorization")
    @Test
    public void authorizationWrongLogin() {
        homePage
                .getHomePage()
                .clickCabinet()
                .setLogin("fsfhfghsfg@sdadt.com")
                .setPassword("wrongPassword")
                .clickEnterButton()
                .verifyLoginErrorMessage();
    }

    @Feature("DeliveryPaymentCheck")
    @Test
    public void checkDeliveryPayment(){
            homePage
                .getHomePage()
                .clickDeliveryPayment();
            deliveryPaymentPage
                    .verifyLinkNovaPoshta();
    }

    @Feature("KidsConsoles Check")
    @Test
    public void checkKidsConsoles() {
        homePage
                .getHomePage()
                .clickComputersLaptops();
        computersLaptopsPage
                .clickGaming();
        gamingPage
                .clickPsStore();
        psStore
                .verifyKidsConsoles();
    }
}
