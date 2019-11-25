package com.qa.hometask.helpers;

        import com.qa.hometask.manageres.AppManager;
        import com.qa.hometask.manageres.PageManager;

public class NotificationsHelper extends PageManager {
    public NotificationsHelper() {
        super(AppManager.getWebDriver());
    }

    public String getAlertMessage() {
        return sessionPage.getAlertMessage();
    }

    public void closeAlert() {
        sessionPage.closeAlert();
    }

}
