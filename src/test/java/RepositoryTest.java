import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryTest extends TestBase {
    int expectedItemsNumber = 9;

    @Test
    public void repositoryTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        int actualItemsNumber = app.getUserHelper().repositoryPage.getFilesNumber() + app.getUserHelper().repositoryPage.getDirectoriesNumber();
        Assert.assertEquals(actualItemsNumber, expectedItemsNumber);
    }
}