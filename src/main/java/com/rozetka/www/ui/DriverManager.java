package com.rozetka.www.ui;

import com.codeborne.selenide.Configuration;
import com.utils.PropertiesController;

import java.util.Objects;

import static com.utils.PropertiesNames.*;


public class DriverManager {

    public static void setUpBrowser() {
        String browser = Objects.requireNonNull(PropertiesController.getProperty(BROWSER));

        Configuration.baseUrl = PropertiesController.getProperty(SITE_HOST);
        Configuration.timeout = Long.parseLong(Objects.requireNonNull(PropertiesController.getProperty(TIMEOUT)));
        Configuration.startMaximized = true;

        switch (browser) {
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "chrome":
            default:
                Configuration.browser = "chrome";
                break;
        }
    }

}
