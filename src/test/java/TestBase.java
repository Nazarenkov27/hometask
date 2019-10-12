import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import java.io.File;

@Listeners
class TestBase {

    WebDriver driver;

    @BeforeSuite
    public void before() {
        File chromeDriver = new File ("d://chromedriver/chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();
        ChromeOptions options = new ChromeOptions().addArguments("--start-maximized"); //window size doesn't work here
        driver = new ChromeDriver(service, options);
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();

    }
}


