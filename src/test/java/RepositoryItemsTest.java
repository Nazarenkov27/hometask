import com.qa.hometask.utils.PropertyLoader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepositoryItemsTest extends TestBase {
    private int expectedDirectoriesNumber = 3;
    private int expectedFilesNumber = 6;

    @Test(groups = "login")
    public void repositoryItemsTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
       // driver.navigate().to(PropertyLoader.loadProperty("github.link") + "bonigarcia/webdrivermanager");
        app.getNavigationHelper().goToGithubLink("bonigarcia/webdrivermanager/");
        Assert.assertEquals(app.getAttributesHelper().getDirectoriesNumber(), expectedDirectoriesNumber);
        Assert.assertEquals(app.getAttributesHelper().getFilesNumber(), expectedFilesNumber);
    }
}
