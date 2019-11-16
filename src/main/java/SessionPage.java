import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SessionPage extends Page {
    SessionPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//*[@id='js-flash-container']")
    private WebElement errorAlert;
    @FindBy(xpath = "//button[contains(@class, 'js-flash-close')]")
    private WebElement closeAlertButton;

    public String getAlertMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorAlert));
        return errorAlert.getText();
    }

    public void closeAlert() {
        wait.until(ExpectedConditions.visibilityOf(closeAlertButton));
        closeAlertButton.click();
    }
}