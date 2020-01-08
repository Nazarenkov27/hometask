import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends TestBase {

    String logoName = "The GitHub Blog";
    String allPostsHeader = "All posts";
    @Description("Blog page test")
    @Test(groups = "login")
    public void blogTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getNavigationHelper().goToBlog();
        Assert.assertEquals(logoName, app.getAttributesHelper().getLogoName());
        Assert.assertEquals(allPostsHeader, app.getAttributesHelper().getPostsHeader());
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.blog/");
    }
}