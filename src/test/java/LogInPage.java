import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    private WebDriverWait wait;

    public LogInPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = "//input[@name = 'login' ]")
    private WebElement logInField;
    @FindBy(xpath = "//input[@name = 'password' ]")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@type= 'submit']")
    private WebElement signInButton;


    public void loginInput(String text) {
        wait.until(ExpectedConditions.visibilityOf(logInField));
        logInField.clear();
        logInField.sendKeys(text);
    }

    public void passwordInput(String text) {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void loginSubmit() {
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();
    }
}
