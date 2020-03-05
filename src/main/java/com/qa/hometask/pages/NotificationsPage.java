package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class NotificationsPage extends Page {
    public NotificationsPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//nav[@aria-label='Notifications']/ul[1]/li")
    private List<WebElement> tabsList;

    @Step("Get the number of tabs")
    public int getTabsNumber() {
        wait.until(ExpectedConditions.visibilityOf(tabsList.get(0)));
        return tabsList.size();
    }

    @Step("Get the name of the first tab")
    public String getFirstTabName() {
        wait.until(ExpectedConditions.visibilityOf(tabsList.get(0)));
        return tabsList.get(0).getText();
    }
}