import com.qa.hometask.utils.CustomerTestListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(CustomerTestListener.class)
public class SearchResultTest extends TestBase {
    @Test
    @Description("Check the sorting of search results")
    public void searchResultTest() {
        app.getNavigationHelper().goToGithubLink();
        app.getRepoHelper().searchForRepo("Java");
        List<String> bestMatchRepoList = app.getRepoHelper().getRepoListValue();
        app.getRepoHelper().sortByFewerStars();
        List<String> fewerStarsRepoList = app.getRepoHelper().getRepoListValue();
        Assert.assertNotEquals(bestMatchRepoList, fewerStarsRepoList);
    }
}
