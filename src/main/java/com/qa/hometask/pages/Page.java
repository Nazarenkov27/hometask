package com.qa.hometask.pages;

import com.qa.hometask.manageres.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    public WebDriver driver;
    public WebDriverWait wait;
    private WebDriverWait shortWait;
    private Actions actions;

    Page(PageManager pages) {
        this.driver = pages.getDriver();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        shortWait = new WebDriverWait(driver, 3);
    }
}
