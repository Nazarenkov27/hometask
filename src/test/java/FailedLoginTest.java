import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedLoginTest extends TestBase {

    public String wrongLogin = "Fakelogin";
    public String alertMessage = "Incorrect username or password.";

    @Test
    public void failedLoginTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link") + "login/");
        app.getUserHelper().loginAs(wrongLogin, PropertyLoader.loadProperty("github.pass"));
        Assert.assertEquals(alertMessage, app.getUserHelper().getAlertMessage());
        app.getUserHelper().closeAlert();
        Assert.assertNotEquals(PropertyLoader.loadProperty("github.link") + "session/", driver.getCurrentUrl());
    }
}
