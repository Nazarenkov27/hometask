import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends Page {

    @FindBy(xpath = "//input[@name = 'login' ]")
    private WebElement logInField;
    @FindBy(xpath = "//input[@name = 'password' ]")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@type= 'submit']")
    private WebElement signInButton;

    LogInPage(PageManager pages) {
        super(pages);
    }

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
