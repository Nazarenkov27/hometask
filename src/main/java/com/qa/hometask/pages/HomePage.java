package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

    public HomePage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//summary[contains(@aria-label,'View profile')]")
    private WebElement detailsMenu;
    @FindBy(xpath = "//a[@role='menuitem']/strong")
    private WebElement profileLink;
    @FindBy(xpath = "//*[contains(@href, 'blog')]")
    private WebElement blogLink;
    @FindBy(xpath = "//input[@name = 'q']")
    private WebElement searchField;
    @FindBy(xpath = "//*[contains (@class, 'notification-indicator')]")
    private WebElement notificationIcon;

    @Step("Show the menu")
    public void showMenu() {
        wait.until(ExpectedConditions.visibilityOf(detailsMenu));
        detailsMenu.click();
    }

    @Step("Open the Notifications page")
    public void openNotificationsPage() {
        wait.until(ExpectedConditions.visibilityOf(notificationIcon));
        notificationIcon.click();
    }

    @Step("Get the name of the profile")
    public String getProfileName() {
        wait.until(ExpectedConditions.visibilityOf(profileLink));
        return profileLink.getText();
    }

    @Step("Go to the Blog page")
    public void goToBlog() {
        wait.until(ExpectedConditions.visibilityOf(blogLink));
        blogLink.click();
    }

    @Step("Search for the repository {0}")
    public void searchForRepository(String text) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.clear();
        searchField.sendKeys(text);
    }

    @Step("Get the value of the search field")
    public String getSearchFieldValue() {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        return searchField.getAttribute("value");
    }
}