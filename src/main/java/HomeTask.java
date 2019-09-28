import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

    public class HomeTask {
        @Test

        public void githubLoginTest() throws InterruptedException {

            String login = "Nazarenkov27";
            String pass = "sc98090um";
            System.setProperty("webdriver.chrome.driver", "d://chromedriver/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://github.com/");
            WebElement signInButton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]"));
            signInButton.click();
            WebElement signInField = driver.findElement(By.xpath("//*[@id=\"login_field\"]"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            signInField.sendKeys(login);
            password.sendKeys(pass);
            WebElement signIn = driver.findElement(By.xpath("/html/body/div[3]/main/div/form/div[3]/input[8]"));
            signIn.click();
            WebElement detailsMenu = driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary"));
            detailsMenu.click();
            WebElement profileLink = driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/div[1]/a/strong"));
            String profile = profileLink.getText();
            assert login.equals(profile);
            driver.quit();


        }
    }
