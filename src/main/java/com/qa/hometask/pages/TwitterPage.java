package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TwitterPage extends Page {
    public TwitterPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-15d164r r-1g94qm0']//span[text() = 'GitHub']")
    private WebElement twitterName;
    @FindBy(xpath = "//span[text() = 'GitHub']/../../span[2]")
    private WebElement verifiedIcon;

    @Step("Check if twitter account if verified")
    public boolean verifyTwitterAccount() {
        wait.until(ExpectedConditions.visibilityOf(verifiedIcon));
        return verifiedIcon.isDisplayed();
    }

    @Step("Get the twitter name")
    public String getTwitterName() {
        wait.until(ExpectedConditions.visibilityOf(twitterName));
        return twitterName.getText();
    }

    @Step("Get the twitter link")
    public String getTwitterLink() {
        return driver.getCurrentUrl();
    }
}
