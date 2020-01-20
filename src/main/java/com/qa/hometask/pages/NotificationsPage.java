package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class NotificationsPage extends Page {
    public NotificationsPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//nav[@class ='tabnav-tabs']/a")
    private List<WebElement> tabsList;

    public int getTabsNumber() {
        wait.until(ExpectedConditions.visibilityOf(tabsList.get(0)));
        int tabsNumber = tabsList.size();
        return tabsNumber;
    }

    public String getFirstTabName() {
        wait.until(ExpectedConditions.visibilityOf(tabsList.get(0)));
        return tabsList.get(0).getText();
    }
}