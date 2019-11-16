import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends Page {

    SearchPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "(id('jump-to-results')/li)[2]")
    private WebElement firstSearchResult;

    public void selectFirstSearchResult() {
        wait.until(ExpectedConditions.visibilityOf(firstSearchResult));
        firstSearchResult.click();
    }
}
