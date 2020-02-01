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
        // loginAs occurs 5 times, might be useful to move it to TestBase as method login() or so
        // in that case if implementation of login needs to be changed - it could be done in one method in TestBase
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getNavigationHelper().goToGithubLink("bonigarcia/webdrivermanager");
        int actualItemsNumber = app.getAttributesHelper().getFilesNumber() + app.getAttributesHelper().getDirectoriesNumber();
        Assert.assertEquals(actualItemsNumber, expectedItemsNumber);
    }
}