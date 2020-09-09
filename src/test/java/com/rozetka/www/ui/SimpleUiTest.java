package com.rozetka.www.ui;

import com.rozetka.www.ui.elements.CatalogPopUp;
import com.rozetka.www.ui.elements.Header;
import com.rozetka.www.ui.elements.RegistrationPopUp;
import com.rozetka.www.ui.elements.SiteMap;
import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class SimpleUiTest extends BaseUiTest {

    private DeliveryPaymentPage deliveryPaymentPage = new DeliveryPaymentPage();
    private CategoryPage categoryPage = new CategoryPage();
    private Header header = new Header();
    private CatalogPopUp catalogPopUp = new CatalogPopUp();
    private RegistrationPopUp registrationPopUp = new RegistrationPopUp();
    private SiteMap siteMap = new SiteMap();

    @Feature("Authorization")
    @Test
    public void authorizationWrongLogin() {
        header
                .clickCabinet();
        registrationPopUp
                .authorize()//TODO fix xpath
                .verifyLoginErrorMessage();
    }

    @Feature("Delivery Payment Check")
    @Test
    public void checkDeliveryPayment() {
        siteMap
                .clickDeliveryPayment();
        deliveryPaymentPage
                .verifyLinkNovaPoshta();
    }

    @Feature("Kids Consoles Check")
    @Test
    public void checkKidsConsoles() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Gaming")
                .clickCategory("Playstation Store")
                .verifyCategory("Игровые консоли и детские приставки");
    }
}
