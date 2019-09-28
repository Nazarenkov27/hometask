import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

    public class HomeTask {

        public void githubLoginTest() throws InterruptedException {

            String login = "Nazarenkov27";
            String pass = "sc98090um";
            System.setProperty("webdriver.chrome.driver", "d://chromedriver/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://github.com/");
           // Thread.sleep(5000);  // Let the user actually see something!
            WebElement signInButton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]"));
            signInButton.click();
            WebElement signIn = driver.findElement(By.xpath("//*[@id=\"login_field\"]"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            signIn.sendKeys(login);
            password.sendKeys(pass);
            WebElement signIn = driver.findElement(By.xpath("/html/body/div[3]/main/div/form/div[3]/input[8]"));
            signIn.click();

            //Thread.sleep(5000);  // Let the user actually see something!
            driver.quit();


        }
    }
