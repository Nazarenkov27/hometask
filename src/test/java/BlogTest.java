import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends TestBase {

    String logoName = "The GitHub Blog";
    String allPostsHeader = "All posts";

    @Test
    public void blogTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getUserHelper().goToBlog();
        Assert.assertEquals(logoName, app.getUserHelper().getLogoName());
        Assert.assertEquals(allPostsHeader, app.getUserHelper().getPostsHeader());
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.blog/");
    }
}