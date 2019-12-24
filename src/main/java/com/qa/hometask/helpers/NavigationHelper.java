package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import com.qa.hometask.utils.PropertyLoader;

public class NavigationHelper extends PageManager {
    public NavigationHelper() {
        super(AppManager.getWebDriver());
    }

    public void openNotificationsPage() {
        homePage.openNotificationsPage();
    }

    public void goToBlog() {
        homePage.goToBlog();
    }

    public void goToGithubLink(String link) {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + link);
    }
    public void goToGithubLink() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link"));
    }

}
