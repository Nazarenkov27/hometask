package com.qa.hometask.helpers;

import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.By;
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


    public List<String> getRepoRatingValue() {
        List<String> list = new ArrayList<>();
        for (WebElement item : searchPage.getRepoRating()) {
            list.add(item.getText());
        }
        return list;

    }


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

    public int getLanguageValue(String languageName) {
        int languageValue = Integer.parseInt(driver.findElement(By.xpath("//a[contains(.,'" + languageName + "')]/span"))
                .getText().replaceAll(",",""));
        return languageValue;
    }

}
