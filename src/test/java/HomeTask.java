import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTask {

        @Test

        public void githubLoginTest()  {
            String login = "Nazarenkov27";
            String pass = "d711815n";
            System.setProperty("webdriver.chrome.driver", "d://chromedriver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://github.com/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@href = '/login' ]"));
            signInButton.click();
            WebElement signInField = driver.findElement(By.xpath("//input[@name = 'login' ]"));
            WebElement password = driver.findElement(By.xpath("//input[@name = 'password' ]"));
            signInField.sendKeys(login);
            password.sendKeys(pass);
            WebElement signIn = driver.findElement(By.xpath("//input[@type= 'submit']"));
            signIn.click();
            WebElement detailsMenu = driver.findElement(By.xpath("//summary[contains(@aria-label,'View profile')]"));
            detailsMenu.click();
            WebElement profileLink = driver.findElement(By.xpath("//*/a[@role='menuitem']/strong"));
            Assert.assertEquals(login, profileLink.getText());

            driver.quit();

             }

    }
