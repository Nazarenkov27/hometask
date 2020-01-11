import com.qa.hometask.utils.PropertyLoader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedLoginTest extends TestBase {

    public String wrongLogin = "Fakelogin";
    public String alertMessage = "Incorrect username or password.";

    @Test(groups = "login")
    @Description ("Check unsuccessful login (wrong login/password combination)")
    public void failedLoginTest() {
        app.getUserHelper().loginAs(wrongLogin, PropertyLoader.loadProperty("github.pass"));
        Assert.assertEquals(alertMessage, app.getNotificationsHelper().getAlertMessage());
        app.getNotificationsHelper().closeAlert();
        Assert.assertNotEquals(driver.getCurrentUrl(), PropertyLoader.loadProperty("github.link"));
    }
}
