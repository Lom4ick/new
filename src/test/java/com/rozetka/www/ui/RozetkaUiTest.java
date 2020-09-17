package com.rozetka.www.ui;

import com.rozetka.www.ui.elements.*;
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
    private Footer footer = new Footer();
    private DeliveryPaymentPage deliveryPaymentPage = new DeliveryPaymentPage();
    private CreditPage creditPage = new CreditPage();
    private WarrantyPage warrantyPage = new WarrantyPage();
    private ItemReturnPage itemReturnPage = new ItemReturnPage();
    private ServiceCentersPage serviceCentersPage = new ServiceCentersPage();




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
                .clickFirstItem("Mонитор 23.5\" Samsung Gaming C24RG50 (LC24RG50FQIXCI) - частота обновления 144 Гц");
        itemPage
                .buyItem();
        cartPopUp
                .addItem()
                .verifyPrice(" 8 888")
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
                .clickFirstItem("Mонитор 23.5\" Samsung Gaming C24RG50 (LC24RG50FQIXCI) - частота обновления 144 Гц");
        itemPage
                .buyItem();
        cartPopUp
                .addItem()
                .deleteItem()
                .checkEmptyCart();
    }

    @Feature("Deliveries and payments check")
    @Test
    public void deliveriesAndPaymentsOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Серверное оборудование");
        footer
                .paymentsAndDeliveriesClick();
        deliveryPaymentPage
                .verifyStressInfo();
    }

    @Feature("Credit check")
    @Test
    public void creditOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Серверное оборудование");
        footer
                .creditClick();
        creditPage
                .verifyBanksPartners();
    }

    @Feature("Warranty check")
    @Test
    public void warrantyOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Серверное оборудование");
        footer
                .warrantyClick();
        warrantyPage
                .verifyEverestService();
    }

    @Feature("Item Return check")
    @Test
    public void itemReturnOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Серверное оборудование");
        footer
                .itemReturnClick();
        itemReturnPage
                .verifyItemReturn();
    }

    @Feature("Service Centers check")
    @Test
    public void serviceCentersOperations() {
        header
                .clickCatalog();
        catalogPopUp
                .clickComputersLaptops();
        categoryPage
                .clickCategory("Серверное оборудование");
        footer
                .serviceCentersClick();
        serviceCentersPage
                .findServiceCenters()
                .verifyServiceCenters();
    }
}
