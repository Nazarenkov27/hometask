import com.qa.hometask.utils.PropertyLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryTest extends TestBase {
    int expectedItemsNumber = 9;

    @Test(groups = "login")
    public void repositoryTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getNavigationHelper().goToGithubLink("bonigarcia/webdrivermanager");
        int actualItemsNumber = app.getAttributesHelper().getFilesNumber() + app.getAttributesHelper().getDirectoriesNumber();
        Assert.assertEquals(actualItemsNumber, expectedItemsNumber);
    }
}