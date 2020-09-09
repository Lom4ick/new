package com.rozetka.www.ui;

import com.rozetka.www.ui.elements.Header;
import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class RozetkaUiTest extends BaseUiTest {

    private HomePage homePage = new HomePage();
    private ComputersLaptopsPage computersLaptopsPage = new ComputersLaptopsPage();
    private MonitorPage monitorPage = new MonitorPage();
    private SamsungMonitorPage samsungMonitorPage = new SamsungMonitorPage();
    private OrderPage orderPage = new OrderPage();
    private Header header = new Header();
    private RegistrationPage registrationPage = new RegistrationPage();
    private CartPage cartPage = new CartPage();

    @Feature("Not Full Registration with Error")
    @Test
    public void registrationNotFull() {
        header
                .clickCabinet();
        registrationPage
                .registrationMailErrorCheck();
    }

    @Feature("Monitor Order")
    @Test
    public void monitorOrder() {
        homePage
                .clickCatalog()
                .clickComputersLaptops();
        computersLaptopsPage
                .clickCategory();
        monitorPage
                .clickItem();
        samsungMonitorPage
                .buySamsungMonitor();
        cartPage
                .addSamsungMonitor()
                .verifyPrice(" 6 458")
                .makeOrder();
        orderPage
                .selectNovaPoshta()
                .selectCardPayment()
                .isNovaPoshtaSelected()
                .isCardPaymentSelected();
    }

    @Feature("Cart Operations")
    @Test
    public void cartOperations() {
        homePage
                .clickCatalog()
                .clickComputersLaptops();
        computersLaptopsPage
                .clickCategory();
        monitorPage
                .clickItem();
        samsungMonitorPage
                .buySamsungMonitor();
        cartPage
                .addSamsungMonitor()
                .deleteMonitor()
                .checkEmptyCart();
    }

}
