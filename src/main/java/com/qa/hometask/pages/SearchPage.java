package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends Page {

    public SearchPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "(id('jump-to-results')/li)[2]")
    private WebElement firstSearchResult;
    @FindBy(xpath = "//ul[@class = 'repo-list']/li/div/h3")
    private List<WebElement> searchResultList;
    @FindBy(xpath = "//summary/i")
    private WebElement sortOptionsMenuButtonLocator;
    @FindBy(xpath = "//details-menu")
    private WebElement sortOptionsMenuLocator;
    @FindBy(xpath = "//details-menu/div[@class = 'select-menu-list']/a[3]")
    private WebElement fewerStarsOptionLocator;

    public void selectFirstSearchResult() {
        wait.until(ExpectedConditions.visibilityOf(firstSearchResult));
        firstSearchResult.click();
    }

    public List<WebElement> getRepoList() {
        wait.until(ExpectedConditions.visibilityOf(searchResultList.get(0)));
        return searchResultList;
    }

    public void sortByFewerStars() {

        wait.until(ExpectedConditions.visibilityOf(sortOptionsMenuButtonLocator));
        sortOptionsMenuButtonLocator.click();
        wait.until(ExpectedConditions.visibilityOf(fewerStarsOptionLocator));
        fewerStarsOptionLocator.click();
        wait.until(ExpectedConditions.stalenessOf(searchResultList.get(0)));
    }
}
