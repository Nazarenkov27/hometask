import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage {
    private WebDriverWait wait;

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = "//*[contains(@class,'site-branding')]/h1")
    private WebElement blogLogo;
    @FindBy(xpath = "//*[contains(@class,'all-posts')]/h3")
    private WebElement allPostsHeader;

    public String getLogoName() {
        wait.until(ExpectedConditions.visibilityOf(blogLogo));
        return blogLogo.getText();
    }

    public String getPostsHeader() {
        wait.until(ExpectedConditions.visibilityOf(allPostsHeader));
        return allPostsHeader.getText();
    }
}