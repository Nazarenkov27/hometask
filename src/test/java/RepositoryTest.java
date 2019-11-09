import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryTest extends TestBase {
    String login = "Nazarenkov27";
    String pass = "d711815n";
    int itemsNumber = 9;

    @Test
    public void repositoryTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        Assert.assertEquals(repositoryPage.filesCounter() + repositoryPage.directoriesCounter(), itemsNumber);
    }
}