import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryItemsTest extends TestBase {
    String login = "Nazarenkov27";
    String pass = "d711815n";
    int expectedDirectoriesNumber = 3;
    int expectedFilesNumber = 6;

    @Test
    public void repositoryItemsTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        Assert.assertEquals(repositoryPage.getDirectoriesNumber(), expectedDirectoriesNumber);
        Assert.assertEquals(repositoryPage.getFilesNumber(), expectedFilesNumber);
    }
}
