import com.qa.hometask.utils.CustomerTestListener;
import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class NotificationsTest extends TestBase {

    int expectedTabsNumber = 3;
    String expectedTabName = "Notifications";

    @Test(groups = "login")
    @Description ("Notifications counter test")
    public void notificationsTest() {
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getNavigationHelper().openNotificationsPage();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty("github.link") + "notifications");
        Assert.assertEquals(app.getAttributesHelper().getTabsNumber(), expectedTabsNumber);
        Assert.assertEquals(app.getAttributesHelper().getFirstTabName(), expectedTabName);
    }

}
