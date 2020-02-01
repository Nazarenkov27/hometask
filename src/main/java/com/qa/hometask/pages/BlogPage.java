package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlogPage extends Page {

    @FindBy(xpath = "//*[contains(@class,'site-branding')]/h1")
    private WebElement blogLogo;
    @FindBy(xpath = "//*[contains(@class,'all-posts')]/h3")
    private WebElement allPostsHeader;

    public BlogPage(PageManager pages) {
        super(pages);
    }

    @Step("Get the logo name")
    public String getLogoName() {
        wait.until(ExpectedConditions.visibilityOf(blogLogo));
        return blogLogo.getText();
    }

    @Step("Get the header of the post")
    public String getPostsHeader() {
        wait.until(ExpectedConditions.visibilityOf(allPostsHeader));
        return allPostsHeader.getText();
    }
}