import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

class TestBase {
    AppManager app = SingletonAppManager.getInstance().manager;
    WebDriver driver = AppManager.getWebDriver();

    @BeforeMethod()
    public void beforeMethod() {
        driver.manage().deleteAllCookies();
        driver.navigate().to(PropertyLoader.loadProperty("github.link"));
    }

    @AfterMethod()
    public void afterMethod() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "logout/");
    }

    @AfterSuite()
    public void tearDown() {
        AppManager.getWebDriver().quit();
    }
}