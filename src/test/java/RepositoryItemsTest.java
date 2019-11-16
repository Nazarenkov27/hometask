import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryItemsTest extends TestBase {
    private int expectedDirectoriesNumber = 3;
    private int expectedFilesNumber = 6;

    @Test
    public void repositoryItemsTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        Assert.assertEquals(app.getUserHelper().getDirectoriesNumber(), expectedDirectoriesNumber);
        Assert.assertEquals(app.getUserHelper().getFilesNumber(), expectedFilesNumber);
    }
}
