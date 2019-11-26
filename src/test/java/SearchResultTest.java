import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchResultTest extends TestBase {
    @Test
    public void searchResultTest() throws InterruptedException {
        app.getNavigationHelper().goToGithubLink("");
        app.getRepoHelper().searchForRepo("Java");
        List<String> bestMatchRepoList = app.getRepoHelper().getRepoListValue();
        app.getRepoHelper().sortByFewerStars();
        List<String> fewerStarsRepoList = app.getRepoHelper().getRepoListValue();
        Assert.assertNotEquals(bestMatchRepoList,fewerStarsRepoList);
    }
}
