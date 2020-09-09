package com.rozetka.www.ui;

import com.rozetka.www.ui.elements.CartPopUp;
import com.rozetka.www.ui.elements.CatalogPopUp;
import com.rozetka.www.ui.elements.Header;
import com.rozetka.www.ui.elements.RegistrationPopUp;
import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class RozetkaUiTest extends BaseUiTest {

    private CategoryPage categoryPage = new CategoryPage();
    private ItemsPage itemsPage = new ItemsPage();
    private ItemPage itemPage = new ItemPage();
    private CheckoutPage checkoutPage = new CheckoutPage();
    private Header header = new Header();
    private CatalogPopUp catalogPopUp = new CatalogPopUp();
    private RegistrationPopUp registrationPopUp = new RegistrationPopUp();
    private CartPopUp cartPopUp = new CartPopUp();

    @Feature("Not Full Registration with Error")
    @Test
    public void registrationNotFull() {
        header
                .clickCabinet();
        registrationPopUp
                .registrationMailErrorCheck();
    }

    @Feature("Monitor Order")
    @Test
    public void monitorOrder() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Мониторы");
        itemsPage
                .clickFirstItem();
        itemPage
                .buyItem();
        cartPopUp
                .addItem()
                .verifyPrice(" 6 458")
                .makeOrder();
        checkoutPage
                .selectNovaPoshta()
                .selectCardPayment()
                .isNovaPoshtaSelected()
                .isCardPaymentSelected();
    }

    @Feature("Cart Operations")
    @Test
    public void cartOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Мониторы");
        itemsPage
                .clickFirstItem();
        itemPage
                .buyItem();
        cartPopUp
                .addItem()
                .deleteItem()
                .checkEmptyCart();
    }

}
