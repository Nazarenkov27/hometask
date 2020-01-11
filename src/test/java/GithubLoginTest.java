import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest extends TestBase {

    @Test(groups = "login")
    @Description ("Check successful login (correct login/password combination)")
    public void githubLoginTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getUserHelper().showMenu();
        Assert.assertEquals(PropertyLoader.loadProperty("github.login"), app.getUserHelper().getProfileName());
    }
}