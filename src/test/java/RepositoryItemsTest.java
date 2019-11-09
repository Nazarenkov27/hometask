import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryItemsTest extends TestBase {
    String login = "Nazarenkov27";
    String pass = "d711815n";
    int directoriesNumber = 3;
    int filesNumber = 6;

    @Test
    public void repositoryItemsTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        Assert.assertEquals(repositoryPage.directoriesCounter(), directoriesNumber);
        Assert.assertEquals(repositoryPage.filesCounter(), filesNumber);
    }
}
