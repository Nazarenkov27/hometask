import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest extends TestBase {

    String login = "Nazarenkov27";
    String pass = "d711815n";

    @Test
    public void githubLoginTest() {
        driver.navigate().to("https://github.com/login");
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
        homePage.showMenu();
        Assert.assertEquals(login, homePage.getProfileName());
    }
}
