import com.qa.hometask.utils.CustomerTestListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class FollowTwitterTest extends TestBase {

    String expectedName = "GitHub";
    String expectedLink = "https://twitter.com/github";

    @Test
    @Description("Check the transition ot the proper twitter page")
    public void followTwitter() {
        app.getNavigationHelper().goToGithubLink("about/");
        app.getNavigationHelper().goToTwitter();
        Assert.assertEquals(app.getAttributesHelper().getTwitterLink(), expectedLink);
        Assert.assertEquals(app.getAttributesHelper().getTwitterName(), expectedName);
        Assert.assertTrue(app.getAttributesHelper().verifyTwitterAccount());
    }
}
