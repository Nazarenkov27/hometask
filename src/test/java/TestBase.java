import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners
class TestBase {

    WebDriver driver;
    WebDriver ffdriver;
    private WebDriverWait wait;
    HomePage homePage;
    LogInPage logInPage;

    @BeforeSuite
    public void before() {

        WebDriverManager.chromedriver().version("78.0.3904.70").setup();
        ChromeOptions options = new ChromeOptions().addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);

        WebDriverManager.firefoxdriver().setup();
        ffdriver = new FirefoxDriver();

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
        ffdriver.quit();
    }
}