package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;

public class NotificationsHelper extends PageManager {
    public NotificationsHelper() {
        super(AppManager.getWebDriver());
    }

    @Step("Get the alert message")
    public String getAlertMessage() {
        return sessionPage.getAlertMessage();
    }

    @Step("Close the alert")
    public void closeAlert() {
        sessionPage.closeAlert();
    }
}