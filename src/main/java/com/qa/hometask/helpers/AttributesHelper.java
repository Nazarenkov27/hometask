package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;

public class AttributesHelper extends PageManager {
    public AttributesHelper() {
        super(AppManager.getWebDriver());
    }

    @Step("Get the logo name")
    public String getLogoName() {
        return blogPage.getLogoName();
    }

    @Step("Get the posts header")
    public String getPostsHeader() {
        return blogPage.getPostsHeader();
    }

    @Step("Get files number")
    public int getFilesNumber() {
        return repositoryPage.getFilesNumber();
    }

    @Step("Get directories number")
    public int getDirectoriesNumber() {
        return repositoryPage.getDirectoriesNumber();
    }

    @Step("Get tabs number")
    public int getTabsNumber() {
        return notificationsPage.getTabsNumber();
    }

    @Step("Get the name of the first tab")
    public String getFirstTabName() {
        return notificationsPage.getFirstTabName();
    }

    @Step("Get the twitter name")
    public String getTwitterName() {
        return twitterPage.getTwitterName();
    }

    @Step("Check if twitter account is verified")
    public boolean verifyTwitterAccount() {
        return twitterPage.verifyTwitterAccount();
    }

    @Step("Get the Twitter link")
    public String getTwitterLink() {
        return twitterPage.getTwitterLink();
    }

}
