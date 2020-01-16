import com.qa.hometask.utils.CustomerTestListener;
import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class RepositoryTest extends TestBase {
    int expectedItemsNumber = 9;

    @Test(groups = "login")
    @Description("Check the number of items in the repository")
    public void repositoryTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getNavigationHelper().goToGithubLink("bonigarcia/webdrivermanager");
        int actualItemsNumber = app.getAttributesHelper().getFilesNumber() + app.getAttributesHelper().getDirectoriesNumber();
        Assert.assertEquals(actualItemsNumber, expectedItemsNumber);
    }
}