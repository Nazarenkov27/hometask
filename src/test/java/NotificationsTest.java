import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationsTest extends TestBase {

    int expectedTabsNumber = 3;
    String expectedTabName = "Notifications";

    @Test
    public void notificationsTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(PropertyLoader.loadProperty("github.login"), PropertyLoader.loadProperty("github.pass"));
        app.getUserHelper().openNotificationsPage();
        Assert.assertEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty("github.link") + "notifications");
        Assert.assertEquals(app.getUserHelper().getTabsNumber(), expectedTabsNumber);
        Assert.assertEquals(app.getUserHelper().getFirstTabName(), expectedTabName);
    }

}
