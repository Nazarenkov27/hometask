package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TwitterPage extends Page {
    public TwitterPage(PageManager pages) {
        super(pages);
    }

    @FindBy (xpath = "//h1/a")
    private WebElement twitterName;
    @FindBy (xpath = "//h1/span/a/span[contains(@class, 'verified')]")
    private WebElement verifiedIcon;

    public boolean verifyTwitterAccount() {
        wait.until(ExpectedConditions.visibilityOf(verifiedIcon));
        return verifiedIcon.isDisplayed();
    }

    public String getTwitterName(){
        wait.until(ExpectedConditions.visibilityOf(twitterName));
        return twitterName.getText();
    }

    public String getTwitterLink(){
        return driver.getCurrentUrl();
    }
}
