package com.rozetka.www.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.rozetka.www.ui.DriverManager.getDriver;

public class GamingPage {

    private static final String LINK_PSSTORE = "/html/body/app-root/div/div[1]/rz-super-portal/div/main/section/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]";

    @Step
    public GamingPage clickPsStore() {
        getDriver().findElement(By.xpath(LINK_PSSTORE)).click();
        return this;
    }
}
