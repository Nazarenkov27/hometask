import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageCountTest extends TestBase {
    @Test(groups = "login")
    @Description ("Check the counter of the programming language")
    public void languageCountTest() {
        app.getNavigationHelper().goToGithubLink();
        app.getRepoHelper().searchForRepo("Java");
        System.out.println("Language count is: " + app.getRepoHelper().getLanguageValue("C++"));
        Assert.assertTrue(app.getRepoHelper().getLanguageValue("C++") > 0);
    }
}