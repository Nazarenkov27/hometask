package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutPage extends Page {
    public AboutPage(PageManager pages) {
        super(pages);
    }

    @FindBy (xpath = "//div/a[contains(@href, 'twitter')]")
    private WebElement followButton;

    public void followTwitter() {
        wait.until(ExpectedConditions.visibilityOf(followButton));
        followButton.click();
    }
}
