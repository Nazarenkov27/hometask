import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTaskTest extends TestBase {

    String login = "Nazarenkov27";
    String pass = "d711815n";
    String signInButtonLocator = "//a[@href = '/login' ]";
    String signInFieldLocator = "//input[@name = 'login' ]";
    String passwordFieldLocator = "//input[@name = 'password' ]";
    String signInLocator = "//input[@type= 'submit']";
    String detailsMenuLocator = "//summary[contains(@aria-label,'View profile')]";
    String profileLinkLocator = "//a[@role='menuitem']/strong";

    @Test
    public void githubLoginTest() {

        driver.navigate().to("https://github.com/");
        driver.findElement(By.xpath(signInButtonLocator)).click();
        WebElement signInField = driver.findElement(By.xpath(signInFieldLocator));
        signInField.clear();
        signInField.sendKeys(login);
        WebElement passwordField = driver.findElement(By.xpath(passwordFieldLocator));
        passwordField.clear();
        passwordField.sendKeys(pass);
        driver.findElement(By.xpath(signInLocator)).click();
        driver.findElement(By.xpath(detailsMenuLocator)).click();
        WebElement profileLink = driver.findElement(By.xpath(profileLinkLocator));
        Assert.assertEquals(login, profileLink.getText());

    }

}
