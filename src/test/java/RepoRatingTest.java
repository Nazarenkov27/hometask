import com.qa.hometask.utils.CustomerTestListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class RepoRatingTest extends TestBase {

    @Test
    @Description("Check the repository rating counter")
    public void repoRatingTest() {
        app.getNavigationHelper().goToGithubLink();
        app.getRepoHelper().searchForRepo("Java");
        Assert.assertTrue(app.getRepoHelper().getRatingSum() > 0);
    }
}