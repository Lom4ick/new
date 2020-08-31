package com.rozetka.www.ui;

import com.codeborne.selenide.Configuration;
import com.rozetka.www.ui.utils.PropertiesController;
import com.rozetka.www.ui.utils.PropertiesNames;

import lombok.var;

import java.util.Objects;

import static com.rozetka.www.ui.utils.PropertiesNames.*;


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
