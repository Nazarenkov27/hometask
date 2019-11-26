package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RepoHelper extends PageManager {
    public RepoHelper() {
        super(AppManager.getWebDriver());
    }


    public void selectFirstResult() {
        searchPage.selectFirstSearchResult();
    }

    public String getSearchValue() {
        return homePage.getSearchFieldValue();
    }

    public void searchForRepo(String text) {
        homePage.searchForRepository(text);
        searchPage.selectFirstSearchResult();
    }

    public List<String> getRepoListValue() {
        List<String> list = new ArrayList<>();
        for (WebElement item : searchPage.getRepoList()) {
            list.add(item.getText());
        }
        return list;
    }

    public void sortByFewerStars() {
        searchPage.sortByFewerStars();
    }
}
