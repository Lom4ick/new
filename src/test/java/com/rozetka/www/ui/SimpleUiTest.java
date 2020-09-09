package com.rozetka.www.ui;

import com.rozetka.www.ui.elements.Header;
import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class SimpleUiTest extends BaseUiTest {
    private HomePage homePage = new HomePage();
    private DeliveryPaymentPage deliveryPaymentPage = new DeliveryPaymentPage();
    private ComputersLaptopsPage computersLaptopsPage = new ComputersLaptopsPage();
    private GamingPage gamingPage = new GamingPage();
    private PsStore psStore = new PsStore();
    private Header header = new Header();
    private RegistrationPage registrationPage = new RegistrationPage();

    @Feature("authorization")
    @Test
    public void authorizationWrongLogin() {
        header
                .clickCabinet();
        registrationPage
                .authorize()
                .verifyLoginErrorMessage();
    }

    @Feature("DeliveryPaymentCheck")
    @Test
    public void checkDeliveryPayment() {
        homePage
                .clickDeliveryPayment();
        deliveryPaymentPage
                .verifyLinkNovaPoshta();
    }

    @Feature("KidsConsoles Check")
    @Test
    public void checkKidsConsoles() {
        homePage
                .clickComputersLaptops();
        computersLaptopsPage
                .clickGaming();
        gamingPage
                .clickPsStore();
        psStore
                .verifyKidsConsoles();
    }
}
