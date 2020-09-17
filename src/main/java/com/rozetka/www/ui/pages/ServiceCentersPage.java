package com.rozetka.www.ui.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class ServiceCentersPage {

    private static String MANUFACTURER = "//input[@class='autocomplete__input ng-pristine ng-valid ng-touched']";
    private static String GROOMERS = "//a[@href='https://rozetka.com.ua/service-centers/philips/81225/']";
    private static String UMAN_CITY = "//a[@href='https://rozetka.com.ua/service-centers/philips/81225/64/']";
    private static String SERVICE_CENTER = "//div[@class='service__address'][contains(text(),' ул. Независимости 90 ')]";

    public ServiceCentersPage findServiceCenters (){
        $x(MANUFACTURER).click();
        $x(MANUFACTURER).setValue("Phillips");
        $x(GROOMERS).click();
        $x(UMAN_CITY).click();
        return this;
    }

    public ServiceCentersPage verifyServiceCenters (){
        $x(SERVICE_CENTER).should(Condition.exist);
        return this;
    }
}
