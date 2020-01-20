package com.qa.hometask.manageres;

import com.qa.hometask.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageManager {

    public static WebDriver driver;
    public HomePage homePage;
    public SearchPage searchPage;
    public LogInPage logInPage;
    public BlogPage blogPage;
    public RepositoryPage repositoryPage;
    public SessionPage sessionPage;
    public NotificationsPage notificationsPage;
    public AboutPage aboutPage;
    public TwitterPage twitterPage;

    public PageManager(WebDriver webDriver) {
        this.driver = webDriver;
        homePage = initElements(new HomePage(this));
        searchPage = initElements(new SearchPage(this));
        logInPage = initElements(new LogInPage(this));
        blogPage = initElements(new BlogPage(this));
        repositoryPage = initElements(new RepositoryPage(this));
        sessionPage = initElements(new SessionPage(this));
        notificationsPage = initElements(new NotificationsPage(this));
        aboutPage = initElements(new AboutPage(this));
        twitterPage = initElements(new TwitterPage(this));
    }

    private <T extends Page> T initElements(T page) {
        PageFactory.initElements(driver, page);
        return page;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
