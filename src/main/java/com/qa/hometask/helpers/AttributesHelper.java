package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;

public class AttributesHelper extends PageManager {
    public AttributesHelper() {
        super(AppManager.getWebDriver());
    }

    public String getLogoName() {
        return blogPage.getLogoName();
    }

    public String getPostsHeader() {
        return blogPage.getPostsHeader();
    }

    public int getFilesNumber() {
        return repositoryPage.getFilesNumber();
    }

    public int getDirectoriesNumber() {
        return repositoryPage.getDirectoriesNumber();
    }

    public int getTabsNumber() {
        return notificationsPage.getTabsNumber();
    }

    public String getFirstTabName() {
        return notificationsPage.getFirstTabName();
    }

    public String getTwitterName() {
        return twitterPage.getTwitterName();
    }

    public boolean verifyTwitterAccount(){
        return twitterPage.verifyTwitterAccount();
    }

    public String getTwitterLink() {
        return twitterPage.getTwitterLink();
    }

}
