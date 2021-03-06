package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RepoHelper extends PageManager {
    public RepoHelper() {
        super(AppManager.getWebDriver());
    }

    @Step("Select first result")
    public void selectFirstResult() {
        searchPage.selectFirstSearchResult();
    }

    @Step("Get the search field value")
    public String getSearchValue() {
        return homePage.getSearchFieldValue();
    }

    @Step("Search for the repository {0}")
    public void searchForRepo(String text) {
        homePage.searchForRepository(text);
        searchPage.selectFirstSearchResult();
    }

    @Step("Get the list of repositories")
    public List<String> getRepoListValue() {
        List<String> list = new ArrayList<>();
        for (WebElement item : searchPage.getRepoList()) {
            list.add(item.getText());
        }
        return list;
    }

    @Step("Sort repositories list by Fewer Stars")
    public void sortByFewerStars() {
        searchPage.sortByFewerStars();
    }

    @Step("Get repositories ratings")
    public List<String> getRepoRatingValue() {
        List<String> list = new ArrayList<>();
        for (WebElement item : searchPage.getRepoRating()) {
            list.add(item.getText());
        }
        return list;

    }

    @Step("Get the sum of repositories ratings")
    public int getRatingSum() {
        int ratingSum = 0;
        List<String> list = new ArrayList<>();
        for (String repoRating : getRepoRatingValue()) {
            if (repoRating.contains("k")) {
                repoRating = repoRating.replaceAll("k", "");
                if (repoRating.contains(".")) {
                    ratingSum += Integer.parseInt(repoRating.replaceAll("\\.", "")) * 100;
                } else {
                    ratingSum += Integer.parseInt(repoRating) * 1000;
                }
            } else {
                ratingSum += Integer.parseInt(repoRating);
            }

        }
        return ratingSum;
    }

    @Step("Get the value of the {0} language")
    public int getLanguageValue(String languageName) {
        int languageValue = Integer.parseInt(driver.findElement(By.xpath("//a[contains(.,'" + languageName + "')]/span"))
                .getText().replaceAll(",", ""));
        return languageValue;
    }
}