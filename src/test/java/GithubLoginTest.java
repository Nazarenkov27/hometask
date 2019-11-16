import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest extends TestBase {

    @Test
    public void githubLoginTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getUserHelper().showMenu();
        Assert.assertEquals(PropertyLoader.loadProperty("github.login"), app.getUserHelper().getProfileName());
    }
}