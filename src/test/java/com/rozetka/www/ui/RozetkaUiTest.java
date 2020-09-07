package com.rozetka.www.ui;

import com.rozetka.www.ui.pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class RozetkaUiTest extends BaseUiTest {

    private HomePage homePage = new HomePage();
    private ComputersLaptopsPage computersLaptopsPage = new ComputersLaptopsPage();
    private MonitorPage monitorPage = new MonitorPage();
    private SamsungMonitorPage samsungMonitorPage = new SamsungMonitorPage();
    private OrderPage orderPage = new OrderPage();

    @Feature("Not Full Registration with Error")
    @Test
    public void registrationNotFull() {
        homePage
                .registrationMailErrorCheck();
    }

    @Feature("Monitor Order")
    @Test
    public void monitorOrder() {
        homePage
                .clickCatalog()
                .clickComputersLaptops();
        computersLaptopsPage
                .clickMonitor();
        monitorPage
                .clickSamsungMonitor();
        samsungMonitorPage
                .buySamsungMonitor()
                .addSamsungMonitor()
                .verifyPrice(" 6 458")
                .makeOrder();
        orderPage
                .selectNovaPoshta()
                .selectCardPayment()
                .verifyCheckBoxes();
    }

    @Feature("Cart Operations")
    @Test
    public void cartOperations() {
        homePage
                .clickCatalog()
                .clickComputersLaptops();
        computersLaptopsPage
                .clickMonitor();
        monitorPage
                .clickSamsungMonitor();
        samsungMonitorPage
                .buySamsungMonitor()
                .addSamsungMonitor()
                .deleteMonitor()
                .checkEmptyCart();
    }

}
