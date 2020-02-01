package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Step;

public class NavigationHelper extends PageManager {
    public NavigationHelper() {
        super(AppManager.getWebDriver());
    }

    @Step("Open /notifications page")
    public void openNotificationsPage() {
        homePage.openNotificationsPage();
    }

    @Step("Open /blog page")
    public void goToBlog() {
        homePage.goToBlog();
    }

    @Step("Navigate to github.com/{0}")
    public void goToGithubLink(String link) {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + link);
    }

    @Step("Navigate to github.com/")
    public void goToGithubLink() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link")); // this method could be replaces with goToGithubLink("")';
    }

    @Step("Go to the Twitter page")
    public void goToTwitter() {
        aboutPage.followTwitter();
    }

}
