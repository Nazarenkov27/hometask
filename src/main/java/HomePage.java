import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = "//summary[contains(@aria-label,'View profile')]")
    private WebElement detailsMenu;
    @FindBy(xpath = "//a[@role='menuitem']/strong")
    private WebElement profileLink;
    @FindBy(xpath = "//*[contains(@href, 'blog')]")
    private WebElement blogLink;

    public void showMenu() {
        wait.until(ExpectedConditions.visibilityOf(detailsMenu));
        detailsMenu.click();
    }

    public String getProfileName() {
        wait.until(ExpectedConditions.visibilityOf(profileLink));
        return profileLink.getText();
    }

    public void goToBlog() {
        wait.until(ExpectedConditions.visibilityOf(blogLink));
        blogLink.click();
    }



}