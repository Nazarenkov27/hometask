import org.testng.Assert;
import org.testng.annotations.Test;

public class RepoRatingTest extends TestBase {

        @Test
        public void repoRatingTest()  {
            app.getNavigationHelper().goToGithubLink("");
            app.getRepoHelper().searchForRepo("Java");
//            List<String> repoRating = app.getRepoHelper().getRepoRatingValue();
//            System.out.println(repoRating);
//            System.out.println(app.getRepoHelper().getRatingSum());
            Assert.assertTrue(app.getRepoHelper().getRatingSum() > 0);
        }
}
