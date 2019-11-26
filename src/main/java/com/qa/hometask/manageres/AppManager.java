package com.qa.hometask.manageres;

import com.qa.hometask.helpers.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AppManager {
    private UserHelper userHelper;
    private NavigationHelper navigationHelper;
    private NotificationsHelper notificationsHelper;
    private AttributesHelper attributesHelper;
    private RepoHelper repoHelper;
    private static WebDriver driver;
    private WebDriverWait wait;

    AppManager() {
        WebDriverManager.chromedriver().version("78.0.3904.70").setup();
        ChromeOptions options = new ChromeOptions().addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        userHelper = new UserHelper();
        navigationHelper = new NavigationHelper();
        notificationsHelper = new NotificationsHelper();
        attributesHelper = new AttributesHelper();
        repoHelper = new RepoHelper();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public NotificationsHelper getNotificationsHelper() {
        return notificationsHelper;
    }

    public AttributesHelper getAttributesHelper() {
        return attributesHelper;
    }

    public RepoHelper getRepoHelper() {
        return repoHelper;
    }

}
