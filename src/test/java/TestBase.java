import com.qa.hometask.manageres.AppManager;
import com.qa.hometask.manageres.SingletonAppManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

class TestBase {
    AppManager app = SingletonAppManager.getInstance().manager;
    WebDriver driver = AppManager.getWebDriver();

    @BeforeMethod
    @Step("Go to the main page")
    public void before() {
        app.getNavigationHelper().goToGithubLink();
    }

    @BeforeMethod(onlyForGroups = "login")
    @Step("Go to the log in page")
    public void beforeLogin() {
        app.getNavigationHelper().goToGithubLink("login/");
    }

    @AfterMethod()
    @Step("Log the user out")
    public void afterMethod() {
        app.getNavigationHelper().goToGithubLink("logout/");
        driver.manage().deleteAllCookies();
    }

    @AfterSuite()
    public void tearDown() {
        AppManager.getWebDriver().quit();
    }
}