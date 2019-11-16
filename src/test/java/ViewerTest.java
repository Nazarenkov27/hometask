import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewerTest extends TestBase {
    @Test
    public void viewerTest() {
        driver.navigate().to(PropertyLoader.loadProperty("github.link"));
        app.getUserHelper().searchForRepo("Java");
        app.getUserHelper().selectFirstResult();
        Assert.assertTrue(driver.getCurrentUrl().contains("q=Java"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/search?q=Java");
        Assert.assertEquals(app.getUserHelper().getSearchValue(), "Java");
    }
}
