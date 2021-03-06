import com.qa.hometask.utils.CustomerTestListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class ViewerTest extends TestBase {
    @Test
    @Description("Check the repository search")
    public void viewerTest() {
        app.getNavigationHelper().goToGithubLink();
        app.getRepoHelper().searchForRepo("Java");
        Assert.assertTrue(driver.getCurrentUrl().contains("q=Java"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/search?q=Java");
        Assert.assertEquals(app.getRepoHelper().getSearchValue(), "Java");
    }
}
