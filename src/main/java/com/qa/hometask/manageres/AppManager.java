package com.qa.hometask.manageres;

import com.qa.hometask.helpers.*;
import com.qa.hometask.utils.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class AppManager {
    private UserHelper userHelper;
    private NavigationHelper navigationHelper;
    private NotificationsHelper notificationsHelper;
    private AttributesHelper attributesHelper;
    private RepoHelper repoHelper;
    private static WebDriver driver;

    AppManager() {
        String browserName = PropertyLoader.loadProperty("browser.name");
        switch (browserName) {
            case "chrome":
            {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions()
                        .addArguments("--window-size=1920,1080")
                        .addArguments(PropertyLoader.loadProperty("driver.props"));
                driver = new ChromeDriver(options);
            }
                break;
            case "firefox":
                {
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options = new FirefoxOptions()
                            .addArguments("--window-size=1920,1080")
                            .addArguments(PropertyLoader.loadProperty("driver.props"));
                    driver = new FirefoxDriver();
                }
            break;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
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
