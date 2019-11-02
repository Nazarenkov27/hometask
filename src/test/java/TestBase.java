import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners
class TestBase {

    WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;
    LogInPage logInPage;
    BlogPage blogPage;

    @BeforeTest
    public void before() throws IOException {

        File chromeDriver = new File(PropertyLoader.loadProperty("chrome.driver.path"));
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();
        ChromeOptions options = new ChromeOptions().addArguments("--start-maximized"); //window size doesn't work here
        driver = new ChromeDriver(service, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}