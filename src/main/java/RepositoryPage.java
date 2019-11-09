import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RepositoryPage {

    private WebDriverWait wait;

    public RepositoryPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = "//tbody/tr[td[@class='icon']/*[name()='svg'][@aria-label='file']]")
    private List<WebElement> filesList;
    @FindBy(xpath = "//tbody/tr[td[@class='icon']/*[name()='svg'][@aria-label='directory']]")
    private List<WebElement> directoriesList;

    public int filesCounter() {
        wait.until(ExpectedConditions.visibilityOf(filesList.get(0)));
        int filesCount = filesList.size();
        return filesCount;
    }

    public int directoriesCounter() {
        wait.until(ExpectedConditions.visibilityOf(directoriesList.get(0)));
        int directoriesCount = directoriesList.size();
        return directoriesCount;
    }
}
