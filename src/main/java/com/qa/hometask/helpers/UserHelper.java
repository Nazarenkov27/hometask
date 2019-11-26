package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;

public class UserHelper extends PageManager {
    public UserHelper() {
        super(AppManager.getWebDriver());
    }

    public void loginAs(String login, String pass) {
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
    }

    public void showMenu() {
        homePage.showMenu();
    }

    public String getProfileName() {
        return homePage.getProfileName();
    }

}
