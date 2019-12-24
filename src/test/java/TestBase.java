import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.SingletonAppManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

class TestBase {
    AppManager app = SingletonAppManager.getInstance().manager;
    WebDriver driver = AppManager.getWebDriver();

    @BeforeMethod(onlyForGroups = "login")
    public void beforeLogin() {
        app.getNavigationHelper().goToGithubLink("login/");
    }

    @BeforeMethod
    public void before() {
        app.getNavigationHelper().goToGithubLink();
    }

    @AfterMethod()
    public void afterMethod() {
        app.getNavigationHelper().goToGithubLink("logout/");
        driver.manage().deleteAllCookies();
    }

    @AfterSuite()
    public void tearDown() {
        AppManager.getWebDriver().quit();
    }
}