import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends TestBase {

    String login = "Nazarenkov27";
    String pass = "d711815n";
    String logoName = "The GitHub Blog";
    String allPostsHeader = "All posts";

    @Test
    public void blogTest() {
        driver.navigate().to("https://github.com/login");
        logInPage.loginInput(login);
        logInPage.passwordInput(pass);
        logInPage.loginSubmit();
        homePage.goToBlog();
        Assert.assertEquals(logoName, blogPage.getLogoName());
        Assert.assertEquals(allPostsHeader, blogPage.getPostsHeader());
    }
}