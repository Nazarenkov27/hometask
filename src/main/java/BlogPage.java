import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlogPage extends Page {

    @FindBy(xpath = "//*[contains(@class,'site-branding')]/h1")
    private WebElement blogLogo;
    @FindBy(xpath = "//*[contains(@class,'all-posts')]/h3")
    private WebElement allPostsHeader;

    BlogPage(PageManager pages) {
        super(pages);
    }

    public String getLogoName() {
        wait.until(ExpectedConditions.visibilityOf(blogLogo));
        return blogLogo.getText();
    }

    public String getPostsHeader() {
        wait.until(ExpectedConditions.visibilityOf(allPostsHeader));
        return allPostsHeader.getText();
    }
}